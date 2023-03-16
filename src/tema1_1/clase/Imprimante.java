package tema1_1.clase;

import tema1_1.enumerari.ModDeTiparire;
import tema1_1.enumerari.Situatie;
import tema1_1.enumerari.Tipuri;

public class Imprimante extends Echimpament {

    private int ppm;
    private String dpi;
    private int p_car;
    private ModDeTiparire m_tip;

    public Imprimante() {}

    public Imprimante(String denumire, int nr_inv, float pret, String zona_mag, Situatie sit, Tipuri tip, int ppm, String dpi, int p_car, ModDeTiparire m_tip) {
        super(denumire, nr_inv, pret, zona_mag, sit, tip);
        this.ppm = ppm;
        this.dpi = dpi;
        this.p_car = p_car;
        this.m_tip = m_tip;
    }

    @Override
    public String toString() {
        return super.toString() +  "Imprimante{" +
                "ppm=" + ppm +
                ", dpi=" + dpi +
                ", p_car=" + p_car +
                ", m_tip=" + m_tip +
                '}';
    }
}
