package mentor_armawan;
import java.util.Scanner;
public class day49 {
    
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        System.out.print("masukkan angka : ");
        int b = a.nextInt();
        System.out.print("masukkan angka : ");
        int c = a.nextInt();
        
        if(b >= c ){
        System.out.println("b lebih besar sama dengan dari c");  
        }else if(b==c){
        System.out.println("b sama dengan c");
        }else{
         System.out.println("NOL");
        }
        
        
    }
    
}
