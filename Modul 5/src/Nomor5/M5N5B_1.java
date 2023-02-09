
package Nomor5;
import javax.swing.*;
public class M5N5B_1 {
    public static void main(String[]args){
        String angka = JOptionPane.showInputDialog("MAsukkan angka yang anda inginkan : ");
        int n=Integer.parseInt(angka);
        for ( int i=1; i<=n;i++){
            
            for( int j=n; j>=i; j--){
                System.out.print("*");
            } 
            for (int k=0; k<=i;k++){
                System.out.print(" ");
            }
            for( int j=n; j>=i; j--){
                System.out.print("*");
            } 
            System.out.println("");
        }
    }
}
