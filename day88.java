package mentor_armawan;

public class Day88 {
    public static void main(String[] args) {
        
        String nama = "asep"; // nama anggota
        int umur = 19; // umur anggota 
        boolean status_keanggotaan = true; // status keanggotaan true = member , false = non member 

        System.out.printf("nama : " +nama);
        System.out.printf(" ,umur : "  +umur + "tahun ");
        System.out.printf(" ,Status Keanggotaan : " + status_keanggotaan);
        
        if (umur > 18) {
            System.out.println(" Selamat, Anda memenuhi syarat untuk keanggotaan premium.");
        } else {
            System.out.println(" Maaf, Anda belum memenuhi syarat untuk keanggotaan premium.");
        }
        
    }
}
