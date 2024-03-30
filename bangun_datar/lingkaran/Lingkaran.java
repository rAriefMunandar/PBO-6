package bangun_datar.lingkaran;

import bangun_datar.Shape;

public class Lingkaran implements Shape {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * Math.pow(jariJari, 2);
    }

    @Override
    public double hitungKeliling() {
        return  Math.PI * (2 * jariJari);
    }
}