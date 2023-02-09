package modul.pkg4;
import javax.swing.JOptionPane;

public class M4N1 {
    public static void main(String[] args) {
        int uang;
        int jual;
        String awal = JOptionPane.showInputDialog("Hasil Penjualan");
        jual = Integer.parseInt(awal);
        
        if ( jual <= 2000000){
        uang = (int) (100000 + 0.1 * jual);
    } else if (jual <= 5000000){
        uang = (int) (200000 + 0.15 * jual);
    } else {
        uang = (int) (300000 + 0.20 * jual);
    }
    
        String pesan = "Gajimu " + uang;
        JOptionPane.showMessageDialog(null, pesan);
        }
    }
    

