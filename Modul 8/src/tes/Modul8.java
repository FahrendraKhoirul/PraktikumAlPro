package tes;
import java.awt.*;
import javax.swing.JFrame;
public class Modul8 extends Frame {
    public static void main(String[] args) {
        Modul8 fwc = new Modul8();
        fwc.setLayout (new FlowLayout());
        fwc.setSize (600,600);
        fwc.add(new Button ("Test Me!"));
        fwc.add(new Label("Label"));
        fwc.add(new TextField());
        CheckboxGroup cbg = new CheckboxGroup();
        fwc.add(new Checkbox("chk1", cbg, true));
        fwc.add(new Checkbox("chk2", cbg, false));
        fwc.add(new Checkbox("chk3", cbg, false));
        fwc.setVisible(true);
        fwc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
