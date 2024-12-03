package mentor_armawan;

public class Day93 {
    
    public static void main(String[] args) {

        int tinggi = 5; // Tinggi pola

        for (int i = 0; i < tinggi; i++) {
            for (int j = 0; j < tinggi * 2 - 1; j++) {
                if (j == tinggi - 1 - i || j == tinggi - 1 + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
