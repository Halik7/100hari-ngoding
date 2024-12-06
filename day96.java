package mentor_armawan;
import java.util.Scanner;
public class Day96 {
    
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah baris diamond (berlian): ");
        int n = in.nextInt();
        
        // Bagian atas berlian
        for (int i = 1; i <= n; i++) {
            // Mencetak spasi
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Mencetak bintang
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Bagian bawah berlian
        for (int i = n - 1; i >= 1; i--) {
            // Mencetak spasi
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Mencetak bintang
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        in.close();
    }
}
