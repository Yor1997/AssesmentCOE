package com.example.assesmentcoe;

import java.io.Serializable;

public class Voertuig implements Serializable {
    private String kenteken;
    private String voertuigsoort;
    private String merk;
    private String handelsbenaming;
    private String inrichting;
    private Integer aantal_zitplaatsen;
    private String eerste_kleur;
    private Integer massa_ledig_voertuig;
    private Integer catalogusprijs;
    private Integer aantal_deuren;

    public Voertuig(String kenteken, String voertuigsoort, String merk, String handelsbenaming, String inrichting, Integer aantal_zitplaatsen, String eerste_kleur, Integer massa_ledig_voertuig, Integer catalogusprijs, Integer aantal_deuren) {
        this.kenteken = kenteken;
        this.voertuigsoort = voertuigsoort;
        this.merk = merk;
        this.handelsbenaming = handelsbenaming;
        this.inrichting = inrichting;
        this.aantal_zitplaatsen = aantal_zitplaatsen;
        this.eerste_kleur = eerste_kleur;
        this.massa_ledig_voertuig = massa_ledig_voertuig;
        this.catalogusprijs = catalogusprijs;
        this.aantal_deuren = aantal_deuren;
    }

    public String getKenteken() {
        return kenteken;
    }

    public String getVoertuigsoort() {
        return voertuigsoort;
    }

    public String getMerk() {
        return merk;
    }

    public String getHandelsbenaming() {
        return handelsbenaming;
    }

    public String getInrichting() {
        return inrichting;
    }

    public Integer getAantal_zitplaatsen() {
        return aantal_zitplaatsen;
    }

    public String getEerste_kleur() {
        return eerste_kleur;
    }

    public Integer getMassa_ledig_voertuig() {
        return massa_ledig_voertuig;
    }

    public Integer getCatalogusprijs() {
        return catalogusprijs;
    }

    public Integer getAantal_deuren() {
        return aantal_deuren;
    }

    @Override
    public String toString() {
        return "kenteken = " + kenteken +
                "\nvoertuigsoort = " + voertuigsoort +
                "\nmerk = " + merk +
                "\nhandelsbenaming = " + handelsbenaming +
                "\ninrichting = " + inrichting +
                "\naantal_zitplaatsen = " + aantal_zitplaatsen +
                "\neerste_kleur = " + eerste_kleur +
                "\nmassa_ledig_voertuig = " + massa_ledig_voertuig +
                "\ncatalogusprijs = " + catalogusprijs +
                "\naantal_deuren = " + aantal_deuren +
                "\n";
    }
}
