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
        }

        String kenteken = carList.get(carList.size() - 1);

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        try {
            // First API Call
            Future<List<Voertuig>> futureCall1 = executorService.submit(() -> {
                // Make the API call and return the result
                Response<List<Voertuig>> response = apiService.getVoertuigDetails(kenteken).execute();
                return response.body();
            });

            // Second API Call
            Future<List<VoertuigBrandstof>> futureCall2 = executorService.submit(() -> {
                // Make the API call and return the result
                Response<List<VoertuigBrandstof>> response = brandstofApiService.getVoertuigBrandstofDetails(kenteken).execute();
                return response.body();
            });

            // Get results of both calls
            List<Voertuig> detailsList1 = futureCall1.get();
            List<VoertuigBrandstof> detailsList2 = futureCall2.get();

            // Check if both calls were successful
            if (!detailsList1.isEmpty() && !detailsList2.isEmpty()) {
                // Both API calls were successful
                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                intent.putExtra("voertuigList", (Serializable) detailsList1);
                intent.putExtra("secondVoertuigList", (Serializable) detailsList2);
                startActivity(intent);
            } else {
                // Handle error for one or both API calls
            }
        } catch (Exception e) {
            e.printStackTrace();
            // Handle exception
        } finally {
            // Shutdown the ExecutorService
            executorService.shutdown();
        }
    }

}
