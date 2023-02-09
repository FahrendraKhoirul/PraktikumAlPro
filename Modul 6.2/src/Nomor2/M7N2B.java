
package Nomor2;
public class M7N2B {
    public static void main(String[]args){
        int data2[][]={{4,6,4,2,8,4,2,10},{4,6,4,2,8,4,2,10}};
        int i=0;
        
        int total=0;   
        do{
            int j=0;
            while(j<data2[0].length){
                System.out.print(data2[i][j]+" ");
                total = total + data2[i][j];
                j++;
            }
        System.out.println();
        i++; 
        }while(i<data2.length);
        int ratarata= total/data2[0].length*data2.length;
        System.out.println("Rata-rata = "+ ratarata);
    }
}
