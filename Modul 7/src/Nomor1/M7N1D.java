
package Nomor1;
import java.util.Scanner;

public class M7N1D {
    public double volume_tabung(int jari2, int tinggi){
        double volume = Math.PI*Math.pow(jari2, 2)*tinggi;
        return volume;
    }
    
    public double volume_bola(int jari2){
        double volume = Math.PI*Math.pow(jari2, 3)*4/3;
        return volume;
    }
    
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("#Hitung Volume Bangun Ruang#");
        System.out.println("Pilih 'bola' atau 'tabung'");
        System.out.print("input : ");
        String bangun = scan.nextLine();
        M7N1D hitung = new M7N1D();
        
        if ( "bola".equals(bangun)){
            System.out.print("Jari-jari: ");
            int jari = Integer.parseInt(scan.nextLine());
            System.out.println("Volume Bola= " + hitung.volume_bola(jari));
        } else if ( "tabung".equals(bangun)){
            System.out.print("Jari-jari: ");
            int jari = Integer.parseInt(scan.nextLine());
            System.out.print("Tinggi: ");
            int tinggi = Integer.parseInt(scan.nextLine());
            System.out.println("Volume Tabung= " +hitung.volume_tabung(jari, tinggi));
        } else if ( !"bola".equals(bangun) && !"tabung".equals(bangun)){
            System.out.println("Maaf, tidak ada bangun ruang yang diinginkan");
        }
    }
}
