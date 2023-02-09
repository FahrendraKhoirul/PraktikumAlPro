
package Nomor3;

import java.util.Scanner;

public class Nomor3 {
    public static void main(String[]Args){
        
        int angka;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan angka: ");
        angka = scan.nextInt();
        
        for(int i=1; i<=angka; i++){
            
            for (int j=angka-1; j>=i; j--){
                System.out.print(" ");
            }
            
            for (int b=1; b<=i*2-1; b++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
