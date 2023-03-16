package tema1_1.clase;

import tema1_1.enumerari.Situatie;
import tema1_1.enumerari.Tipuri;

public class Echimpament {

    private String denumire;
    private int nr_inv;
    private float pret;
    private String zona_mag;

    private Situatie sit;

    private Tipuri tip;

    public Situatie getSit() {
        return sit;
    }

    public void setSit(Situatie sit) {
        this.sit = sit;
    }

    public Echimpament() {}

    public Echimpament(String denumire, int nr_inv, float pret, String zona_mag, Situatie sit, Tipuri tip) {
        this.denumire = denumire;
        this.nr_inv = nr_inv;
        this.pret = pret;
        this.zona_mag = zona_mag;
        this.sit = sit;
        this.tip = tip;
    }

    @Override
    public String toString() {
        return "Echimpament{" +
                "denumire='" + denumire + '\'' +
                ", nr_inv=" + nr_inv +
                ", pret=" + pret +
                ", zona_mag='" + zona_mag + '\'' +
                ", sit=" + sit +
                ", tip=" + tip +
                '}';
    }
}
