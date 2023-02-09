
package Nomor4;

import javax.swing.JOptionPane;

public class M7N4A {
    public static void main(String[]args){
        int matriks[][]={{2,9,1,5},{5,17,10,4}};
        int posisi = Integer.parseInt(JOptionPane.showInputDialog
                ("Menentukan Posisi Element\n\nMatriks 1   Matriks2\n"
                +matriks[0][0]+"  "+matriks[0][1]+"              "+matriks[1][0]+"  "+matriks[1][1]+ "\n"
                +matriks[0][2]+"  "+matriks[0][3]+"              "+matriks[1][2]+"  "+matriks[1][3]+ "\n\n"
                + "Pilih elemen : ");
        
        String posMatriks = "";
        int indeks = 0;
        
        for(int i=0;i<matriks.length;i++){
            for(int j=0;j<matriks[i].length;j++){
                if(posisi == matriks[i][j]){
                    if(i==0){
                        posMatriks = "Matriks 1";
                    } else if(posisi==1){
                        posMatriks = "Matriks 2";
                    }
                    indeks = j;
                }
            }
        }
        JOptionPane.showMessageDialog
                (null,"Menentukan Posisi Element\n\nMatriks 1   Matriks2\n"
                +matriks[0][0]+"  "+matriks[0][1]+"              "+matriks[1][0]+"  "+matriks[1][1]+ "\n"
                +matriks[0][2]+"  "+matriks[0][3]+"              "+matriks[1][2]+"  "+matriks[1][3]+ "\n\n"
                + "Elemen "+ posisi+ "\nPosisi  : " + posMatriks + "\nIndeks : "+ indeks);
    }
}
