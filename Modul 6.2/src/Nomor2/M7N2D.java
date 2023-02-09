
package Nomor2;
public class M7N2D {
    public static void main(String[]args){
        int data2[][]={{4,6,4,2,8,4,2,10},{4,6,4,2,8,4,2,10}};
        int total=0;  
         for(int i=0; i<data2.length;i++){
            for(int j=0;j<data2[0].length;j++){
                if(i==0 || (i%2==0)){
                    total = total + data2[i][j];
                }
                System.out.print(data2[i][j]+" ");       
            }
            System.out.println();
        }
        System.out.println("Jumlah element kolom indeks genap : "+ total);
    }
}
