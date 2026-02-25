package Praktikum2;

public class MTitik {
    public static void main(String[] args) {

        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);

        T1.tampil();
    }
}

// javac -d bin Praktikum2/*.java
// java -cp bin Praktikum2.MTitik