package Nomor3;

import java.util.Scanner;

public class M5N3B {
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        int angka;
        
        System.out.print("Masukkan angka = ");
        angka = input.nextInt();
        
        switch (angka) {
            case 1:
                System.out.print("angkamu adalah satu");
                break;
            case 2:
                System.out.print("angkamu adalah dua");
                break;
            case 3:
                System.out.print("angkamu adalah tiga");
                break;
            case 4:
                System.out.print("angkamu adalah empat");
                break;
            case 5:
                System.out.print("angkamu adalah lima");
                break;
            case 6:
                System.out.print("angkamu adalah enam");
                break;
            case 7:
                System.out.print("angkamu adalah tujuh");
                break;
            case 8:
                System.out.print("angkamu adalah delapan");
                break;
            case 9:
                System.out.print("angkamu adalah sembilan");
                break;
            case 10:
                System.out.print("angkamu adalah sepuluh");
                break;
            default:
                System.out.print("invalid number");
                break;
        }
}}
