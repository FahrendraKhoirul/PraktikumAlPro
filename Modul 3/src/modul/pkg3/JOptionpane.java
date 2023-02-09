
package modul.pkg3;

import javax.swing.JOptionPane; 

public class JOptionpane {
    public static void main (String [] Args){
        String angka1 = "";
        String angka2 = "";
        String angka3 = "";
        angka1 = JOptionPane.showInputDialog("Masukkan angka pertama");
        angka2 = JOptionPane.showInputDialog("Masukkan angka kedua");
        angka3 = JOptionPane.showInputDialog("Masukkan angka ketiga");
        String pesan = "Angkamu " + angka1 + ", " + angka2 + ", " + angka3 + ", ";
        JOptionPane.showMessageDialog(null, pesan);
    }
}
