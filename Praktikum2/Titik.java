package Praktikum2;

public class Titik {
    double absis;
    double ordinat;

    public Titik() {
        absis = 0;
        ordinat = 0;
    }

    public void setAbsis(double a) {
        absis = a;
    }

    public void setOrdinat(double o) {
        ordinat = o;
    }

    public double getAbsis() {
        return absis;
    }

    public double getOrdinat() {
        return ordinat;
    }

    public void tampil() {
        System.out.println("(" + absis + ", " + ordinat + ")");
    }
}
