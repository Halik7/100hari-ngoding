package mentor_armawan;
import java.util.Scanner;
public class day46 {
    
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        System.out.print("Masukan nilai b = ");
        int b = a.nextInt();
         System.out.print("Masukan nilai c = ");
        int c = a.nextInt();
        
        boolean d = !(b >= c);
        boolean e = !(c <= b);
                   
         System.out.println("Apakah b lebih besar sama dengan dari c = "+d);
         System.out.println("Apakah c lebih kecil sama dengan dari b  = "+e);
        
        
    }
            
        }
