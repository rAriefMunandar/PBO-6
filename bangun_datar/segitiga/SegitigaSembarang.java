package bangun_datar.segitiga;

public class SegitigaSembarang extends Segitiga {
    public SegitigaSembarang(double sisi1, double sisi2, double sisi3) {
        super(sisi1, sisi2, sisi3);
    }

    @Override
    public double hitungLuas() {
        double s = (sisi1 + sisi2 + sisi3) / 2;
        return Math.sqrt(s * (s - sisi1) * (s - sisi2) * (s - sisi3));
    }
}