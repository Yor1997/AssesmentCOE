package com.example.assesmentcoe;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Voertuig implements Serializable {
    private final String kenteken;
    private final String voertuigsoort;
    private final String merk;
    private final String handelsbenaming;
    private final Integer vervaldatum_apk;
    private final Integer datum_tenaamstelling;
    private final String inrichting;
    private final Integer aantal_zitplaatsen;
    private final String eerste_kleur;
    private final String tweede_kleur;
    private final Integer massa_ledig_voertuig;
    private final Integer toegestane_maximum_massa_voertuig;
    private final Integer massa_rijklaar;
    private final Integer maximum_massa_trekken_ongeremd;
    private final Integer maximum_trekken_massa_geremd;
    private final Integer datum_eerste_toelating;
    private final Integer datum_eerste_tenaamstelling_in_nederland;
    private final Integer catalogusprijs;
    private final Integer laadvermogen;
    private final Integer aantal_deuren;
    private final Integer aantal_wielen;
    private final Integer lengte;
    private final Integer breedte;
    private final Integer wielbasis;
    private final Integer aantal_rolstoelplaatsen;
    private final Integer hoogte_voertuig;

    public Voertuig(String kenteken, String voertuigsoort, String merk, String handelsbenaming, Integer vervaldatum_apk, Integer datum_tenaamstelling, String inrichting, Integer aantal_zitplaatsen, String eerste_kleur, String tweede_kleur, Integer massa_ledig_voertuig, Integer toegestane_maximum_massa_voertuig, Integer massa_rijklaar, Integer maximum_massa_trekken_ongeremd, Integer maximum_trekken_massa_geremd, Integer datum_eerste_toelating, Integer datum_eerste_tenaamstelling_in_nederland, Integer catalogusprijs, Integer laadvermogen, Integer aantal_deuren, Integer aantal_wielen, Integer lengte, Integer breedte, Integer wielbasis, Integer aantal_rolstoelplaatsen, Integer hoogte_voertuig) {
        this.kenteken = kenteken;
        this.voertuigsoort = voertuigsoort;
        this.merk = merk;
        this.handelsbenaming = handelsbenaming;
        this.vervaldatum_apk = vervaldatum_apk;
        this.datum_tenaamstelling = datum_tenaamstelling;
        this.inrichting = inrichting;
        this.aantal_zitplaatsen = aantal_zitplaatsen;
        this.eerste_kleur = eerste_kleur;
        this.tweede_kleur = tweede_kleur;
        this.massa_ledig_voertuig = massa_ledig_voertuig;
        this.toegestane_maximum_massa_voertuig = toegestane_maximum_massa_voertuig;
        this.massa_rijklaar = massa_rijklaar;
        this.maximum_massa_trekken_ongeremd = maximum_massa_trekken_ongeremd;
        this.maximum_trekken_massa_geremd = maximum_trekken_massa_geremd;
        this.datum_eerste_toelating = datum_eerste_toelating;
        this.datum_eerste_tenaamstelling_in_nederland = datum_eerste_tenaamstelling_in_nederland;
        this.catalogusprijs = catalogusprijs;
        this.laadvermogen = laadvermogen;
        this.aantal_deuren = aantal_deuren;
        this.aantal_wielen = aantal_wielen;
        this.lengte = lengte;
        this.breedte = breedte;
        this.wielbasis = wielbasis;
        this.aantal_rolstoelplaatsen = aantal_rolstoelplaatsen;
        this.hoogte_voertuig = hoogte_voertuig;
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

    public Integer getVervaldatum_apk() {
        return vervaldatum_apk;
    }

    public Integer getDatum_tenaamstelling() {
        return datum_tenaamstelling;
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

    public String getTweede_kleur() {
        return tweede_kleur;
    }

    public Integer getMassa_ledig_voertuig() {
        return massa_ledig_voertuig;
    }

    public Integer getToegestane_maximum_massa_voertuig() {
        return toegestane_maximum_massa_voertuig;
    }

    public Integer getMassa_rijklaar() {
        return massa_rijklaar;
    }

    public Integer getMaximum_massa_trekken_ongeremd() {
        return maximum_massa_trekken_ongeremd;
    }

    public Integer getMaximum_trekken_massa_geremd() {
        return maximum_trekken_massa_geremd;
    }

    public Integer getDatum_eerste_toelating() {
        return datum_eerste_toelating;
    }

    public Integer getDatum_eerste_tenaamstelling_in_nederland() {
        return datum_eerste_tenaamstelling_in_nederland;
    }

    public Integer getCatalogusprijs() {
        return catalogusprijs;
    }

    public Integer getLaadvermogen() {
        return laadvermogen;
    }

    public Integer getAantal_deuren() {
        return aantal_deuren;
    }

    public Integer getAantal_wielen() {
        return aantal_wielen;
    }

    public Integer getLengte() {
        return lengte;
    }

    public Integer getBreedte() {
        return breedte;
    }

    public Integer getWielbasis() {
        return wielbasis;
    }

    public Integer getAantal_rolstoelplaatsen() {
        return aantal_rolstoelplaatsen;
    }

    public Integer getHoogte_voertuig() {
        return hoogte_voertuig;
    }

    @NonNull
    @Override
    public String toString() {
        return "kenteken = " + kenteken +
                "\nvoertuigsoort = " + voertuigsoort +
                "\nmerk = " + merk +
                "\nhandelsbenaming = " + handelsbenaming +
                "\nvervaldatum_apk = " + vervaldatum_apk +
                "\ndatum_tenaamstelling = " + datum_tenaamstelling +
                "\ninrichting = " + inrichting +
                "\naantal_zitplaatsen = " + aantal_zitplaatsen +
                "\neerste_kleur = " + eerste_kleur +
                "\ntweede_kleur = " + tweede_kleur +
                "\nmassa_ledig_voertuig = " + massa_ledig_voertuig +
                "\ntoegestane_maximum_massa_voertuig = " + toegestane_maximum_massa_voertuig +
                "\nmassa_rijklaar = " + massa_rijklaar +
                "\nmaximum_massa_trekken_ongeremd = " + maximum_massa_trekken_ongeremd +
                "\nmaximum_trekken_massa_geremd = " + maximum_trekken_massa_geremd +
                "\ndatum_eerste_toelating = " + datum_eerste_toelating +
                "\ndatum_eerste_tenaamstelling_in_nederland = " + datum_eerste_tenaamstelling_in_nederland +
                "\ncatalogusprijs = " + catalogusprijs +
                "\nlaadvermogen = " + laadvermogen +
                "\naantal_deuren = " + aantal_deuren +
                "\naantal_wielen = " + aantal_wielen +
                "\nlengte = " + lengte +
                "\nbreedte = " + breedte +
                "\nwielbasis = " + wielbasis +
                "\naantal_rolstoelplaatsen = " + aantal_rolstoelplaatsen +
                "\nhoogte_voertuig = " + hoogte_voertuig +
                "\n";
    }
}

