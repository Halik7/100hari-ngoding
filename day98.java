package mentor_armawan;
import java.util.Scanner;
public class Day98 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nilai x dan y
        System.out.print("Masukkan nilai x: ");
        int x = scanner.nextInt();
        System.out.print("Masukkan nilai y: ");
        int y = scanner.nextInt();

       int total = 0;

// Penjumlahan bilangan genap dari x ke y
for (int i = x; i <= y; i++) {
    if (i % 2 == 0) { // Cek apakah i genap
        total += i; // Tambahkan bilangan genap ke total
    }
}
System.out.println("Total penjumlahan bilangan genap dari " + x + " ke " + y + " adalah: " + total);
    }
}
