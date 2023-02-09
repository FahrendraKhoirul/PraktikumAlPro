
package tes;
import  javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Actionlistener {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        final JLabel lb = new JLabel();
        final String[] items = {"roti", " Madu"};
        final JComboBox comboBox = new JComboBox (items);
        JPanel pn = new JPanel();
        frame.add(pn, BorderLayout.WEST);
        pn.add(comboBox, BorderLayout.SOUTH);
        pn.add(lb, BorderLayout.SOUTH);
        comboBox.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                   String mn = (String) comboBox.getSelectedItem();
                   lb.setText(mn);
            }
        });
        frame.setSize(200,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
