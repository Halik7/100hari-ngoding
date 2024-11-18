package mentor_armawan;
import java.util.Scanner;
public class Day78 {
    
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("masukkan huruf b : ");
        String b = a.nextLine();
        System.out.print("masukkan huruf c : ");
        String c = a.nextLine();
        System.out.print("masukkan huruf e : ");
        String e = a.nextLine();
        
        boolean d = b.equalsIgnoreCase(c);
        boolean f = c.equalsIgnoreCase(e);
        System.out.println("apakah huruf b dan c sama : "+d);
        System.out.println("apakah huruf c dan e sama : "+f);
        
        
    }
    
}
