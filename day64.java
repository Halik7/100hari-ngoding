package mentor_armawan;

public class day64 {
    
    public static void main(String[] args) {
        
        luarLoop: // Label untuk outer loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("iterasi luar loop : " + i);
            for (int j = 1; j <= 5; j++) {
                System.out.println("iterasi dalam loop : " + j);
                // Jika j sama dengan 3, keluar dari outer loop
                if (j == 3) {
                    break luarLoop; // Menghentikan eksekusi dari outer loop
                }
            }
        }
        System.out.println("Loop telah dihentikan.");
    }
}
