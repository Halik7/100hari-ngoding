package mentor_armawan;
import java.util.Scanner;
public class Day91 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Mengambil input dari pengguna
        System.out.print("Masukkan nilai Anda (0-100): ");
        int youValue = scanner.nextInt();
        
        System.out.print("Masukkan nilai saya (0-100): ");
        int myValue = scanner.nextInt();
        
        // Percabangan menggunakan logika AND
        if (youValue >= 50 && myValue >= 50) {
            System.out.println("Kita berdua lulus!");
        } else if (youValue < 50 && myValue < 50) {
            System.out.println("Kita berdua tidak lulus.");
        } else {
            System.out.println("Salah satu dari kita lulus.");
        }
        
        
    }
}
