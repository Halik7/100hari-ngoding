package mentor_armawan;

public class Day90 {
    public static void main(String[] args) {
        // Array dengan nilai-nilai yang diberikan
        double[] angka = {
            91.35, 4.72, 26, 3.5, 8, 61, 65.36, 12, 5.6, 
            7.11, 27, 9.53, 549, 2.23, 17.31, 4.25, 2.13, 
            83, 7, 102.4, 53.21, 3.42, 0.21, 70.02, 
            819.4, 6173, 4.25, 19.8, 17.35, 5.768
        };
        
        // Inisialisasi variabel untuk min, max, sum
        double min = angka[0];
        double max = angka[0];
        double sum = 0;

        // Loop untuk menghitung min, max, dan sum
        for (double value : angka) {
            if (value < min) {
                min = value; // Mencari nilai minimum
            }
            if (value > max) {
                max = value; // Mencari nilai maksimum
            }
            sum += value; // Menjumlahkan semua nilai
        }

        // Menghitung rata-rata
        double average = sum / angka.length;

        // Menampilkan hasil
        System.out.println("Nilai Minimum: " + min);
        System.out.println("Nilai Maksimum: " + max);
        System.out.println("Total Nilai: " + sum);
        System.out.println("Rata-rata Nilai: " + average);
    
    }
}
