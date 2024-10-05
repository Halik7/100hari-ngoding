package mentor_armawan;
import java.util.Scanner;
public class day34 {
    
    public static void main(String[] args) {
        
        // Membuat objek Scanner untuk mengambil input dari keyboard
        Scanner scanner = new Scanner(System.in);

        // Mengambil input berupa string
        System.out.print("Masukkan nama :");
        String nama = scanner.nextLine();

        // Mengambil input berupa integer
        System.out.print("Masukkan usia :");
        int usia = scanner.nextInt();

        // Menampilkan input yang telah diambil
        System.out.println("Nama Anda adalah: " + nama);
        System.out.println("Usia Anda adalah: " + usia + " tahun");

    }
    
}
