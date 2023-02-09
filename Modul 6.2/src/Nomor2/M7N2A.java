
package Nomor2;
public class M7N2A {
    public static void main(String[]args){
        int data2[][]={{4,6,4,2,8,4,2,10},{0,6,4,2,8,4,2,10}};
        int i=0;
 
        do{
            int j=0;
            while(j<data2[i].length){
                System.out.print(data2[i][j]+" ");
                j++; 
            }
            System.out.println();     
            i++;
        } while(i<data2.length)
    }
}
