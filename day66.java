package mentor_armawan;

public class day66 {
    
    public static void main(String[] args) {
        
        int n = 5; // ukuran sisi persegi
        int panjang = 6; // panjang persegi panjang
        int lebar = 4;   // lebar persegi panjang

        // Mencetak pola persegi
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* "); // mencetak bintang
            }
            System.out.println(); // pindah ke baris berikutnya
        }

        System.out.println(); // memberi jarak antara pola

        // Mencetak pola persegi panjang
        for (int i = 0; i < lebar; i++) {
            for (int j = 0; j < panjang; j++) {
                System.out.print("# "); // mencetak pagar
            }
            System.out.println(); // pindah ke baris berikutnya
        }
    }
}
