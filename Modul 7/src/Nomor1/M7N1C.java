
package Nomor1;
public class M7N1C {
// Fungsi 
    public double luas_lingkaran(int diameter){
        int jari2 = diameter/2;
        double luas = Math.PI*Math.pow(jari2, 2);
        return luas;
    }
// Prosedur
    public void hitungLuasLingkaran(int jari2){
        double luas = Math.PI*Math.pow(jari2, 2);
        System.out.print(luas);
    }
    
    public static void main(String[]args){
        M7N1C mt = new M7N1C();
        mt.hitungLuasLingkaran(20);
        System.exit(0);
    }
}
