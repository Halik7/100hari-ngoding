package mentor_armawan;

public class Day68 {

    // Metode untuk menjumlahkan dua angka
    public int jumlah(int a, int b) {
        int hasil = a + b; // Menghitung jumlah
        return hasil; // Mengembalikan hasil
    }

    public static void main(String[] args) {
        Day68 a = new Day68();
        
        // Memanggil metode jumlah dan menyimpan hasilnya
        int hasilJumlah = a.jumlah(5, 10);
        
        // Menampilkan hasil
        System.out.println("Hasil penjumlahan : " + hasilJumlah);
    }
  }
