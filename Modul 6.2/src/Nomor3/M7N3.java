
package Nomor3;
public class M7N3 {
    public static void main(String[]args){
        String data [][] = {{"ABDUL", "085646668991", "Kediri"}, {"KUSNO", "085646668992",
        "Trenggalek"}, {"PONIRAN", "085646668999", "Bojonegoro"}};
        System.out.println("Nama\tAlamat\t\tTelepon");
        for(int i=0; i<data.length;i++){
            for(int j=0;j<data[0].length;j++){
                if(j==1&&i==0){
                    System.out.print(data[0][2] + "\t\t");
                } else if(j==1){
                    System.out.print(data[i][2] + "\t");
                } else if(j==2){
                    System.out.print(data[i][1] + "\t");
                } else {
                    System.out.print(data[i][j] + "\t");
                }  
            }
            System.out.println();
        }
    }
}
