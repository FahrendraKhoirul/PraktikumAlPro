
package Nomor2;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class M7N2C {
    public static void main(String[]args){
        int data2[][]={{4,6,4,2,8,4,2,10},{4,6,4,2,8,4,2,10}};
        String list1 = Arrays.toString(data2[0]);   
        String list2 = Arrays.toString(data2[1]);
        String list1lama = list1;
        String list2lama = list2;
        int baris = Integer.parseInt(JOptionPane.showInputDialog("Mengganti element array\n\n"
                +list1+"\n"+list2+"\n\nPilih indeks baris element (0-1) yang akan diganti :  "));
        int kolom = Integer.parseInt(JOptionPane.showInputDialog("Mengganti element array\n\n"
                +list1+"\n"+list2+"\n\nPilih indeks kolom element (0-7) yang akan diganti :  "));
        int eleBaru = Integer.parseInt(JOptionPane.showInputDialog("Mengganti element array\n\n"
                +list1+"\n"+list2+"\n\nGanti element dengan element baru :  "));
        data2[baris][kolom]= eleBaru;
        list1 = Arrays.toString(data2[0]);   
        list2 = Arrays.toString(data2[1]);
        JOptionPane.showMessageDialog(null, "Mengganti element array\n\nSebelum\n"
                + list1lama +"\n"+ list2lama +"\n\nSesudah\n"+list1+"\n"+list2);
    }
}

