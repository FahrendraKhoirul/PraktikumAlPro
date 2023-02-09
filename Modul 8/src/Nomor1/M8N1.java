
package Nomor1;
import javax.swing.*;
import java.awt.*;

public class M8N1 extends JFrame {
    Checkbox cb1 = new Checkbox ("PILIH A");
    Checkbox cb2 = new Checkbox ("PILIH B");
    Checkbox cb3 = new Checkbox ("PILIH C");
    
    M8N1(){
        setTitle("Program GUI Pertamaku");
        setLocation(200,100);       
        setSize(400,350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    void objek(){
        getContentPane().setLayout(null);
        getContentPane().setBackground(Color.GREEN);
        getContentPane().add(cb1);
        getContentPane().add(cb2);
        getContentPane().add(cb3);
        cb1.setBounds(30, 90, 200, 10);
        cb2.setBounds(40, 120, 100, 10);
        cb3.setBounds(50, 150, 150, 10);
        setVisible(true);
    }
    
    public static void main (String[]args){
        M8N1 bam = new M8N1();
        bam.objek();
    }
}
