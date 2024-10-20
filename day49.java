package mentor_armawan;
import java.util.Scanner;
public class day49 {
    
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        System.out.print("masukkan waktu : ");
        int waktu = a.nextInt();
        
        if(waktu < 10 ){
        System.out.println("pagi");  
        }else if(waktu >= 20){
        System.out.println("siang");
        }else{
         System.out.println("sore");
        }
        
        
    }
    
}
