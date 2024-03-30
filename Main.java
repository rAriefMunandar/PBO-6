import bangun_ruang.*;
import bangun_datar.persegi.*;
import bangun_datar.persegi_panjang.*;
import bangun_datar.lingkaran.*;
import bangun_datar.segitiga.*;

public class Main {
    public static void main(String[] args) {
        // Bangun Datar
        PersegiPanjang persegiPanjang = new PersegiPanjang(5, 3);
        Persegi persegi = new Persegi(4);
        Lingkaran lingkaran = new Lingkaran(6);
        SegitigaSamaKaki segitigaSamaKaki = new SegitigaSamaKaki(4, 5);
        SegitigaSamaSisi segitigaSamaSisi = new SegitigaSamaSisi(5);
        SegitigaSikuSiku segitigaSikuSiku = new SegitigaSikuSiku(3, 4);
        SegitigaSembarang segitigaSembarang = new SegitigaSembarang(3, 4, 5);

        // Bangun Ruang
        Kubus kubus = new Kubus(5);
        Balok balok = new Balok(4, 3, 6);
        Bola bola = new Bola(7);
        Tabung tabung = new Tabung(4, 8);

        // Menampilkan hasil perhitungan
        System.out.println("Bangun Datar:");
        System.out.println("Luas Persegi Panjang: " + persegiPanjang.hitungLuas());
        System.out.println("Keliling Persegi Panjang: " + persegiPanjang.hitungKeliling());
        System.out.println("Luas Persegi: " + persegi.hitungLuas());
        System.out.println("Keliling Persegi: " + persegi.hitungKeliling());
        System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas());
        System.out.println("Keliling Lingkaran: " + lingkaran.hitungKeliling());
        System.out.println("Luas Segitiga Sama Kaki: " + segitigaSamaKaki.hitungLuas());
        System.out.println("Keliling Segitiga Sama Kaki: " + segitigaSamaKaki.hitungKeliling());
        System.out.println("Luas Segitiga Sama Sisi: " + segitigaSamaSisi.hitungLuas());
        System.out.println("Keliling Segitiga Sama Sisi: " + segitigaSamaSisi.hitungKeliling());
        System.out.println("Luas Segitiga Siku-Siku: " + segitigaSikuSiku.hitungLuas());
        System.out.println("Keliling Segitiga Siku-Siku: " + segitigaSikuSiku.hitungKeliling());
        System.out.println("Luas Segitiga Sembarang: " + segitigaSembarang.hitungLuas());
        System.out.println("Keliling Segitiga Sembarang: " + segitigaSembarang.hitungKeliling());

        System.out.println("\nBangun Ruang:");
        System.out.println("Volume Kubus: " + kubus.hitungVolume());
        System.out.println("Luas Permukaan Kubus: " + kubus.hitungLuasPermukaan());
        System.out.println("Volume Balok: " + balok.hitungVolume());
        System.out.println("Luas Permukaan Balok: " + balok.hitungLuasPermukaan());
        System.out.println("Volume Bola: " + bola.hitungVolume());
        System.out.println("Luas Permukaan Bola: " + bola.hitungLuasPermukaan());
        System.out.println("Volume Tabung: " + tabung.hitungVolume());
        System.out.println("Luas Permukaan Tabung: " + tabung.hitungLuasPermukaan());
    }
}