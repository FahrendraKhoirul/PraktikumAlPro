
import java.util.Scanner;

public class NewClass {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Apakah anda mahasiswa?  (ya/tidak)");
        String user = input.next();
        if ("ya".equals(user)){
            System.out.print("Masukan Pilihan Jurusan : ");
            int pilihan = input.nextInt();
            switch (pilihan){
                case 1:
                    System.out.println("Teknik Informatika");
                case 2:
                    System.out.println("Teknik Arsitektur");
                case 3:
                    System.out.println("Teknik Sipil");    
            }
        } else{
            System.out.print("Program Selesai");
        }
    }
}
