
import java.util.Scanner;

public class nomor2 {
    public static void main(String [] Args){
         
        int GajiKotor,GajiBersih,potongan;
        Scanner keyboard = new Scanner(System.in);
         double pajak = 0.1;
         
         System.out.print("Gaji Kotor = Rp.");
         GajiKotor = keyboard.nextInt();
         potongan =  (int) (pajak * GajiKotor);
         GajiBersih = GajiKotor - potongan;
         
         
         System.out.print("Gaji Bersih = Rp" + GajiBersih);
    }
}
