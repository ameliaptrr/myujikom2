/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasikasir_ujikom;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class FomPelanggan extends javax.swing.JFrame {
        Connection konek;
        PreparedStatement pst;
        ResultSet rst;
        boolean ubah;
        
    public FomPelanggan() {
        initComponents();
        this.setLocationRelativeTo(null);
        konek = Koneksi.koneksiDB();
        TampilData();
        Panel.setVisible(false);
       ubah = true;
    }
    public void TampilData(){
       try{
           String sql = ("select * from pelanggan");
           pst = konek.prepareStatement(sql);
           rst = pst.executeQuery();
           tblpel.setModel(DbUtils.resultSetToTableModel(rst));
           
       } catch (Exception e){
           JOptionPane.showMessageDialog(null, e);
           
       }
    }
    
    private void clear() {
        txtid.setText("");
        tnm.setText("");
        tal.setText("");
        tno.setText("");
    }
    
    private void simpan() {
    if(ubah==true){
        try{
           String sql = "insert into pelanggan value(?,?,?,?)";
           pst = konek.prepareStatement(sql);
           pst.setString(1, txtid.getText());
           pst.setString(2, tnm.getText());
           pst.setString(3, tal.getText());
           pst.setString(4, tno.getText());
           pst.execute();
//           JOptionPane.showMessageDialog(null, "Data Tersimpan !!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Sudah Ada !!");
         } 
    }

    else {
     try{
        String id  = txtid.getText();
        String nm  = tnm.getText();
        String al  = tal.getText();
        String no  = tno.getText();
        String sql = "update pelanggan set PelangganID='"+id+"', NamaPelanggan='"+nm+"', Alamat='"+al+"', NomorTelepon='"+no+"' where Pelanggan='"+id+"'";
        pst        = konek.prepareStatement(sql);
        pst.execute();
        JOptionPane.showMessageDialog(null, "Data Berhasil diupdate !!");

    } catch (Exception e){
         JOptionPane.showMessageDialog(null, e);
    }
        TampilData();
        clear();
        Panel.setVisible(false);
        tblpel.setVisible(true);
    }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Panel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        tnm = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tal = new javax.swing.JTextArea();
        tno = new javax.swing.JTextField();
        btnsimpan = new javax.swing.JButton();
        btnhps = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();
        btnedit1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblpel = new javax.swing.JTable();
        btnedit = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Pelanggan\n");
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FORM PELANGGAN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(jLabel1)
                .addContainerGap(269, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 810, 107);

        Panel.setBackground(new java.awt.Color(0, 51, 255));
        Panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Panel.setLayout(new java.awt.GridBagLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NO. TELEPON");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 59, 0, 0);
        Panel.add(jLabel5, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ALAMAT");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(48, 60, 0, 0);
        Panel.add(jLabel4, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NAMA PELANGGAN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 60, 0, 0);
        Panel.add(jLabel3, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID PELANGGAN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(43, 60, 0, 0);
        Panel.add(jLabel2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 170;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 99, 0, 66);
        Panel.add(txtid, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 170;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 99, 0, 66);
        Panel.add(tnm, gridBagConstraints);

        tal.setColumns(20);
        tal.setRows(5);
        jScrollPane1.setViewportView(tal);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 218;
        gridBagConstraints.ipady = 70;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(18, 99, 0, 66);
        Panel.add(jScrollPane1, gridBagConstraints);

        tno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 170;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(23, 99, 0, 66);
        Panel.add(tno, gridBagConstraints);

        btnsimpan.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnsimpan.setForeground(new java.awt.Color(0, 51, 255));
        btnsimpan.setText("SIMPAN");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 33;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 99, 17, 0);
        Panel.add(btnsimpan, gridBagConstraints);

        getContentPane().add(Panel);
        Panel.setBounds(80, 140, 630, 360);

        btnhps.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnhps.setForeground(new java.awt.Color(0, 51, 255));
        btnhps.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-delete-22.png"))); // NOI18N
        btnhps.setText("HAPUS");
        btnhps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhpsActionPerformed(evt);
            }
        });
        getContentPane().add(btnhps);
        btnhps.setBounds(420, 530, 122, 33);

        btnkeluar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnkeluar.setForeground(new java.awt.Color(0, 51, 255));
        btnkeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-exit-22_1.png"))); // NOI18N
        btnkeluar.setText("KELUAR");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });
        getContentPane().add(btnkeluar);
        btnkeluar.setBounds(580, 530, 122, 33);

        btnedit1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnedit1.setForeground(new java.awt.Color(0, 51, 255));
        btnedit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-pencil-22.png"))); // NOI18N
        btnedit1.setText("EDIT");
        btnedit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnedit1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnedit1);
        btnedit1.setBounds(260, 530, 122, 33);

        tblpel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Pelanggan", "Nama Pelanggan", "Alamat", "No.Telepon"
            }
        ));
        tblpel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblpelMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblpel);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(90, 150, 610, 340);

        btnedit.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnedit.setForeground(new java.awt.Color(0, 51, 255));
        btnedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-plus-22.png"))); // NOI18N
        btnedit.setText("ADD");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });
        getContentPane().add(btnedit);
        btnedit.setBounds(90, 530, 122, 33);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnoActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        simpan();        // TODO add your handling code here:
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void tblpelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblpelMouseClicked
        Panel.setVisible(true);
        tblpel.setVisible(false);
        ubah = false;
        try {
               int baris        = tblpel.getSelectedRow();
               String tabelKlik = (tblpel.getModel().getValueAt(baris, 0).toString());
               String sql       = "select * from pelanggan where PelangganID='"+tabelKlik+"'";
               pst              = konek.prepareStatement(sql);
               rst              = pst.executeQuery();
               if (rst.next()) {
                   String id = rst.getString(("PelangganID"));
                   txtid.setText(id);
                   
                   String nm = rst.getString(("NamaPelanggan"));
                   tnm.setText(nm);
                   
                   String al = rst.getString(("Alamat"));
                   tal.setText(al);
                   
                   String no = rst.getString(("NomorTelepon"));
                   tno .setText(no);
               }

           } catch (Exception e) { 
                JOptionPane.showMessageDialog(null, e);
           }
         // TODO add your handling code here:
    }//GEN-LAST:event_tblpelMouseClicked

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
        new MenuUtama().setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void btnhpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhpsActionPerformed
        try{
            String sql    = "delete from pelanggan where PelangganID=?";
            pst = konek.prepareStatement(sql);
            pst.setString(1, txtid.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil dihapus !!");

        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        TampilData();
        clear();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnhpsActionPerformed

    private void btnedit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnedit1ActionPerformed

    }//GEN-LAST:event_btnedit1ActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        Panel.setVisible(true);
        tblpel.setVisible(false);
        ubah = false;

        // TODO add your handling code here:
    }//GEN-LAST:event_btneditActionPerformed
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FomPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FomPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FomPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FomPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FomPelanggan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnedit1;
    private javax.swing.JButton btnhps;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea tal;
    private javax.swing.JTable tblpel;
    private javax.swing.JTextField tnm;
    private javax.swing.JTextField tno;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}
