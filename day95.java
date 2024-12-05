package mentor_armawan;

import java.util.Scanner;

public class Day95 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah baris untuk segitiga siku-siku: ");
        int n = input.nextInt();  // Mengambil input dari pengguna untuk jumlah baris segitiga siku-siku
        
        // Mencetak segitiga siku-siku
        cetakSegitigaSiku(n);
        
        System.out.print("Masukkan jumlah baris untuk segitiga terbalik: ");
        int p = input.nextInt();  // Mengambil input dari pengguna untuk jumlah baris segitiga terbalik
        
        // Mencetak segitiga terbalik
        cetakSegitigaTerbalik(p);
        
        input.close();  // Menutup scanner
    }

    // Metode untuk mencetak segitiga siku-siku
    private static void cetakSegitigaSiku(int baris) {
        for (int i = 1; i <= baris; i++) {  // Loop untuk setiap baris
            for (int j = 1; j <= i; j++) {  // Loop untuk mencetak karakter bintang pada setiap baris
                System.out.print("*");
            }
            System.out.println();  // Pindah ke baris berikutnya setelah mencetak semua bintang pada baris tersebut
        }
    }

    // Metode untuk mencetak segitiga terbalik
    private static void cetakSegitigaTerbalik(int baris) {
        for (int i = baris; i >= 1; i--) {  // Loop untuk setiap baris dari bawah ke atas
            for (int j = 1; j <= i; j++) {  // Loop untuk mencetak karakter bintang pada setiap baris
                System.out.print("*");
            }
            System.out.println();  // Pindah ke baris berikutnya setelah mencetak semua bintang pada baris tersebut
        }
    }
}
