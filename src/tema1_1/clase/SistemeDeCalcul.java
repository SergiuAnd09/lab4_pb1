package tema1_1.clase;

import tema1_1.enumerari.SistemDeOperare;
import tema1_1.enumerari.Situatie;
import tema1_1.enumerari.Tipuri;

public class SistemeDeCalcul extends Echimpament {

    private String tip_mon;
    private float vit_proc;
    private int c_hdd;
    private SistemDeOperare s_op;

    public SistemeDeCalcul() {}

    @Override
    public String toString() {
        return super.toString() +
                "tip_mon='" + tip_mon + '\'' +
                ", vit_proc=" + vit_proc +
                ", c_hdd=" + c_hdd +
                ", s_op=" + s_op +
                '}';
    }

    public SistemeDeCalcul(String denumire, int nr_inv, float pret, String zona_mag, Situatie sit, Tipuri tip, String tip_mon, float vit_proc, int c_hdd, SistemDeOperare s_op) {
        super(denumire, nr_inv, pret, zona_mag, sit, tip);
        this.tip_mon = tip_mon;
        this.vit_proc = vit_proc;
        this.c_hdd = c_hdd;
        this.s_op = s_op;
    }
}
