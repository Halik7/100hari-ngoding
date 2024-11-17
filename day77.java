package mentor_armawan;
import java.util.Scanner;
public class Day77 {
    
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("masukkan huruf1 : ");
        String str1 = a.nextLine();
        System.out.print("masukkan huruf2 : ");
        String str2 = a.nextLine();
        
        // Menggunakan equals() untuk membandingkan string
        if (str1.equals(str2)) {
            System.out.println("str1 dan str2 sama.");
        } else {
            System.out.println("str1 dan str2 tidak sama.");
        }
    }
}
