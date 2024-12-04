package mentor_armawan;

public class Day94 {
    
    public static void main(String[] args) {
        int baris = 5; // Jumlah baris untuk segitiga

        for (int i = 1; i <= baris; i++) { // Loop untuk setiap baris
            // Mencetak spasi
            for (int j = i; j < baris; j++) {
                System.out.print(" "); // Mencetak spasi
            }
            // Mencetak asterisk
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*"); // Mencetak asterisk
            }
            System.out.println(); // Pindah ke baris berikutnya setelah setiap baris
        }
    }
}
