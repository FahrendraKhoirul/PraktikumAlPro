package modul.pkg4;
//import javax.swing.JOptionPane;
import java.util.Scanner;

public class M4N1nyoba {
    public static void main(String[] args) {
        int uang;
        int jual = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Hasil Jualan =");
        jual = scan.nextInt();
        
        if ( jual <= 2000000){
        uang = (int) (100000 + 0.1 * jual);
    } else if (jual <= 5000000){
        uang = (int) (200000 + 0.15 * jual);
    } else {
        uang = (int) (300000 + 0.20 * jual);
    }
    System.out.println(uang);
  //      String pesan = "Gajimu " + uang;
 //       JOptionPane.showMessageDialog(null, pesan);
        }
    }
