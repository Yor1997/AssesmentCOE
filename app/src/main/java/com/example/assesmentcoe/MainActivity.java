package com.example.assesmentcoe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private RecyclerView recyclerView;
    private List<String> carList;
    private LicencePlateRecyclerViewAdapter adapter;
    private GekentekendeVoertuigenApiService apiService;
    private GekentekendeVoertuigenBrandstofApiService brandstofApiService;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.edt_LicencePlate);
        recyclerView = findViewById(R.id.rv_LicencePlate);

        carList = new ArrayList<>();

        adapter = new LicencePlateRecyclerViewAdapter(carList, new LicencePlateRecyclerViewAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                removeItem(position);
            }
        });

        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        apiService = ApiClientGekentekendeVoertuigen.getVoertuigApi();
        brandstofApiService =ApiClientGekentekendeVoertuigenBrandstof.getVoertuigApi();

        Button addButton = findViewById(R.id.btn_Add);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addItem();
            }
        });

        Button searchButton = findViewById(R.id.btn_Search);
            searchButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    makeApiCall();
                }
            });
        }

    private void removeItem(int position) {
        carList.remove(position);
        adapter.notifyItemRemoved(position);
        adapter.notifyItemRangeChanged(position, carList.size());
    }

    private void addItem() {
        String newItem = editText.getText().toString().trim();
        if (!newItem.isEmpty()) {
            if (carList.size() >= 2) {
                Toast.makeText(MainActivity.this, "U kunt maximaal twee kentekens vergelijken.", Toast.LENGTH_SHORT).show();
            }else {
                carList.add(newItem);
                adapter.notifyDataSetChanged();
                editText.getText().clear();
            }
        }
    }

    private void makeApiCall() {
        if (carList.isEmpty()) {
            return;
        } else if (carList.size() == 1) {
            return;
        }

        String kenteken1 = carList.get(carList.size() - 1);
        String kenteken2 = carList.get(carList.size() - 2);

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        try {
            Future<List<Voertuig>> futureCall1Car1 = executorService.submit(() -> {
                Response<List<Voertuig>> response = apiService.getVoertuigDetails(kenteken1).execute();
                return response.body();
            });

            Future<List<VoertuigBrandstof>> futureCall2Car1 = executorService.submit(() -> {
                Response<List<VoertuigBrandstof>> response = brandstofApiService.getVoertuigBrandstofDetails(kenteken1).execute();
                return response.body();
            });

            Future<List<Voertuig>> futureCall1Car2 = executorService.submit(() -> {
                Response<List<Voertuig>> response = apiService.getVoertuigDetails(kenteken2).execute();
                return response.body();
            });

            Future<List<VoertuigBrandstof>> futureCall2Car2 = executorService.submit(() -> {
                Response<List<VoertuigBrandstof>> response = brandstofApiService.getVoertuigBrandstofDetails(kenteken2).execute();
                return response.body();
            });

            List<Voertuig> detailsList1Car1 = futureCall1Car1.get();
            List<VoertuigBrandstof> detailsList2Car1 = futureCall2Car1.get();

            List<Voertuig> detailsList1Car2 = futureCall1Car2.get();
            List<VoertuigBrandstof> detailsList2Car2 = futureCall2Car2.get();

            if (!detailsList1Car1.isEmpty() && !detailsList2Car1.isEmpty()) {
                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                intent.putExtra("voertuigListCar1", (Serializable) detailsList1Car1);
                intent.putExtra("secondVoertuigListCar1", (Serializable) detailsList2Car1);
                intent.putExtra("voertuigListCar2", (Serializable) detailsList1Car2);
                intent.putExtra("secondVoertuigListCar2", (Serializable) detailsList2Car2);
                startActivity(intent);
                finish();
            } else {
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
    }

}
