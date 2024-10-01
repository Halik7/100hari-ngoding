package mentor_armawan;
import java.math.BigDecimal;
public class day30 {
    
    public static void main(String[] args) {
        
        //Tipe data reference BigDecimal 
        BigDecimal angka1 =new BigDecimal("0.05") ;
        BigDecimal angka2 =new BigDecimal("0.02") ;
        
        BigDecimal HasilPerjumlahan = angka1.add(angka2);
        
        System.out.println("hasil perjumlahan = " + HasilPerjumlahan);
    }
    
}
