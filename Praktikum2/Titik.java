package Praktikum2;

public class Titik {
    double absis;
    double ordinat;

    public Titik() {
        absis = 0;
        ordinat = 0;
    }

    Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
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

    // public void tampil() {
    //     System.out.println("(" + absis + ", " + ordinat + ")");
    // }
    
    public void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    public void RefleksiX(){
        ordinat = -ordinat;
    }

    void RefleksiY(){
        absis = -absis;
    }

    int getKuadran() {
        if (absis > 0 && ordinat > 0) {
            return 1;
        } else if (absis < 0 && ordinat > 0) {
            return 2;
        } else if (absis < 0 && ordinat < 0) {
            return 3;
        } else if (absis > 0 && ordinat < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    double getJarakPusat(){
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }
    
    double getJarak(Titik T){
        return Math.sqrt(Math.pow(this.absis - T.absis, 2) + Math.pow(this.ordinat - T.ordinat, 2));
    }

     Titik getRefleksiX() {
        Titik hasil = new Titik();
        hasil.setAbsis(absis);
        hasil.setOrdinat(-ordinat);
        return hasil;
    }

    Titik getRefleksiY() {
        Titik hasil = new Titik();
        hasil.setAbsis(-absis);
        hasil.setOrdinat(ordinat);
        return hasil;
    }

    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

 }


