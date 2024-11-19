package mentor_armawan;

public class Mahasiswa {
    
    private String nama; // Atribut untuk menyimpan nama
    private int umur;    // Atribut untuk menyimpan umur

    // Konstruktor
    public Mahasiswa(String nama, int umur) {
        this.nama = nama; // Menggunakan this untuk membedakan antara parameter dan atribut
        if(umur < 0){
        throw new IllegalArgumentException("Umur tidak boleh negatif");
        }  
        this.umur = umur;
    }
    // Metode toString untuk mengembalikan representasi string dari objek
    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nama= '" + nama + '\'' +
                ", umur : " + umur + " tahun" +
                '}';
    }

    public static void main(String[] args) {
        Mahasiswa unsulBar = new Mahasiswa("Halik", 18);
        System.out.println(unsulBar.toString()); // Memanggil metode toString()
    }
}
