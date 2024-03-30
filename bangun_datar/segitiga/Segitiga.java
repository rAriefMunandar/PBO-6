package bangun_datar.segitiga;

import bangun_datar.Shape;

public abstract class Segitiga implements Shape {
    protected double sisi1;
    protected double sisi2;
    protected double sisi3;

    public Segitiga(double sisi1, double sisi2, double sisi3) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    @Override
    public abstract double hitungLuas();

    @Override
    public double hitungKeliling() {
        return sisi1 + sisi2 + sisi3;
    }
}