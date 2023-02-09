package calculator;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Calculator extends JFrame {
    
    JTextArea nulis = new JTextArea();
    //JTextField nulis = new JTextField();
    JButton angka0 = new JButton("0");
    JButton angka1 = new JButton("1");
    JButton angka2 = new JButton("2");
    JButton angka3 = new JButton("3");
    JButton angka4 = new JButton("4");
    JButton angka5 = new JButton("5");
    JButton angka6 = new JButton("6");
    JButton angka7 = new JButton("7");
    JButton angka8 = new JButton("8");
    JButton angka9 = new JButton("9");
    JButton C = new JButton("C");
    JButton equals = new JButton("=");
    JButton kali = new JButton("*");
    JButton bagi = new JButton("/");
    JButton tambah = new JButton("+");
    JButton kurang = new JButton("-");
    
    double num1;
    double num2;
    String operasi;
    
    
    Calculator(){
        setTitle("Kalkulator");
        setLocation(500,500);
        setSize(255,375);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    void isinya(){
        getContentPane().setLayout(null);
        getContentPane().setBackground(new Color(90,79,92));
        getContentPane().add(nulis);
        getContentPane().add(angka1).setBackground(Color.white);
        getContentPane().add(angka2).setBackground(Color.white);
        getContentPane().add(angka3).setBackground(Color.white);
        getContentPane().add(tambah).setBackground(Color.white);
        getContentPane().add(angka4).setBackground(Color.white);
        getContentPane().add(angka5).setBackground(Color.white);
        getContentPane().add(angka6).setBackground(Color.white);
        getContentPane().add(kurang).setBackground(Color.white);
        getContentPane().add(angka7).setBackground(Color.white);
        getContentPane().add(angka8).setBackground(Color.white);
        getContentPane().add(angka9).setBackground(Color.white);
        getContentPane().add(kali).setBackground(Color.white);
        getContentPane().add(angka0).setBackground(Color.white);
        getContentPane().add(C).setBackground(Color.white);
        getContentPane().add(equals).setBackground(new Color(245,166,35));
        getContentPane().add(bagi).setBackground(Color.white); 
        
        
        Font font1 = new Font("SansSerif", Font.BOLD, 20);
        nulis.setFont(font1);
        angka0.setFont(font1);
        angka1.setFont(font1);
        angka2.setFont(font1);
        angka3.setFont(font1);
        angka4.setFont(font1);
        angka5.setFont(font1);
        angka6.setFont(font1);
        angka7.setFont(font1);
        angka8.setFont(font1);
        angka9.setFont(font1);
        C.setFont(font1);
        tambah.setFont(font1);
        equals.setFont(font1);
        kali.setFont(font1);
        bagi.setFont(font1);
        kurang.setFont(font1);
     
        nulis.setBounds(10,10,230,80);
        angka7.setBounds(10,100,50,50);
        angka8.setBounds(70,100,50,50);
        angka9.setBounds(130,100,50,50);
        tambah.setBounds(190,100,50,50);
        
        angka4.setBounds(10,160,50,50);
        angka5.setBounds(70,160,50,50);
        angka6.setBounds(130,160,50,50);
        kurang.setBounds(190,160,50,50);
        
        angka1.setBounds(10,220,50,50);
        angka2.setBounds(70,220,50,50);
        angka3.setBounds(130,220,50,50);
        kali.setBounds(190,220,50,50);
        
        angka0.setBounds(10,280,50,50);
        C.setBounds(70,280,50,50);
        equals.setBounds(130,280,50,50);
        bagi.setBounds(190,280,50,50);
        
        setVisible(true);
    }
    
    void backend(){
        angka0.addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e){
                nulis.setText(nulis.getText() + "0");
            }
        });
        angka1.addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e){
                nulis.setText(nulis.getText() + "1");
            }
        });
        angka2.addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e){
                nulis.setText(nulis.getText() + "2");
            }
        });
        angka3.addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e){
                nulis.setText(nulis.getText() + "3");
            }
        });
        angka4.addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e){
                nulis.setText(nulis.getText() + "4");
            }
        });
        angka5.addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e){
                nulis.setText(nulis.getText() + "5");
            }
        });
        angka6.addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e){
                nulis.setText(nulis.getText() + "6");
            }
        });
        angka7.addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e){
                nulis.setText(nulis.getText() + "7");
            }
        });
        angka8.addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e){
                nulis.setText(nulis.getText() + "8");
            }
        });
        angka9.addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e){
                nulis.setText(nulis.getText() + "9");
            }
        });
        
        C.addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e){
                nulis.setText("");
            }
        });
        
        C.addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e){
                nulis.setText("");
            }
        });
        
        equals.addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e){
               num2 = Double.parseDouble(nulis.getText());
               double sum;             
               if(operasi.equals("+")){
                   sum = num1+num2;
                   nulis.setText(String.valueOf(sum));
               } else if(operasi.equals("-")){
                   sum = num1-num2;
                    nulis.setText(String.valueOf(sum));                
               } else if(operasi.equals("*")){
                   sum = num1*num2;
                    nulis.setText(String.valueOf(sum));                 
               } else if(operasi.equals("/")){
                   sum = num1/num2;
                    nulis.setText(String.valueOf(sum));                           
               }
            }
        });
        
        tambah.addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e){
               num1 = Double.parseDouble(nulis.getText());
               operasi = "+";
               nulis.setText("");
            }
        });
        
        kurang.addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e){
               num1 = Double.parseDouble(nulis.getText());
               operasi = "-";
               nulis.setText("");
            }
        });
        
        kali.addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e){
               num1 = Double.parseDouble(nulis.getText());
               operasi = "*";
               nulis.setText("");
            }
        });
        
        bagi.addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e){
               num1 = Double.parseDouble(nulis.getText());
               operasi = "/";
               nulis.setText("");
            }
        });
    }
    
    public static void main(String[]args){
        Calculator gas = new Calculator();
        gas.isinya();
        gas.backend();
    }
}
