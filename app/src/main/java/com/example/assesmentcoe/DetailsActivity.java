package com.example.assesmentcoe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DetailsActivity extends AppCompatActivity {

    Double TotalSystemPower, PerformanceIndex;
    Integer EmptyMass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        List<Voertuig> voertuigListCar1 = (List<Voertuig>) getIntent().getSerializableExtra("voertuigListCar1");
        List<VoertuigBrandstof> secondVoertuigListCar1 = (List<VoertuigBrandstof>) getIntent().getSerializableExtra("secondVoertuigListCar1");

        List<Voertuig> voertuigListCar2 = (List<Voertuig>) getIntent().getSerializableExtra("voertuigListCar2");
        List<VoertuigBrandstof> secondVoertuigListCar2 = (List<VoertuigBrandstof>) getIntent().getSerializableExtra("secondVoertuigListCar2");

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
        TextView brandstof_omschrijvingTextViewCar1 = findViewById(R.id.tv_Fuel_Car1);
        TextView brandstofverbruik_buitenTextViewCar1 = findViewById(R.id.tv_FuelOutdoor_Car1);
        TextView brandstofverbruik_gecombineerdTextViewCar1 = findViewById(R.id.tv_FuelCombined_Car1);
        TextView brandstofverbruik_stadTextViewCar1 = findViewById(R.id.tv_FuelCity_Car1);
        TextView co2_uitstoot_gecombineerdTextViewCar1 = findViewById(R.id.tv_CO2_Car1);
        TextView geluidsniveau_rijdendTextViewCar1 = findViewById(R.id.tv_NoiseDriving_Car1);
        TextView geluidsniveau_stationairTextViewCar1 = findViewById(R.id.tv_NoiseStationary_Car1);
        TextView nettomaximumvermogenTextViewCar1 = findViewById(R.id.tv_NetMaximum_Car1);
        TextView uitlaatemissieniveauTextViewCar1 = findViewById(R.id.tv_ExhaustEmission_Car1);
        TextView nominaal_continu_maximumvermogenTextViewCar1 = findViewById(R.id.tv_NominalContinuousMaximumPower_Car1);
        TextView elektrisch_verbruik_enkel_elektrisch_wltpTextViewCar1 = findViewById(R.id.tv_ElectricalConsumption_Car1);
        TextView actie_radius_enkel_elektrisch_wltpTextViewCar1 = findViewById(R.id.tv_ActionRadius_Car1);
        TextView actie_radius_enkel_elektrisch_stad_wltpTextViewCar1 = findViewById(R.id.tv_ActionRadiusCity_Car1);
        TextView netto_max_vermogen_elektrischTextViewCar1 = findViewById(R.id.tv_NetMaximumElectric_Car1);
        TextView performanceIndexTextViewCar1 = findViewById(R.id.tv_PerformanceIndex_Car1);

        TextView kentekenTextViewCar2 = findViewById(R.id.tv_LicencePlate_Car2);
        TextView voertuigsoortTextViewCar2 = findViewById(R.id.tv_Type_Car2);
        TextView merkTextViewCar2 = findViewById(R.id.tv_Brand_Car2);
        TextView handelsbenamingTextViewCar2 = findViewById(R.id.tv_Model_Car2);
        TextView inrichtingTextViewCar2 = findViewById(R.id.tv_ModelType_Car2);
        TextView aantal_zitplaatsenTextViewCar2 = findViewById(R.id.tv_Seats_Car2);
        TextView eerste_kleurTextViewCar2 = findViewById(R.id.tv_Color_Car2);
        TextView massa_ledig_voertuigTextViewCar2 = findViewById(R.id.tv_EmptyMass_Car2);
        TextView catalogusprijsTextViewCar2 = findViewById(R.id.tv_Price_Car2);
        TextView aantal_deurenTextViewCar2 = findViewById(R.id.tv_Doors_Car2);
        TextView brandstof_omschrijvingTextViewCar2 = findViewById(R.id.tv_Fuel_Car2);
        TextView brandstofverbruik_buitenTextViewCar2 = findViewById(R.id.tv_FuelOutdoor_Car2);
        TextView brandstofverbruik_gecombineerdTextViewCar2 = findViewById(R.id.tv_FuelCombined_Car2);
        TextView brandstofverbruik_stadTextViewCar2 = findViewById(R.id.tv_FuelCity_Car2);
        TextView co2_uitstoot_gecombineerdTextViewCar2 = findViewById(R.id.tv_CO2_Car2);
        TextView geluidsniveau_rijdendTextViewCar2 = findViewById(R.id.tv_NoiseDriving_Car2);
        TextView geluidsniveau_stationairTextViewCar2 = findViewById(R.id.tv_NoiseStationary_Car2);
        TextView nettomaximumvermogenTextViewCar2 = findViewById(R.id.tv_NetMaximum_Car2);
        TextView uitlaatemissieniveauTextViewCar2 = findViewById(R.id.tv_ExhaustEmission_Car2);
        TextView nominaal_continu_maximumvermogenTextViewCar2 = findViewById(R.id.tv_NominalContinuousMaximumPower_Car2);
        TextView elektrisch_verbruik_enkel_elektrisch_wltpTextViewCar2 = findViewById(R.id.tv_ElectricalConsumption_Car2);
        TextView actie_radius_enkel_elektrisch_wltpTextViewCar2 = findViewById(R.id.tv_ActionRadius_Car2);
        TextView actie_radius_enkel_elektrisch_stad_wltpTextViewCar2 = findViewById(R.id.tv_ActionRadiusCity_Car2);
        TextView netto_max_vermogen_elektrischTextViewCar2 = findViewById(R.id.tv_NetMaximumElectric_Car2);
        TextView performanceIndexTextViewCar2 = findViewById(R.id.tv_PerformanceIndex_Car2);

        if (voertuigListCar1 != null && !voertuigListCar1.isEmpty()) {
            Voertuig voertuig = voertuigListCar1.get(0);

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

        if (secondVoertuigListCar1 != null && !secondVoertuigListCar1.isEmpty()) {
            VoertuigBrandstof voertuigBrandstof = secondVoertuigListCar1.get(0);

            brandstof_omschrijvingTextViewCar1.setText(voertuigBrandstof.getBrandstof_omschrijving());
            brandstofverbruik_buitenTextViewCar1.setText(voertuigBrandstof.getBrandstofverbruik_buiten());
            brandstofverbruik_gecombineerdTextViewCar1.setText(voertuigBrandstof.getBrandstofverbruik_gecombineerd());
            brandstofverbruik_stadTextViewCar1.setText(voertuigBrandstof.getBrandstofverbruik_stad());
            co2_uitstoot_gecombineerdTextViewCar1.setText(voertuigBrandstof.getCo2_uitstoot_gecombineerd());
            geluidsniveau_rijdendTextViewCar1.setText(voertuigBrandstof.getGeluidsniveau_rijdend());
            geluidsniveau_stationairTextViewCar1.setText(voertuigBrandstof.getGeluidsniveau_stationair());
            nettomaximumvermogenTextViewCar1.setText(voertuigBrandstof.getNettomaximumvermogen());
            uitlaatemissieniveauTextViewCar1.setText(voertuigBrandstof.getUitlaatemissieniveau());
            nominaal_continu_maximumvermogenTextViewCar1.setText(voertuigBrandstof.getNominaal_continu_maximumvermogen());
            elektrisch_verbruik_enkel_elektrisch_wltpTextViewCar1.setText(String.valueOf(voertuigBrandstof.getElektrisch_verbruik_enkel_elektrisch_wltp()));
            actie_radius_enkel_elektrisch_wltpTextViewCar1.setText(String.valueOf(voertuigBrandstof.getActie_radius_enkel_elektrisch_wltp()));
            actie_radius_enkel_elektrisch_stad_wltpTextViewCar1.setText(String.valueOf(voertuigBrandstof.getActie_radius_enkel_elektrisch_stad_wltp()));
            netto_max_vermogen_elektrischTextViewCar1.setText(String.valueOf(voertuigBrandstof.getNetto_max_vermogen_elektrisch()));
        }

        if (brandstof_omschrijvingTextViewCar1.getText().equals("Elektriciteit")) {
            assert voertuigListCar1 != null;
            Voertuig voertuig = voertuigListCar1.get(0);
            assert secondVoertuigListCar1 != null;
            VoertuigBrandstof voertuigBrandstof = secondVoertuigListCar1.get(0);

            TotalSystemPower = Double.valueOf(voertuigBrandstof.getNetto_max_vermogen_elektrisch());
            EmptyMass = voertuig.getMassa_ledig_voertuig();
            PerformanceIndex = TotalSystemPower / EmptyMass;
            performanceIndexTextViewCar1.setText(String.valueOf(PerformanceIndex));
        }else {
            assert voertuigListCar1 != null;
            Voertuig voertuig = voertuigListCar1.get(0);
            assert secondVoertuigListCar1 != null;
            VoertuigBrandstof voertuigBrandstof = secondVoertuigListCar1.get(0);

            TotalSystemPower = Double.valueOf(voertuigBrandstof.getNettomaximumvermogen());
            EmptyMass = voertuig.getMassa_ledig_voertuig();
            PerformanceIndex = TotalSystemPower / EmptyMass;
            performanceIndexTextViewCar1.setText(String.valueOf(PerformanceIndex));
        }

        if (voertuigListCar2 != null && !voertuigListCar2.isEmpty()) {
            Voertuig voertuig = voertuigListCar2.get(0);

            kentekenTextViewCar2.setText(voertuig.getKenteken());
            voertuigsoortTextViewCar2.setText(voertuig.getVoertuigsoort());
            merkTextViewCar2.setText(voertuig.getMerk());
            handelsbenamingTextViewCar2.setText(voertuig.getHandelsbenaming());
            inrichtingTextViewCar2.setText(voertuig.getInrichting());
            aantal_zitplaatsenTextViewCar2.setText(String.valueOf(voertuig.getAantal_zitplaatsen()));
            eerste_kleurTextViewCar2.setText(voertuig.getEerste_kleur());
            massa_ledig_voertuigTextViewCar2.setText(String.valueOf(voertuig.getMassa_ledig_voertuig()));
            catalogusprijsTextViewCar2.setText(String.valueOf(voertuig.getCatalogusprijs()));
            aantal_deurenTextViewCar2.setText(String.valueOf(voertuig.getAantal_deuren()));
        }

        if (secondVoertuigListCar2 != null && !secondVoertuigListCar2.isEmpty()) {
            VoertuigBrandstof voertuigBrandstof = secondVoertuigListCar2.get(0);

            brandstof_omschrijvingTextViewCar2.setText(voertuigBrandstof.getBrandstof_omschrijving());
            brandstofverbruik_buitenTextViewCar2.setText(voertuigBrandstof.getBrandstofverbruik_buiten());
            brandstofverbruik_gecombineerdTextViewCar2.setText(voertuigBrandstof.getBrandstofverbruik_gecombineerd());
            brandstofverbruik_stadTextViewCar2.setText(voertuigBrandstof.getBrandstofverbruik_stad());
            co2_uitstoot_gecombineerdTextViewCar2.setText(voertuigBrandstof.getCo2_uitstoot_gecombineerd());
            geluidsniveau_rijdendTextViewCar2.setText(voertuigBrandstof.getGeluidsniveau_rijdend());
            geluidsniveau_stationairTextViewCar2.setText(voertuigBrandstof.getGeluidsniveau_stationair());
            nettomaximumvermogenTextViewCar2.setText(voertuigBrandstof.getNettomaximumvermogen());
            uitlaatemissieniveauTextViewCar2.setText(voertuigBrandstof.getUitlaatemissieniveau());
            nominaal_continu_maximumvermogenTextViewCar2.setText(voertuigBrandstof.getNominaal_continu_maximumvermogen());
            elektrisch_verbruik_enkel_elektrisch_wltpTextViewCar2.setText(String.valueOf(voertuigBrandstof.getElektrisch_verbruik_enkel_elektrisch_wltp()));
            actie_radius_enkel_elektrisch_wltpTextViewCar2.setText(String.valueOf(voertuigBrandstof.getActie_radius_enkel_elektrisch_wltp()));
            actie_radius_enkel_elektrisch_stad_wltpTextViewCar2.setText(String.valueOf(voertuigBrandstof.getActie_radius_enkel_elektrisch_stad_wltp()));
            netto_max_vermogen_elektrischTextViewCar2.setText(String.valueOf(voertuigBrandstof.getNetto_max_vermogen_elektrisch()));
        }

        if (brandstof_omschrijvingTextViewCar2.getText().equals("Elektriciteit")) {
            assert voertuigListCar2 != null;
            Voertuig voertuig = voertuigListCar2.get(0);
            assert secondVoertuigListCar2 != null;
            VoertuigBrandstof voertuigBrandstof = secondVoertuigListCar2.get(0);

            TotalSystemPower = Double.valueOf(voertuigBrandstof.getNetto_max_vermogen_elektrisch());
            EmptyMass = voertuig.getMassa_ledig_voertuig();
            PerformanceIndex = TotalSystemPower / EmptyMass;
            performanceIndexTextViewCar2.setText(String.valueOf(PerformanceIndex));
        }else {
            assert voertuigListCar2 != null;
            Voertuig voertuig = voertuigListCar2.get(0);
            assert secondVoertuigListCar2 != null;
            VoertuigBrandstof voertuigBrandstof = secondVoertuigListCar2.get(0);

            TotalSystemPower = Double.valueOf(voertuigBrandstof.getNettomaximumvermogen());
            EmptyMass = voertuig.getMassa_ledig_voertuig();
            PerformanceIndex = TotalSystemPower / EmptyMass;
            performanceIndexTextViewCar2.setText(String.valueOf(PerformanceIndex));
        }

        ImageView imgvBack = findViewById(R.id.imgv_back);
        imgvBack.setOnClickListener(view -> {
            Intent intent = new Intent(DetailsActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });

        double doubleValuePerformanceIndexCar1 = Double.parseDouble(performanceIndexTextViewCar1.getText().toString());
        double doubleValuePerformanceIndexCar2 = Double.parseDouble(performanceIndexTextViewCar2.getText().toString());

        int color = ContextCompat.getColor(this, R.color.grey);

        if (doubleValuePerformanceIndexCar1 > doubleValuePerformanceIndexCar2){
            View LinearLayoutCar1 = findViewById(R.id.ll_car1);
            LinearLayoutCar1.setBackgroundColor(color);
        }else if (doubleValuePerformanceIndexCar1 < doubleValuePerformanceIndexCar2){
            View LinearLayoutCar2 = findViewById(R.id.ll_car2);
            LinearLayoutCar2.setBackgroundColor(color);
        }else {
            View LinearLayoutCar1 = findViewById(R.id.ll_car1);
            View LinearLayoutCar2 = findViewById(R.id.ll_car2);
            LinearLayoutCar1.setBackgroundColor(color);
            LinearLayoutCar2.setBackgroundColor(color);
        }
    }
}