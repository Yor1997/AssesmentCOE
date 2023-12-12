package com.example.assesmentcoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        List<Voertuig> voertuigList = (List<Voertuig>) getIntent().getSerializableExtra("voertuigList");

        TextView kentekenTextViewCar1 = findViewById(R.id.tv_LicencePlate_Car1);
        TextView voertuigsoortTextViewCar1 = findViewById(R.id.tv_Type_Car1);
        TextView merkTextViewCar1 = findViewById(R.id.tv_Brand_Car1);
        TextView handelsbenamingTextViewCar1 = findViewById(R.id.tv_Model_Car1);
        TextView inrichtingTextViewCar1 = findViewById(R.id.tv_ModelType_Car1);
        TextView aantal_zitplaatsenTextViewCar1 = findViewById(R.id.tv_Seats_Car1);
        TextView eerste_kleurTextViewCar1 = findViewById(R.id.tv_Color_Car1);
        TextView catalogusprijsTextViewCar1 = findViewById(R.id.tv_Price_Car1);
        TextView aantal_deurenTextViewCar1 = findViewById(R.id.tv_Doors_Car1);

        if (voertuigList != null && !voertuigList.isEmpty()) {
            Voertuig voertuig = voertuigList.get(0);

            kentekenTextViewCar1.setText(voertuig.getKenteken());
            voertuigsoortTextViewCar1.setText(voertuig.getVoertuigsoort());
            merkTextViewCar1.setText(voertuig.getMerk());
            handelsbenamingTextViewCar1.setText(voertuig.getHandelsbenaming());
            inrichtingTextViewCar1.setText(voertuig.getInrichting());
            aantal_zitplaatsenTextViewCar1.setText(String.valueOf(voertuig.getAantal_zitplaatsen()));
            eerste_kleurTextViewCar1.setText(voertuig.getEerste_kleur());
            catalogusprijsTextViewCar1.setText(String.valueOf(voertuig.getCatalogusprijs()));
            aantal_deurenTextViewCar1.setText(String.valueOf(voertuig.getAantal_deuren()));
        }
    }
}