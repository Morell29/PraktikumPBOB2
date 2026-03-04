package Praktikum2;

public class MGaris {
    public static void main(String[] args) {

        // Titik untuk diuji
        Titik t1 = new Titik(6, 6);
        Titik t2 = new Titik(0, 2);
        Titik t3 = new Titik(0, 0);
        Titik t4 = new Titik(1, 2);

        // Menyusun garis dari 2 titik
        Garis g1 = new Garis(t1, t2);
        Garis g2 = new Garis(t3, t4);

        System.out.println("=== Garis 1 ===");
        g1.printGaris();

        System.out.println("\n=== Garis 2 ===");
        g2.printGaris();

        System.out.println("\nPanjang Garis 1: " + g1.getPanjang());
        System.out.println("Panjang Garis 2: " + g2.getPanjang());

        System.out.println("Gradien Garis 1: " + g1.getGradien());
        System.out.println("Gradien Garis 2: " + g2.getGradien());

        Titik tengah1 = g1.getTitikTengah();
        System.out.print("Titik Tengah Garis 1: ");
        tengah1.printTitik();
        Titik tengah2 = g2.getTitikTengah();
        System.out.print("Titik Tengah Garis 2: ");
        tengah2.printTitik();

        System.out.println("\nApakah g1 sejajar g2? " + g1.isSejajar(g2));

        System.out.println("Apakah g1 tegak lurus g2? " + g1.isTegakLurus(g2));

        System.out.println("\nPersamaan Garis 1: " + g1.getPersamaanGaris());
        System.out.println("Persamaan Garis 2: " + g2.getPersamaanGaris());

        System.out.println("\nJumlah objek Garis yang dibuat: " + Garis.getCounterGaris());
    }
}
