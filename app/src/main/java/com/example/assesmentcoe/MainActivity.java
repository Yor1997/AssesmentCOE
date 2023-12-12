package com.example.assesmentcoe;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private RecyclerView recyclerView;
    private List<String> itemList;
    private LicencePlateRecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.edt_LicencePlate);
        recyclerView = findViewById(R.id.rv_LicencePlate);

        itemList = new ArrayList<>();
        adapter = new LicencePlateRecyclerViewAdapter(itemList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(adapter);

        Button addButton = findViewById(R.id.btn_Add);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addItem();
            }
        });
    }

    private void addItem() {
        String newItem = editText.getText().toString().trim();
        if (!newItem.isEmpty()) {
            itemList.add(newItem);
            adapter.notifyDataSetChanged();
            editText.getText().clear();
        }
    }
}
