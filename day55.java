package mentor_armawan;
import java.util.Scanner;
public class day55 {
    
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
         System.out.print("masukkan angka : ");
        int angka = a.nextInt();
        
            // Looping untuk menampilkan nilai decrement dari angka yang dimasukkan
            for (int i = angka; i > 0; i--) { // Mulai dari angka dan decrement
                System.out.println("Nilai sekarang: " + i);
            }
        }
        
    }
