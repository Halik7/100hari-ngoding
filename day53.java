package mentor_armawan;
import java.util.Scanner;
public class day53 {
    
    public static void main(String[] args) {
         Scanner a = new Scanner (System.in);
         System.out.print("masukkan angka : ");
        int angka = a.nextInt();
        // Looping for
        for (int i = 1; i <= angka; i++) {
            System.out.println("iterasi ke - "  + i);
        }
    }
}
