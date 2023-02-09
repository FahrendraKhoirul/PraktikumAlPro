package uas.alpro;

import java.util.Scanner;

public class UASAlproIfSwitch {
    
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("(IF ELSE) Masukkan Nilai : ");
        int nilai = in.nextInt();
        
        if (nilai >= 70){
            System.out.println("LULUS");          
        }else {
            System.out.println("GAGAL");
        }
        
        System.out.println();
        
        System.out.print("(SWITCH) Masukkan warna lampu lalu lintas : ");
        String warna = in.next();
        switch (warna){
            case "merah" :
                System.out.println("Berhenti");
                break;
            case "kuning" :
                System.out.println("Hati-Hati");
                break;
            case "hijau" :
                System.out.println("Silahkan Jalan");
                break;
            default:
                System.out.println("Warna lampu salah");
        }
    }        
}
