package mentor_armawan;
import java.util.Scanner;
public class day39 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("masukkan angka :");
        int a = input.nextInt();
        System.out.print("masukkan angka :");
        int b = input.nextInt();
        a %= b;
       System.out.println("hasil sisa bagi : " + a);
    }
    
}
