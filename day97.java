package mentor_armawan;
import java.util.Scanner;
public class Day97 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();
        
        System.out.println("Bilangan prima dari 1 hingga " + n + " adalah:");
        for (int i = 2; i <= n; i++) {
            if (isPrima(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Metode untuk memeriksa apakah suatu angka adalah bilangan prima
    public static boolean isPrima(int angka) {
        if (angka < 2) {
            return false; // Angka kurang dari 2 bukan bilangan prima
        }
        for (int i = 2; i <= Math.sqrt(angka); i++) {
            if (angka % i == 0) {
                return false; // Jika angka dapat dibagi oleh i, maka bukan bilangan prima
            }
        }
        return true; // Jika tidak ada pembagi, maka angka adalah bilangan prima
    }
}
