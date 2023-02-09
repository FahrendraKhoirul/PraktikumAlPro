package Nomor2;
import java.util.Scanner;
public class M5N2A1 {
    public static void main(String[]Args){
        
        Scanner scan = new Scanner(System.in);
        int angka, akar;
        
         System.out.print("Angka : ");
         angka = scan.nextInt();
         System.out.print("Akar dari : ");
         akar = scan.nextInt();
         
        for(int i=1; i<=20; i++ ){
               int hasil = i*i;
               if (hasil == angka){
                   System.out.println(i);
                   break;
               } 
               else {
                   if (hasil >= angka){
                       System.out.print("Dak Ada Mad!!");
                       break;
                   }
               }
           }     
    }
}
    

