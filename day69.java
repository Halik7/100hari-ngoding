package mentor_armawan;

public class Day69 {
    
    public static void main(String[] args) {
        // Menggunakan array satu dimensi untuk menyimpan biodata
        String[] Biodata = {
            "Nama: Khaliq",
            "NIM: D0224328",
            "Angkatan: 2024"
        };
        
        System.out.println("Biodata saya: ");
        
        // Menggunakan loop for each untuk mencetak biodata
        for (String data : Biodata) { 
            System.out.println(data); // Mencetak elemen
        }
    } 
}
