package tema1_1.clase;

import tema1_1.clase.Echimpament;
import tema1_1.enumerari.FormatDeCopiere;
import tema1_1.enumerari.Situatie;
import tema1_1.enumerari.Tipuri;

public class Copiatoare extends Echimpament {

    private int p_ton;
    private FormatDeCopiere f_cop;

    public Copiatoare(String denumire, int nr_inv, float pret, String zona_mag, Situatie sit, Tipuri tip, int p_ton, FormatDeCopiere f_cop) {
        super(denumire, nr_inv, pret, zona_mag, sit, tip);
        this.p_ton = p_ton;
        this.f_cop = f_cop;
    }

    public Copiatoare() {}

    @Override
    public String toString() {
        return super.toString() + "Copiatoare{" +
                "p_ton=" + p_ton +
                ", f_cop=" + f_cop +
                '}';
    }
}
