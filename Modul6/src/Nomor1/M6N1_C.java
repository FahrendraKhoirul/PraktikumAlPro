package Nomor1;
import javax.swing.JOptionPane;

public class M6N1_C {
    public static void main(String[] args) {
        int data[] = new int [10];
        for(int a=0; a<data.length; a++ ){
            String elemen = JOptionPane.showInputDialog("Masukan Element Index ke " + a);
            data[a] = Integer.parseInt(elemen);
            System.out.println("Index ke"+a+ " adalah "+ data[a]);
        }
    }
}
