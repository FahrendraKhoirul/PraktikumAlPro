package modul.pkg10;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class M10N5 extends JFrame{
    
    ResultSet rs;
    
    JLabel lblNama = new JLabel("Nama");
    JLabel lblNIM = new JLabel("NIM");
    JLabel lblKelas = new JLabel("Kelas");
    JLabel a = new JLabel("A");
    JLabel b = new JLabel("B");
    JLabel c = new JLabel("C");
    JLabel lblMatkul = new JLabel("Matakuliah");
    JButton edit = new JButton("Edit");
    JButton keluar = new JButton("Keluar");
    JButton hapus = new JButton("Hapus");
    JButton simpan = new JButton("Simpan");
    JButton cari = new JButton("Cari");
    JTextField nim = new JTextField();
    JTextField nama = new JTextField();
    JRadioButton A = new JRadioButton();
    JRadioButton C = new JRadioButton();
    JRadioButton B = new JRadioButton();
    String isi[] = {"Kalkulus", "Pancasila", "Filsafat"}; 
    JComboBox cb = new JComboBox(isi);
    
    String kelas = "";   
    
    M10N5(){        
        setSize(500,250);
        setTitle("Lembar Penilaian");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);     
        
    }

    void isinya(){ 
        getContentPane().setLayout(null);       
        getContentPane().add(lblNIM);
        getContentPane().add(A);
        getContentPane().add(B);
        getContentPane().add(C);
        getContentPane().add(a);
        getContentPane().add(b);
        getContentPane().add(c);
        getContentPane().add(lblKelas);
        getContentPane().add(lblMatkul);
        getContentPane().add(lblNama);
        getContentPane().add(edit);
        getContentPane().add(keluar);
        getContentPane().add(hapus);
        getContentPane().add(simpan);
        getContentPane().add(cari);
        getContentPane().add(nama);
        getContentPane().add(nim);
        getContentPane().add(cb);

               
        lblNIM.setBounds(20, 10, 100, 20);
        lblNama.setBounds(20, 40, 100, 20);
        lblKelas.setBounds(20, 70, 100, 20);
        lblMatkul.setBounds(20, 100, 100, 20);
        
        nim.setBounds(150, 10, 150, 25);
        cari.setBounds(350, 10, 100, 20);
        nama.setBounds(150, 40, 300, 25);
        A.setBounds(150, 70, 20, 20);
        a.setBounds(170, 70, 50, 20);
        B.setBounds(200, 70, 20, 20);
        b.setBounds(220, 70, 50, 20);
        C.setBounds(250, 70, 20, 20);
        c.setBounds(270, 70, 50, 20);
        cb.setBounds(150, 100, 100, 20);
        edit.setBounds(20, 150, 110, 20);
        simpan.setBounds(120, 150, 100, 20);
        hapus.setBounds(220, 150, 100, 20);
        keluar.setBounds(350, 150, 100, 20);    
    }
    
    void aksi(){
        keluar.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
        
        A.addActionListener((ActionEvent e) -> {
            if (A.isSelected()){
                B.setSelected(false);
                C.setSelected(false);
                kelas = "A";
            }});
        B.addActionListener((ActionEvent e) -> {
            if (B.isSelected()){
                A.setSelected(false);
                C.setSelected(false);
                kelas = "B";
            }});
        C.addActionListener((ActionEvent e) -> {
            if (C.isSelected()){
                B.setSelected(false);
                A.setSelected(false);
                kelas = "C";
            }});
        
        simpan.addActionListener((ActionEvent e) -> {
            try {
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost/modul10","root","");
                if (("".equals(nim.getText())) || ("".equals(nama.getText())) || ("".equals(kelas))){
                    JOptionPane.showMessageDialog(null, "Ada data yang belum diisi");
                } else {
                con.createStatement().executeUpdate("insert into 200605110124_fahrendrakhoirulihtada values"+
                        "('"+nim.getText()+"','"+nama.getText()+"','"+kelas+"','"+cb.getSelectedItem()+"');");
                }            
                JOptionPane.showMessageDialog(null, "Data berhasil disimpan");  
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Ada data yang belum diisi");        
            }            
             nim.setText(null);
             nama.setText(null);
         });
         
        cari.addActionListener((ActionEvent e) -> {
            try {
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost/modul10","root","");
                rs = con.createStatement().executeQuery("SELECT * FROM 200605110124_fahrendrakhoirulihtada "
                        + "where NIM =" + nim.getText());
                while (rs.next()){
                    nim.setText(rs.getString(1));
                    nama.setText(rs.getString(2));
                    kelas = rs.getString(3);
                    if (kelas.equals("A")){
                        A.setSelected(true);
                    }
                    if (kelas.equals("B")){
                        B.setSelected(true);
                    }
                    if (kelas.equals("C")){
                        C.setSelected(true);
                    }
                    cb.setSelectedItem(rs.getString(4));
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Tidak ada data yang dicari");
            }               
         });
        
        hapus.addActionListener((ActionEvent e) -> {
            try {
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost/modul10","root","");
                con.createStatement().execute("Delete FROM 200605110124_fahrendrakhoirulihtada "
                        + "where NIM =" + nim.getText());
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Hapus gagal");
            }               
         });
        
        edit.addActionListener((ActionEvent e) -> {
            String matkul =  (String) cb.getSelectedItem();
            try {
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost/modul10","root","");
                con.createStatement().execute("Update 200605110124_fahrendrakhoirulihtada set Nama ='" + nama.getText()
                        + "', Kelas ='" + kelas + "', Matakuliah ='" + matkul
                        + "' where NIM =" + nim.getText());
                JOptionPane.showMessageDialog(null, "Data berhasil diubah");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Edit gagal");
            }               
         });
        
        
    }
     
    public static void main(String[]args){
        M10N5 gas = new M10N5();
        gas.isinya();   
        gas.aksi();
    }
}
