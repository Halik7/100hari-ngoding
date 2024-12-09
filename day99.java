package mentor_armawan;
import java.util.Scanner;
public class Day99 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kalkulator Sederhana");
        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        System.out.println("Pilih operasi: ");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");

        int pilihan = scanner.nextInt();
        double hasil;

        switch (pilihan) {
            case 1:
                hasil = angka1 + angka2;
                System.out.println("Hasil: " + angka1 + " + " + angka2 + " = " + hasil);
                break;
            case 2:
                hasil = angka1 - angka2;
                System.out.println("Hasil: " + angka1 + " - " + angka2 + " = " + hasil);
                break;
            case 3:
                hasil = angka1 * angka2;
                System.out.println("Hasil: " + angka1 + " * " + angka2 + " = " + hasil);
                break;
            case 4:
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                    System.out.println("Hasil: " + angka1 + " / " + angka2 + " = " + hasil);
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }

        scanner.close();
    }
}
