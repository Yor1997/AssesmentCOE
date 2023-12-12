package com.example.assesmentcoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class DetailsActivity extends AppCompatActivity {

    Double TotalSystemPower, PerformanceIndex;
    Integer EmptyMass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        List<Voertuig> voertuigList = (List<Voertuig>) getIntent().getSerializableExtra("voertuigList");
        List<VoertuigBrandstof> secondVoertuigList = (List<VoertuigBrandstof>) getIntent().getSerializableExtra("secondVoertuigList");

        TextView kentekenTextViewCar1 = findViewById(R.id.tv_LicencePlate_Car1);
        TextView voertuigsoortTextViewCar1 = findViewById(R.id.tv_Type_Car1);
        TextView merkTextViewCar1 = findViewById(R.id.tv_Brand_Car1);
        TextView handelsbenamingTextViewCar1 = findViewById(R.id.tv_Model_Car1);
        TextView inrichtingTextViewCar1 = findViewById(R.id.tv_ModelType_Car1);
        TextView aantal_zitplaatsenTextViewCar1 = findViewById(R.id.tv_Seats_Car1);
        TextView eerste_kleurTextViewCar1 = findViewById(R.id.tv_Color_Car1);
        TextView massa_ledig_voertuigTextViewCar1 = findViewById(R.id.tv_EmptyMass_Car1);
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
            massa_ledig_voertuigTextViewCar1.setText(String.valueOf(voertuig.getMassa_ledig_voertuig()));
            catalogusprijsTextViewCar1.setText(String.valueOf(voertuig.getCatalogusprijs()));
            aantal_deurenTextViewCar1.setText(String.valueOf(voertuig.getAantal_deuren()));
        }

        TextView brandstof_omschrijvingTextViewCar1 = findViewById(R.id.tv_Fuel_Car1);
        TextView brandstofverbruik_buitenTextViewCar1 = findViewById(R.id.tv_FuelOutdoor_Car1);
        TextView brandstofverbruik_gecombineerdTextViewCar1 = findViewById(R.id.tv_FuelCombined_Car1);
        TextView brandstofverbruik_stadTextViewCar1 = findViewById(R.id.tv_FuelCity_Car1);
        TextView co2_uitstoot_gecombineerdTextViewCar1 = findViewById(R.id.tv_CO2_Car1);
        TextView geluidsniveau_rijdendTextViewCar1 = findViewById(R.id.tv_NoiseDriving_Car1);
        TextView geluidsniveau_stationairTextViewCar1 = findViewById(R.id.tv_NoiseStationary_Car1);
        TextView nettomaximumvermogenTextViewCar1 = findViewById(R.id.tv_NetMaximum_Car1);
        TextView uitlaatemissieniveauTextViewCar1 = findViewById(R.id.tv_ExhaustEmission_Car1);

        if (secondVoertuigList != null && !secondVoertuigList.isEmpty()) {
            VoertuigBrandstof voertuigBrandstof = secondVoertuigList.get(0);

            brandstof_omschrijvingTextViewCar1.setText(voertuigBrandstof.getBrandstof_omschrijving());
            brandstofverbruik_buitenTextViewCar1.setText(voertuigBrandstof.getBrandstofverbruik_buiten());
            brandstofverbruik_gecombineerdTextViewCar1.setText(voertuigBrandstof.getBrandstofverbruik_gecombineerd());
            brandstofverbruik_stadTextViewCar1.setText(voertuigBrandstof.getBrandstofverbruik_stad());
            co2_uitstoot_gecombineerdTextViewCar1.setText(voertuigBrandstof.getCo2_uitstoot_gecombineerd());
            geluidsniveau_rijdendTextViewCar1.setText(voertuigBrandstof.getGeluidsniveau_rijdend());
            geluidsniveau_stationairTextViewCar1.setText(voertuigBrandstof.getGeluidsniveau_stationair());
            nettomaximumvermogenTextViewCar1.setText(voertuigBrandstof.getNettomaximumvermogen());
            uitlaatemissieniveauTextViewCar1.setText(voertuigBrandstof.getUitlaatemissieniveau());
        }

        TextView performanceIndexTextViewCar1 = findViewById(R.id.tv_PerformanceIndex_Car1);

        if (brandstof_omschrijvingTextViewCar1.getText().equals("Elektriciteit")) {
            performanceIndexTextViewCar1.setText(brandstof_omschrijvingTextViewCar1.getText());
        }else {
            Voertuig voertuig = voertuigList.get(0);
            VoertuigBrandstof voertuigBrandstof = secondVoertuigList.get(0);

            TotalSystemPower = Double.valueOf(voertuigBrandstof.getNettomaximumvermogen());
            EmptyMass = voertuig.getMassa_ledig_voertuig();
            PerformanceIndex = TotalSystemPower / EmptyMass;
            performanceIndexTextViewCar1.setText(String.valueOf(PerformanceIndex));
        }

    }
}