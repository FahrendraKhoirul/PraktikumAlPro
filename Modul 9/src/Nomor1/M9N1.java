
package Nomor1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class M9N1 extends JFrame{
    JTextArea nama = new JTextArea(10,10);
    JButton bt = new JButton("Pindah");
    JTextArea namax = new JTextArea(10,10);

    M9N1(){
        super("INI SEBUAH FORM");
        setLocation(200,300);
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    void tampilan(){
        getContentPane().add(nama);
        nama.append("nama kamu siapa");
        getContentPane().add(bt);
        getContentPane().add(namax);
        
        getContentPane().setLayout(new FlowLayout());
        setVisible(true);
    }
    void aksi_reaksi(){
        bt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                namax.append(nama.getSelectedText());
            }
        });
    }
    
    public static void main(String[]args){
        M9N1 start = new M9N1();
        start.tampilan();
        start.aksi_reaksi();
    }
}
