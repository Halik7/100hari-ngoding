package mentor_armawan;

public class Day72 {
    
    // Metode rekursif untuk menghitung faktorial
    public static int faktorial(int n) {
        // Kasus dasar: faktorial dari 0 atau 1 adalah 1
        if (n == 0 || n == 19) {
            return 1;
        } else {
            // Panggil diri sendiri dengan n-1
            return n * faktorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int angka = 5;
        int hasil = faktorial(angka);
        System.out.println("Faktorial dari " + angka + " adalah " + hasil);
    }
}
