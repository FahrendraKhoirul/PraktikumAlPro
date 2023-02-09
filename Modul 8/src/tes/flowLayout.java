package tes;
import java.awt.*;
import javax.swing.JFrame;
public class flowlayout extends Frame {
    public static void main(String[] args) {
        flowlayout fwc = new flowlayout();
        fwc.setLayout (new FlowLayout());
        fwc.setSize (100,100);
        fwc.add(new Button ("ONE"));
        fwc.add(new Button ("TWO"));
        fwc.add(new Button ("THREE"));
        fwc.setVisible(true);
        fwc.setLocation(200,200);
        fwc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void setDefaultCloseOperation(int EXIT_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
