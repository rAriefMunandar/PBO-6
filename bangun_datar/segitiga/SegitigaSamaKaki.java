package bangun_datar.segitiga;

public class SegitigaSamaKaki extends Segitiga {
    public SegitigaSamaKaki(double alas, double tinggi) {
        super(alas, alas, tinggi);
    }

    @Override
    public double hitungLuas() {
        return (sisi1 * sisi3) / 2;
    }
}