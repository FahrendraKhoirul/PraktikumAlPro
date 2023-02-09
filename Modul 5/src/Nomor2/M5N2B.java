
package Nomor2;
public class M5N2B {
    public static void main(String[]args){
        int faktorial5 =1;
        int faktorial4 =1;
        for (int i=5; i<=5; i++){
             faktorial5= 1;
            for (int faktor = 1; faktor<=i; faktor++){
                faktorial5 *= faktor;
            } 
        System.out.println(i + "!" + " adalah " + faktorial5 );
        }
        
        for (int j=4; j<=4; j++){
             faktorial4= 1;
            for (int faktor = 1; faktor<=j; faktor++){
                faktorial4 *= faktor;
            }
        System.out.println(j + "!" + " adalah " + faktorial4 );
        }
        
        System.out.println(faktorial4 + faktorial5 );
    }
    
}
