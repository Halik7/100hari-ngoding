package mentor_armawan;
import java.util.Scanner;
import java.math.BigInteger;
import java.math.BigDecimal;
public class evaluasi {
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        //reference boolean
        System.out.print("masukkan nilai : ");
        boolean a = input.nextBoolean();
        System.out.println("angka 7 > 3 : " + a);//reference boolean
        
        //BigInteger
        System.out.print("Masukkan nilai BigInteger: ");
        BigInteger angka = input.nextBigInteger();
        System.out.println("Nilai BigInteger: " + angka);

        //BigDecimal
        System.out.print("Masukkan nilai BigDecimal: ");
        BigDecimal bigDecimal = input.nextBigDecimal();
        System.out.println("Nilai BigDecimal: " + bigDecimal);
        
        //konversi string ke tipe data primitif
        System.out.print("Masukkan nilai string: ");
        String inputString = input.next();
        int nilaiInt = Integer.parseInt(inputString);
        System.out.println("hasil konversi "+ nilaiInt);
    
        //konversi data primitif ke string
        System.out.print("masukkan nilai primitif :");
        int nilai = input.nextInt();
        String stringValue = String.valueOf(nilai);
        System.out.println("int ke String: " + stringValue);
        
        //type casting
        System.out.print("masukkan angka : ");
        int b =17;
        double c =(double) b;
        System.out.println("hasil casting : " +c);
        
        //input dari keyboard
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama :");
        String nama = scanner.nextLine();
        System.out.println("Nama Anda adalah: " + nama);
        
        //operator aritmatika
        System.out.print("masukkan angka :");
        int angka1 = input.nextInt();
        System.out.print("masukkan angka :");
        int angka2 = input.nextInt();
        System.out.println(angka1+angka2);
        System.out.println(angka1-angka2);
        System.out.println(angka1*angka2);
        System.out.println(angka1/angka2);
        System.out.println(angka1%angka2);
        
        //operator penugasan
        System.out.print("masukkan angka :");
        int angka3 = input.nextInt();
        System.out.print("masukkan angka :");
        int angka4 = input.nextInt();
        System.out.println(angka3+=angka4);
        System.out.println(angka3-=angka4);
        System.out.println(angka3*=angka4);
        System.out.println(angka3/=angka4);
        System.out.println(angka3%=angka4);
        
        // operator perbandingan
        System.out.print("masukkan angka :");
        int angka5 = input.nextInt();
        System.out.print("masukkan angka :");
        int angka6 = input.nextInt();
        System.out.println(angka5>angka6);
        System.out.println(angka5<angka6);
        
    }
    
}
