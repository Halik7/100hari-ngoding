package mentor_armawan;
import java.util.Scanner;
public class day51 {
    
    public static void main(String[] args) {
        
        Scanner b = new Scanner(System.in);

        System.out.print("Masukkan grade (A, B, C, D): ");
        char nilai = b.next().charAt(0); // Membaca karakter pertama dari input

        switch (nilai) {
            case 'A':
                System.out.println("Anda mendapatkan nilai sangat baik!");
                break;
            case 'B':
                System.out.println("Anda mendapatkan nilai baik.");
                break;
            case 'C':
                System.out.println("Anda mendapatkan nilai cukup.");
                break;
            case 'D':
                System.out.println("Anda mendapatkan nilai kurang.");
                break;
            default:
                System.out.println("Nilai tidak valid.");
        }
        
    }
}
