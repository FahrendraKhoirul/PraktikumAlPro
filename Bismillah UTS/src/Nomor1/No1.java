
package Nomor1;
import java.util.Scanner;
public class No1 {
    public static void main(String[]Args){
        
        Scanner scan = new Scanner (System.in);
        String nama_karyawan;
        int gaji_pokok;
        int golongan;
        int gaji_total;
        int tunjangan;
        
        System.out.print("Nama Karyawan : ");
        nama_karyawan = scan.nextLine();
        System.out.print("Gaji Pokok    : ");
        gaji_pokok = scan.nextInt();
        System.out.print("Golongan      : ");
        golongan = scan.nextInt();
        System.out.println();
        
        if (golongan == 1){
            tunjangan = 500000 + 250000;
            gaji_total = gaji_pokok + tunjangan;
            System.out.println("Nama Karyawan: " + nama_karyawan);
            System.out.println("Gaji         : " + gaji_total);
                  
        } else if (golongan == 2){
            tunjangan = 300000 + 200000;
            gaji_total = gaji_pokok + tunjangan;
            System.out.println("Nama Karyawan: " + nama_karyawan);
            System.out.println("Gaji : " + gaji_total);
            
        } else {
            tunjangan = 100000 + 100000;
            gaji_total = gaji_pokok + tunjangan;
            System.out.println("Nama Karyawan: " + nama_karyawan);
            System.out.println("Gaji         : " + gaji_total);
    }
    }
    
}
