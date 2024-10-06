package mentor_armawan;
import java.util.Scanner;
public class day35 {
    
    public static void main(String[] args) {
        
        // Aritmatika perjumlahan dan pengurangan
         Scanner input = new Scanner (System.in);
        System.out.println("masukkan angka :");
        int angka1 = input.nextInt();
        System.out.println("masukkan angka :");
        int angka2 = input.nextInt();
        int hasilPerjumlahan = angka1 + angka2 ;
        int hasilPengurangan = angka1 - angka2 ;
        System.out.println("perjumlahan :"+hasilPerjumlahan);
        System.out.println("pengurangan :"+hasilPengurangan);
        
        input.close();
        
    }
    
}
