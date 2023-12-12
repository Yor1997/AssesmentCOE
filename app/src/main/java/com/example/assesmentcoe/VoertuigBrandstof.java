package com.example.assesmentcoe;

import java.io.Serializable;

public class VoertuigBrandstof implements Serializable {
    private String brandstof_omschrijving;
    private String brandstofverbruik_buiten;
    private String brandstofverbruik_gecombineerd;
    private String brandstofverbruik_stad;
    private String co2_uitstoot_gecombineerd;
    private String geluidsniveau_rijdend;
    private String geluidsniveau_stationair;
    private String nettomaximumvermogen;
    private String uitlaatemissieniveau;

    public VoertuigBrandstof(String brandstof_omschrijving, String brandstofverbruik_buiten, String brandstofverbruik_gecombineerd, String brandstofverbruik_stad, String co2_uitstoot_gecombineerd, String geluidsniveau_rijdend, String geluidsniveau_stationair, String nettomaximumvermogen, String uitlaatemissieniveau) {
        this.brandstof_omschrijving = brandstof_omschrijving;
        this.brandstofverbruik_buiten = brandstofverbruik_buiten;
        this.brandstofverbruik_gecombineerd = brandstofverbruik_gecombineerd;
        this.brandstofverbruik_stad = brandstofverbruik_stad;
        this.co2_uitstoot_gecombineerd = co2_uitstoot_gecombineerd;
        this.geluidsniveau_rijdend = geluidsniveau_rijdend;
        this.geluidsniveau_stationair = geluidsniveau_stationair;
        this.nettomaximumvermogen = nettomaximumvermogen;
        this.uitlaatemissieniveau = uitlaatemissieniveau;
    }

    public String getBrandstof_omschrijving() {
        return brandstof_omschrijving;
    }

    public String getBrandstofverbruik_buiten() {
        return brandstofverbruik_buiten;
    }

    public String getBrandstofverbruik_gecombineerd() {
        return brandstofverbruik_gecombineerd;
    }

    public String getBrandstofverbruik_stad() {
        return brandstofverbruik_stad;
    }

    public String getCo2_uitstoot_gecombineerd() {
        return co2_uitstoot_gecombineerd;
    }

    public String getGeluidsniveau_rijdend() {
        return geluidsniveau_rijdend;
    }

    public String getGeluidsniveau_stationair() {
        return geluidsniveau_stationair;
    }

    public String getNettomaximumvermogen() {
        return nettomaximumvermogen;
    }

    public String getUitlaatemissieniveau() {
        return uitlaatemissieniveau;
    }

    @Override
    public String toString() {
        return "brandstof_omschrijving = " + brandstof_omschrijving +
                "\nbrandstofverbruik_buiten = " + brandstofverbruik_buiten +
                "\nbrandstofverbruik_gecombineerd = " + brandstofverbruik_gecombineerd +
                "\nbrandstofverbruik_stad = " + brandstofverbruik_stad +
                "\nco2_uitstoot_gecombineerd = " + co2_uitstoot_gecombineerd +
                "\ngeluidsniveau_rijdend = " + geluidsniveau_rijdend +
                "\ngeluidsniveau_stationair = " + geluidsniveau_stationair +
                "\nnettomaximumvermogen = " + nettomaximumvermogen +
                "\nuitlaatemissieniveau = " + uitlaatemissieniveau +
                "\n";
    }
}
