package uas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class tugas_uas extends javax.swing.JFrame {
    
    DefaultTableModel model;
    public tugas_uas() {
        initComponents();
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String[] row = { "ID", "Judul Buku", "Penulis" };
        model = new DefaultTableModel (row,0);
        tabel.setModel(model);
        tampilkan();      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        judul = new javax.swing.JTextField();
        lblJudul = new javax.swing.JLabel();
        penulis = new javax.swing.JTextField();
        title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        simpan = new javax.swing.JButton();
        update = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        lblPenulis = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        idfield = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblJudul.setText("Judul Buku");

        title.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        title.setText("Formulir Buku");

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Judul Buku", "Penulis"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        keluar.setText("Keluar");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });

        lblPenulis.setText("Penulis");

        jLabel1.setText("ID ");

        idfield.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(simpan)
                                .addGap(37, 37, 37)
                                .addComponent(update)
                                .addGap(33, 33, 33)
                                .addComponent(hapus)
                                .addGap(28, 28, 28)
                                .addComponent(keluar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblJudul)
                                    .addComponent(lblPenulis)
                                    .addComponent(jLabel1))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(judul)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(penulis, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(idfield, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(97, 97, 97)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(id)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(id)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(idfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(judul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblJudul))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(penulis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPenulis))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(simpan)
                            .addComponent(update)
                            .addComponent(hapus)
                            .addComponent(keluar))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
           System.exit(0);
    }//GEN-LAST:event_keluarActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
            
        try {
            int i = tabel.getSelectedRow();
            String id = model.getValueAt(i,0).toString();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/uas","root","");
            con.createStatement().executeUpdate("delete from formbuku where ID ="+id);
            tampilkan();
            kosongkan();
        } catch (SQLException ex) {
            Logger.getLogger(tugas_uas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_hapusActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
       try {
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost/uas","root","");
                con.createStatement().executeUpdate("insert into formbuku values"+"(null,'"+judul.getText()+"','"+penulis.getText()+"');");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Ada data yng belum diisi");
            } 
        judul.setText(null);
        penulis.setText(null);
        tampilkan();       
    }//GEN-LAST:event_simpanActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/uas","root","");            
            con.createStatement().executeUpdate("update formbuku set JudulBuku='"+judul.getText()+"', Penulis='"+penulis.getText()+"' where ID = " + idfield.getText());
            tampilkan();
            kosongkan();
        } catch (SQLException ex) {
            Logger.getLogger(tugas_uas.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }//GEN-LAST:event_updateActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        int i = tabel.getSelectedRow();
        if(i>=0){
            judul.setText(model.getValueAt(i,1).toString());
            penulis.setText(model.getValueAt(i,2).toString());
            idfield.setText(model.getValueAt(i,0).toString());
        }
    }//GEN-LAST:event_tabelMouseClicked
    
    void tampilkan(){
        int row= tabel.getRowCount();
        for (int  a= 0; a<row;a++){
            model.removeRow(0);
        }
        try {
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost/uas","root","");
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM formbuku");
            while(rs.next()){
                String data [] = {rs.getString(1),rs.getString(2),rs.getString(3)};
                model.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(tugas_uas.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }
    
    void kosongkan(){
        judul.setText(null);
        penulis.setText(null);
        idfield.setText(null);
    }
    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new tugas_uas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hapus;
    private javax.swing.JLabel id;
    private javax.swing.JTextField idfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField judul;
    private javax.swing.JButton keluar;
    private javax.swing.JLabel lblJudul;
    private javax.swing.JLabel lblPenulis;
    private javax.swing.JTextField penulis;
    private javax.swing.JButton simpan;
    private javax.swing.JTable tabel;
    private javax.swing.JLabel title;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
