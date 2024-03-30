package bangun_datar.segitiga;

public class SegitigaSamaSisi extends Segitiga {
    public SegitigaSamaSisi(double sisi) {
        super(sisi, sisi, sisi);
    }

    @Override
    public double hitungLuas() {
        return (Math.sqrt(3) / 4) * Math.pow(sisi1, 2);
    }
}