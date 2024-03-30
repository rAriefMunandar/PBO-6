package bangun_datar.segitiga;

public class SegitigaSikuSiku extends Segitiga {
    public SegitigaSikuSiku(double alas, double tinggi) {
        super(alas, tinggi, Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2)));
    }

    @Override
    public double hitungLuas() {
        return (sisi1 * sisi2) / 2; // Luas segitiga siku-siku = (alas * tinggi) / 2
    }
}