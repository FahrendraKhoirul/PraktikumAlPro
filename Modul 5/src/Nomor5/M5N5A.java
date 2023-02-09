
package Nomor5;
import javax.swing.*;
public class M5N5A {
    public static void main(String[]args){
        String angka = JOptionPane.showInputDialog("MAsukkan angka yang anda inginkan : ");
        int n=Integer.parseInt(angka);
        for ( int i=1; i<=n;i++){
            for( int j=1;j<=i;  j++){
                System.out.print("*");
            }
                System.out.println("");
        }
    }
}
