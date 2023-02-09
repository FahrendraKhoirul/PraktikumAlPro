
package Nomor4;
public class M7N4B {
    public static void main(String[]args){
        int matriks[][]={{2,9,1,5},{5,17,10,4}};
        System.out.println("Matriks 1\tMatriks 2");
        System.out.print(matriks[0][0]+" "+matriks[0][1]+"\t\t");
        System.out.println(matriks[1][0]+" "+matriks[1][1]);
        System.out.print(matriks[0][2]+" "+matriks[0][3]+"\t\t");
        System.out.println(matriks[1][2]+" "+matriks[1][3]+"\n");
        
        int[] matriksJumlah = new int(matriks[0].length);
        for(int i=0;i<matriks[0].length;i++){
            matriksJumlah[i]= matriks[0][i]+ matriks[1][i];
        }
        System.out.println("Matriks Hasil Jumlah");
        System.out.println(matriksJumlah[0] +" "+ matriksJumlah[1]);
        System.out.println(matriksJumlah[2] +" "+ matriksJumlah[3]);
    }
}
