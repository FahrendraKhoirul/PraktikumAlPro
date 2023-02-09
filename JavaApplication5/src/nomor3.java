public class nomor3 {
     public static void main(String [] Args){
         int BiayaHaji = 50000000;
         int DP = 10000000;
         int Sisa = BiayaHaji - DP;
         int Cicilan =  Sisa / 24;
         System.out.println(Cicilan);
     }
}
