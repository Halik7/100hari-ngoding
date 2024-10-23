package mentor_armawan;
import java.util.Scanner;
public class day52 {
    
    public static void main(String[] args) {
       Scanner c = new Scanner (System.in);
        System.out.print("masukkan nilai :");
        int a = c.nextInt();
        System.out.print("masukkan nilai :");
        int b = c.nextInt();

        // Menggunakan operator ternary untuk menentukan nilai maksimum
        int maksimum = (a > b) ? a : b;

        // Menampilkan hasil
        System.out.println("Nilai maksimum adalah: " + maksimum);
    }
}
