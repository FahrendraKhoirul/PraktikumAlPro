
package Nomor4;

import java.io.Console;

public class M5N4 {
    public static void main(String[]args){
    
        int angka;
        
        Console con = System.console();
        System.out.print("Masukkan Angka = ");
        angka = Integer.parseInt(con.readLine());
      
        if ( angka % 2 == 0 ){
            System.out.print(angka + " adalah bilangan genap");
        } else {
            System.out.print(angka + " adalah bilangan ganjil");
        }
}
}
