
package Nomor2;
import javax.swing.JOptionPane;
public class M6N2_C {
    public static void main (String[]Args){
        int array[] = {1,2,3,4,5,6,7,8,9,10};
        String list = Integer.toString(array[0]);
        for (int i=1; i<array.length; i++){
            list = list + ", " + array[i];
        }
        
        int ditanya = Integer.parseInt(JOptionPane.showInputDialog("Array : " + list + "\n\nPilih angka yang ingin diganti"));
        int ganti =  Integer.parseInt(JOptionPane.showInputDialog("Ganti dengan angka baru : ");
        
        for (int i=0; i<array.length; i++){
            if (ditanya == array[i]){
                array[i] = ganti;
            }
        }
        String listUpdate = Integer.toString(array[0]);
        for (int i=1; i<array.length; i++){
            listUpdate = listUpdate + ", " + array[i];
        }
        
        JOptionPane.showMessageDialog(null,"Sebelum \nArray : " + list + "\nSesudah\nArray : " + listUpdate );
    }
}
