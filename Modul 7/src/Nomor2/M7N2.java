package Nomor2;
import javax.swing.JOptionPane;
public class M7N2 {
    public double persegiPanjang(int panjang, int lebar){
        return panjang*lebar;
    }
    public double segitiga(int alas, int tinggi){
        return alas*tinggi*0.5;
    }
    public double lingkaran(int jari){
       return Math.PI*jari*jari;
    }
    public int JOption(String apa){
        return Integer.parseInt(JOptionPane.showInputDialog("Masukkan " + apa));
    }
    
    public static void main (String[]args){
        M7N2 in = new M7N2();
        
        System.out.print("#PERSEGI PANJANG#\n Panjang: ");
        int panjang = in.JOption("Panjang");
        System.out.print(panjang + "\n Lebar: ");
        int lebar = in.JOption("Lebar");
        System.out.println(lebar + "\n Luas Persegi: " + in.persegiPanjang(panjang, lebar));
        
        System.out.print("#SEGITIGA#\n Alas: ");
        int alas = in.JOption("Alas");
        System.out.print(alas + "\n Tinggi: ");
        int tinggi = in.JOption("Tinggi");
        System.out.println(tinggi + "\n Luas Segitiga= " + in.segitiga(alas, tinggi) );
        
        System.out.print("#LINGKARAN#\n Jari-jari: ");
        int jari = in.JOption("Jari Jari");
        System.out.println(jari + "\n Luas Lingkaran= " + in.lingkaran(jari));
    }
}
