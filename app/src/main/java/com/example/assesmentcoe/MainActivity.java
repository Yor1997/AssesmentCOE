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

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private RecyclerView recyclerView;
    private List<String> carList;
    private LicencePlateRecyclerViewAdapter adapter;
    private VoertuigApiService apiService;

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
        recyclerView.setAdapter(adapter);

        apiService = ApiClient.getVoertuigApi();

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
        String kenteken = null;

        if (!carList.isEmpty()) {
            kenteken = carList.get(carList.size() - 1);
        } else {
            return;
        }

        Call<List<Voertuig>> call = apiService.getVoertuigDetails(kenteken);

        System.out.println("Request URL: " + call.request().url());

        call.enqueue(new Callback<List<Voertuig>>() {
            @Override
            public void onResponse(Call<List<Voertuig>> call, Response<List<Voertuig>> response) {
                if (response.isSuccessful() && response.body() != null && !response.body().isEmpty()) {
                    List<Voertuig> detailsList = response.body();

                    Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                    intent.putExtra("voertuigList", (Serializable) detailsList);
                    startActivity(intent);
                } else {
                }
            }

            @Override
            public void onFailure(Call<List<Voertuig>> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }
}
