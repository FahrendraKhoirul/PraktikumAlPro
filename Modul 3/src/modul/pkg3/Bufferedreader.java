
package modul.pkg3;

/**
 *
 * @author USER
 */
import java.io.*; 

public class Bufferedreader {
    public static void main (String [] Args){
        BufferedReader dataIn = new BufferedReader (new InputStreamReader(System.in));
        String angka1 = "";
        String angka2 = "";
        String angka3 = "";
        
        try{
        System.out.print("Masukkan angka pertama = ");
        angka1 = dataIn.readLine();
        }catch ( IOException e ){
            System.out.println("Error");
        }        
        try{
        System.out.print("Masukkan angka kedua = ");
        angka2 = dataIn.readLine();
        }catch ( IOException e ){
            System.out.println("Error");
        }        
        try{
        System.out.print("Masukkan angka ketiga = ");
        angka3 = dataIn.readLine();
        }catch ( IOException e ){
            System.out.println("Error");
        }        
        System.out.println("Angka anda " + angka1 + ", " + angka2 + ", " + angka3 + ", " );
    }
}
