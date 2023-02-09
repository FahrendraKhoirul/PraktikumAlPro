
package Nomor1;
public class M7N1A {
    public void segiempat(int panjang, int lebar){
    double luas;
    double keliling;
    luas = panjang * lebar;
    System.out.println("------------------------");
    System.out.println("Panjang Segi Empat = "+ panjang);
    System.out.println("Lebar Segi Empat = "+ lebar);
    System.out.println("Luas Segi Empat = "+ luas);
    }
    public static void main(String[] args) {
        M7N1A se = new M7N1A();
        se.segiempat(10,5);
    }
    
}
