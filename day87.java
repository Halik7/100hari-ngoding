package mentor_armawan;
import java.util.Scanner;
public class Day87 {
    
    public static void main(String[] args) {
        
        // Mendefinisikan array satu dimensi
        int[] array = {10, 20, 30, 40, 50};

        // Mencetak elemen array sebelum perubahan
        System.out.println("Array sebelum perubahan:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("elemen ke " + (i + 1) + ": " + array[i]);
        }

        // Membaca indeks dan nilai baru dari pengguna
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan indeks yang ingin diubah (0-4): ");
        int indeks = in.nextInt();

        // Memastikan indeks valid
        if (indeks >= 0 && indeks < array.length) {
            System.out.print("Masukkan nilai baru: ");
            int nilaiBaru = in.nextInt();
            // Mengubah nilai pada indeks yang ditentukan
            array[indeks] = nilaiBaru;

            // Mencetak elemen array setelah perubahan
            System.out.println("Array setelah perubahan:");
            for (int i = 0; i < array.length; i++) {
                System.out.println("elemen ke " + (i + 1) + ": " + array[i]);
            }
        }
    }
}
