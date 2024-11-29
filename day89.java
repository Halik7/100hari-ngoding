package mentor_armawan;

public class Day89 {
public static void main (String[]args){
       int [] nilaiUjian = {85,90,78,88,92};
       for(int i = 0; i < nilaiUjian.length; i++){
           System.out.println("elemen  ke " + (i + 1) + ": " + nilaiUjian[i]);
       } 
      nilaiUjian[3] = 89;
      for(int nilai : nilaiUjian){
          System.out.println("elemen ke " + nilai);
          }
      double total = 0;
      for(int nilai : nilaiUjian){
          total += nilai;  
      }
      double rataRata = total / nilaiUjian.length;
      System.out.println("nilai rata rata : " + rataRata);
  }
}
