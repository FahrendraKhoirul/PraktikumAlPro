package tes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ALKeyboard extends JFrame {
    JButton bt = new JButton("Tekan 1,2,3,4");
    JLabel lb = new JLabel("Frame akan berubah");
    ALKeyboard(){
        setTitle("INI EVENT BUTTON");
        setSize(400,200);
        setLocation(200,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void komponen(){
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(bt);
        getContentPane().add(lb);
        setVisible(true);
    }
    
    void reaksi(){
        bt.addKeyListener(new KeyAdapter(){
           public void keyPressed(KeyEvent e){
               if(e.getKeyCode() == e.VK_1){
                   setSize(300,500);
               }
               if(e.getKeyCode() == e.VK_2){
                   setSize(200,100);
               }
               if(e.getKeyCode() == e.VK_3){
                   setSize(100,10);
               }
               if(e.getKeyCode() == e.VK_4){
                   setSize(900,200);
               }
           } 
        });
    }
    
    public static void main(String[]args){
        ALKeyboard aha = new ALKeyboard();
        aha.komponen();
        aha.reaksi();
    }
}
