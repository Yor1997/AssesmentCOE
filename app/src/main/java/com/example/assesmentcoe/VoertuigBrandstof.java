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
    private String nominaal_continu_maximumvermogen;
    private Integer elektrisch_verbruik_enkel_elektrisch_wltp;
    private Integer actie_radius_enkel_elektrisch_wltp;
    private Integer actie_radius_enkel_elektrisch_stad_wltp;
    private Integer netto_max_vermogen_elektrisch;

    public VoertuigBrandstof(String brandstof_omschrijving, String brandstofverbruik_buiten, String brandstofverbruik_gecombineerd, String brandstofverbruik_stad, String co2_uitstoot_gecombineerd, String geluidsniveau_rijdend, String geluidsniveau_stationair, String nettomaximumvermogen, String uitlaatemissieniveau, String nominaal_continu_maximumvermogen, Integer elektrisch_verbruik_enkel_elektrisch_wltp, Integer actie_radius_enkel_elektrisch_wltp, Integer actie_radius_enkel_elektrisch_stad_wltp, Integer netto_max_vermogen_elektrisch) {
        this.brandstof_omschrijving = brandstof_omschrijving;
        this.brandstofverbruik_buiten = brandstofverbruik_buiten;
        this.brandstofverbruik_gecombineerd = brandstofverbruik_gecombineerd;
        this.brandstofverbruik_stad = brandstofverbruik_stad;
        this.co2_uitstoot_gecombineerd = co2_uitstoot_gecombineerd;
        this.geluidsniveau_rijdend = geluidsniveau_rijdend;
        this.geluidsniveau_stationair = geluidsniveau_stationair;
        this.nettomaximumvermogen = nettomaximumvermogen;
        this.uitlaatemissieniveau = uitlaatemissieniveau;
        this.nominaal_continu_maximumvermogen = nominaal_continu_maximumvermogen;
        this.elektrisch_verbruik_enkel_elektrisch_wltp = elektrisch_verbruik_enkel_elektrisch_wltp;
        this.actie_radius_enkel_elektrisch_wltp = actie_radius_enkel_elektrisch_wltp;
        this.actie_radius_enkel_elektrisch_stad_wltp = actie_radius_enkel_elektrisch_stad_wltp;
        this.netto_max_vermogen_elektrisch = netto_max_vermogen_elektrisch;
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

    public String getNominaal_continu_maximumvermogen() {
        return nominaal_continu_maximumvermogen;
    }

    public Integer getElektrisch_verbruik_enkel_elektrisch_wltp() {
        return elektrisch_verbruik_enkel_elektrisch_wltp;
    }

    public Integer getActie_radius_enkel_elektrisch_wltp() {
        return actie_radius_enkel_elektrisch_wltp;
    }

    public Integer getActie_radius_enkel_elektrisch_stad_wltp() {
        return actie_radius_enkel_elektrisch_stad_wltp;
    }

    public Integer getNetto_max_vermogen_elektrisch() {
        return netto_max_vermogen_elektrisch;
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
                "\nnominaal_continu_maximumvermogen = " + nominaal_continu_maximumvermogen +
                "\nelektrisch_verbruik_enkel_elektrisch_wltp = " + elektrisch_verbruik_enkel_elektrisch_wltp +
                "\nactie_radius_enkel_elektrisch_wltp = " + actie_radius_enkel_elektrisch_wltp +
                "\nactie_radius_enkel_elektrisch_stad_wltp = " + actie_radius_enkel_elektrisch_stad_wltp +
                "\nnetto_max_vermogen_elektrisch = " + netto_max_vermogen_elektrisch +
                "\n";
    }
}
