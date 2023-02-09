package Nomor3;
import javax.swing.JOptionPane;
import java.util.Arrays;
public class M6N3 {
    public static void main(String[]Args){
// Input         
        int panjangArray =  Integer.parseInt(JOptionPane.showInputDialog("Masukkan panjang array yg dinginkan : ");
        int array[] = new int[panjangArray];
        for (int i=0; i<panjangArray; i++){
            int input = Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka di Indeks " + (i+1) + " :");
            array[i] = input;
        }
// Array jadi
        String listArray = Arrays.toString(array);
// Terbesar dan terkecil beserta posisinya
        int nilaiTerbesar = array[0];
        int posisiTerbesar = 0;
        int nilaiTerkecil = array[0];
        int posisiTerkecil = 0;        
        for (int i=0; i<array.length; i++){
            if (array[i] > nilaiTerbesar){
                nilaiTerbesar = array[i];
                posisiTerbesar = i+1;
            }
            if (array[i] < nilaiTerkecil ||  nilaiTerkecil == array[0] ){
                nilaiTerkecil = array[i];
                posisiTerkecil = i+1;
            }
        }
// Jumlah dan ratarata dari array
        int jumlah = 0;
        for (int i=0; i<array.length; i++){
            jumlah = jumlah + array[i];
        }
        int ratarata = jumlah / array.length;
// jumlah pada indeks ganjil
        int jumlahGanjil = 0;
        for (int i=0; i<array.length; i++){
            if ( (i+1) % 2 == 1)
            jumlahGanjil = jumlahGanjil + array[i];
        }
// cek jumlahGanjil 
        String cek;
        if (jumlahGanjil % 2 == 0) 
            cek = "Jumlah semua element dari indeks ganjil adalah GENAP";
        else {
            cek = "Jumlah semua element dari indeks ganjil adalah GANJIL";
        }
// urutan array
        int arrayUrut[] = array;
        Arrays.sort(arrayUrut);
        
        JOptionPane.showMessageDialog(null,"Arraymu adalah \n" + listArray + 
                "\n\nNilai terbesar : " + nilaiTerbesar + "\nPosisi : "+ posisiTerbesar +
                "\nNilai terkecil : "  + nilaiTerkecil + "\nPosisi : "+ posisiTerkecil +
                "\n\nJumlah semua data : " + jumlah + "\nRata-rata : " + ratarata +
                "\nJumlah semua elemen pada indeks ganjil : " + jumlahGanjil + "\n" + cek +
                "\n\nUrutan elemen dari yang terkecil : \n" + Arrays.toString(arrayUrut) );       
    }    
}
