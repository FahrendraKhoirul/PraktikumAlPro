
package Nomor2;
public class M5N2C {
    public static void main(String[]args){
        
        int hasil = 1;
        int hasil2 = 1;
        
        int basis1= 4;
        int pangkat1= 2;
        for(int i=1; i<=pangkat1; i++ ){
               hasil = hasil*basis1;
           } 
           
        int basis2= 5;
        int pangkat2= 1;
        for(int i=1; i<=pangkat2; i++ ){
               hasil2 = hasil2*basis2;
           } 
        System.out.println("(4^2 + 5)/(5 + 4^2) ");
        System.out.println("=" + (hasil + hasil2)/(hasil + hasil2));
    } 
}
