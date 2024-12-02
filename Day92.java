package mentor_armawan;

public class Day92 {
    
    public static void main(String[] args) {
        int angka = 5; // Tinggi huruf V
        for (int i = 0; i < angka; i++) {
            for (int j = 0; j < 2 * angka; j++) {
                // Cetak bintang di posisi yang tepat untuk membentuk huruf V
                if (j == i || j == 2 * angka - 2 - i) {
                    System.out.print("*"); // Cetak bintang
                } else {
                    System.out.print(" "); // Cetak spasi
                }
            }
            System.out.println(); // Pindah ke baris berikutnya
        }
    }
}
