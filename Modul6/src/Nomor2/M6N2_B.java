
package Nomor2;

public class M6N2_B {
    public static void main (String[]Args){
        int array[] = {1,2,3,4,5,6,7,8,9,10};
        int nilaiTerbesar = array[0];
        int posisiTerbesar = 0;
        int nilaiTerkecil = array[0];
        int posisiTerkecil = 0;
        int total = 0;
        
        for (int i=0; i<array.length; i++){
            total = total + array[i];
        }
        int ratarata = total / array.length;
        for (int i=0; i<array.length; i++){
            if (array[i] > nilaiTerbesar){
                nilaiTerbesar = array[i];
                posisiTerbesar = i+1;
            }
            else if (array[i] < nilaiTerkecil ||  nilaiTerkecil == array[0] ){
                nilaiTerkecil = array[i];
                posisiTerkecil = i+1;
            }
        }
        System.out.print("Array = {");
        for (int i=0; i<array.length; i++){
            System.out.print(array[i] +" ");
        }
        System.out.println("} \n" );
        System.out.println("Nilai maksimal  = " + nilaiTerbesar);
        System.out.println("Posisi maksimal = " + posisiTerbesar);
        System.out.println("Nilai minimal   = " + nilaiTerkecil);
        System.out.println("Posisi minimal  = " + posisiTerkecil);
        System.out.println("\nRata rata       = " + ratarata);
    }
}
