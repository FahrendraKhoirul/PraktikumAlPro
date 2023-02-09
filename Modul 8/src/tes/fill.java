
package tes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class fill extends JFrame{
    JTextArea nama = new JTextArea(10,10);
    JButton bt = new JButton("Pindah");
    JTextArea namax = new JTextArea(10,10);

    fill(){
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
        bt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                namax.append(nama.getSelectedText());
            }
        });
        getContentPane().setLayout(new FlowLayout());
        setVisible(true);
    }
    
    public static void main(String[]args){
        fill start = new fill();
        start.tampilan();
    }
}
