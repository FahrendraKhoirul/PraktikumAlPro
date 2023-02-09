
package Nomor5;
import javax.swing.*;
public class M5N5B_3{
    public static void main(String[]args){
        String angka = JOptionPane.showInputDialog("Masukkan angka yang anda inginkan : ");
        int n=Integer.parseInt(angka);
        for ( int i=0; i<n ;i++){  
            
            for ( int k=0; k<=i; k++){
                if (k==0) continue;
                System.out.print("+");
            }
                for ( int m=n-i; m>=1; m--){
                System.out.print(m);   
            }  
            System.out.println("");
        }
        }
    }

