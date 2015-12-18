/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author NadiaRezaSavira
 */
public class Peminjaman extends javax.swing.JFrame {

    /**
     * Creates new form Peminjaman
     */
    public Home Home;
    public Login Login;
    public Connection kon;
    public Statement stmt;
    public PreparedStatement pps;
    public ResultSet rslt;
    private DefaultTableModel deta;
    Date tanggal = new Date();
    
    Koneksi konek;
    
    public void tambah() {
        txtNopinjam.setText("");
        txtIdanggota.setText("");
        txtKodebuku.setText("");
        jdTglpinjam.setDate(tanggal);
        jdTglhakem.setDate(tanggal);
    }
    
    public Peminjaman() {
        initComponents();
        konek = new Koneksi();
        setTitle("Data Peminjaman Buku");
        setLocationRelativeTo(null);
        tampil();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nopinjam = new javax.swing.JLabel();
        idanggota = new javax.swing.JLabel();
        txtNopinjam = new javax.swing.JTextField();
        txtIdanggota = new javax.swing.JTextField();
        kodebuku = new javax.swing.JLabel();
        tglpinjam = new javax.swing.JLabel();
        tglhrskembali = new javax.swing.JLabel();
        txtKodebuku = new javax.swing.JTextField();
        btnTambahkan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnOk = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbPinjam = new javax.swing.JTable();
        btnCari = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();
        jdTglpinjam = new com.toedter.calendar.JDateChooser();
        jdTglhakem = new com.toedter.calendar.JDateChooser();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnKembali = new javax.swing.JMenuItem();
        mnLogout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));

        jLabel2.setFont(new java.awt.Font("Hot Mustard BTN", 0, 18)); // NOI18N
        jLabel2.setText("daftar peminjam buku perpustakaan");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpustakaan/minilogo.png"))); // NOI18N
        jLabel8.setAutoscrolls(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("VAGRounded BT", 0, 14)); // NOI18N
        jLabel4.setText("Form");

        nopinjam.setText("No. Pinjam:");

        idanggota.setText("Id Anggota:");

        txtNopinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNopinjamActionPerformed(evt);
            }
        });

        txtIdanggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdanggotaActionPerformed(evt);
            }
        });

        kodebuku.setText("Kode Buku:");

        tglpinjam.setText("Tanggal Pinjam :");

        tglhrskembali.setText("Tanggal Harus Kembali:");

        btnTambahkan.setText("Tambahkan");
        btnTambahkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahkanActionPerformed(evt);
            }
        });

        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel9.setText("© copyright Nadya Hadiyanti (4513210027)");

        TbPinjam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No Pinjam", "Id Anggota", "Kode Buku", "Tgl Pinjam", "Tgl Hrs Kembali"
            }
        ));
        TbPinjam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TbPinjamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TbPinjam);

        jScrollPane2.setViewportView(jScrollPane1);

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        txtCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCariActionPerformed(evt);
            }
        });

        jMenu1.setText("Menu");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        mnKembali.setText("Kembali");
        mnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnKembaliActionPerformed(evt);
            }
        });
        jMenu1.add(mnKembali);

        mnLogout.setText("Logout");
        mnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnLogoutActionPerformed(evt);
            }
        });
        jMenu1.add(mnLogout);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(kodebuku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tglpinjam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tglhrskembali, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtKodebuku, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jdTglpinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jdTglhakem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nopinjam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNopinjam))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(idanggota, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIdanggota)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnOk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnTambahkan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCari)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jdTglhakem, jdTglpinjam, txtIdanggota, txtKodebuku, txtNopinjam});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {idanggota, kodebuku, nopinjam, tglhrskembali, tglpinjam});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambahkan)
                    .addComponent(nopinjam)
                    .addComponent(txtNopinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUbah)
                    .addComponent(btnOk)
                    .addComponent(idanggota)
                    .addComponent(txtIdanggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHapus)
                    .addComponent(kodebuku)
                    .addComponent(txtKodebuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tglpinjam)
                    .addComponent(jdTglpinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tglhrskembali)
                    .addComponent(jdTglhakem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCari)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jLabel9))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCari, txtCari});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jdTglhakem, jdTglpinjam, txtKodebuku});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtIdanggota, txtNopinjam});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNopinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNopinjamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNopinjamActionPerformed

    private void txtIdanggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdanggotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdanggotaActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        try {
            Connection kon = konek.getKoneksi();
            Date tanggal = new Date();
            SimpleDateFormat formatTl = new SimpleDateFormat("dd MMMM yyyy");
            //String p = formatTk.format(jdTglpinjam.getDate());
            //String h = formatTk.format(jdTglpinjam.getDate());
            
            String value1 = txtNopinjam.getText();
            String value2 = txtIdanggota.getText();
            String value3 = txtKodebuku.getText();
            String value4 = formatTl.format(jdTglpinjam.getDate());
            String value5 = formatTl.format(jdTglhakem.getDate());
            
            String sql = "update pinjam set id_anggota='"+value2+"',kode_buku='"+value3
                    +"',tgl_pinjam='"+value4+"',tgl_hrskembali='"+value5+"' where no_pinjam='"+value1+"'";
            pps = kon.prepareStatement(sql);
            pps.execute();
            tampil();
            
            JOptionPane.showMessageDialog(null, "Data berhasil diubah");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data gagal diubah");
        }
    }//GEN-LAST:event_btnOkActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void mnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnKembaliActionPerformed
        try {
            Home = new Home();
            Home.setVisible(true);
            this.dispose();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_mnKembaliActionPerformed

    private void mnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnLogoutActionPerformed
        try {
            Login = new Login();
            Login.setVisible(true);
            this.dispose();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_mnLogoutActionPerformed

    private void btnTambahkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahkanActionPerformed
        try {
            Connection kon = konek.getKoneksi();
            Date tanggal = new Date();
            SimpleDateFormat formatTl = new SimpleDateFormat("dd MMMM yyyy");
            String p = formatTl.format(jdTglpinjam.getDate());
            String h = formatTl.format(jdTglhakem.getDate());
            
            if (txtNopinjam.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "No Pinjam tidak boleh kosong");
            } else if (txtIdanggota.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Id Anggota tidak boleh kosong");
            } else if (txtKodebuku.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Kode Buku tidak boleh kosong");
            } else if (jdTglpinjam.getDate().equals("")) {
                JOptionPane.showMessageDialog(null, "Tanggal Pinjam tidak boleh kosong");
            } else if (jdTglhakem.getDate().equals("")) {
                JOptionPane.showMessageDialog(null, "Tanggal harus kembali tidak boleh kosong");
            } else {
                String sql = "insert into pinjam (no_pinjam, id_anggota, kode_buku, tgl_pinjam, tgl_hrskembali) values ('"
                        +txtNopinjam.getText()+"','"+txtIdanggota.getText()+"','"+txtKodebuku.getText()+"','"
                        +p+"','"+h+"')";
                stmt = kon.createStatement();
                int banyak = stmt.executeUpdate(sql);
                if (banyak>0) {
                    JOptionPane.showMessageDialog(null, "Data Berhasil Tersimpan");
                    tambah();
                }
            }
            tampil();           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan");
        }
    }//GEN-LAST:event_btnTambahkanActionPerformed
    
    private void tampil(){
        try {
        Object [] row =  {"No Pinjam", "Id Anggota", "Kode Buku", "Tgl Pinjam", "Tgl Hrs Kembali"};
        deta = new DefaultTableModel(null, row);
        TbPinjam.setModel(deta);
        TbPinjam.setBorder(null);
        jScrollPane2.setViewportView(TbPinjam);
        String nopinjam="",idanggota="",kodebuku="",tglpinjam="",tglhrskembali="";
        try {
            Connection kon = konek.getKoneksi();
            String sql = "select * from pinjam";
            stmt = kon.createStatement();
            ResultSet rslt = stmt.executeQuery(sql);
            while (rslt.next()) {
                nopinjam = rslt.getString("no_pinjam");
                idanggota = rslt.getString("id_anggota");
                kodebuku = rslt.getString("kode_buku");
                tglpinjam = rslt.getString("tgl_pinjam");
                tglhrskembali = rslt.getString("tgl_hrskembali");
                
                String [] muncul = {nopinjam,idanggota,kodebuku,tglpinjam,tglhrskembali};
                deta.addRow(muncul);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Query salah");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    }
    
    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        int ok = JOptionPane.showConfirmDialog(null, "Apakah Anda ingin menghapus data ini?", "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok == 0) {
            try {
                Connection kon = konek.getKoneksi();
                String sql = "delete from pinjam where no_pinjam = '"+txtNopinjam.getText()+"'";
                Statement stmt = kon.createStatement();
                stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                tambah();
                tampil();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data gagal dihapus");
            }
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void TbPinjamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbPinjamMouseClicked
        int a = TbPinjam.getSelectedRow();
        //if (btnHapus.selected()) {
            if (a >= 0) {
                txtNopinjam.setText(deta.getValueAt(a, 0).toString());
                txtNopinjam.setEditable(false);
                txtIdanggota.setText(deta.getValueAt(a, 1).toString());
                txtIdanggota.setEditable(false);
                txtKodebuku.setText(deta.getValueAt(a, 2).toString());
                txtKodebuku.setEditable(false);
                //jdTglpinjam.setDate(deta.getValueat(a, 3).toString());
                //jdTglpinjam.setEditable(false);
                //jdTglhakem.setText(deta.getValueAt(a, 4).toString());
                //jdTglhakem.setEditable(false);
            }
        //}
    }//GEN-LAST:event_TbPinjamMouseClicked

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        //txtNopinjam.setEditable(true);
        txtIdanggota.setEditable(true);
        txtKodebuku.setEditable(true);
        //jdTglpinjam.setEditable(true);
        //jdTglhakem.setEditable(true);
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        try{
            Connection kon = konek.getKoneksi();
            String sql = "Select * from pinjam where no_pinjam='" +txtCari.getText()+ "'";
            ResultSet rslt = stmt.executeQuery(sql);
            if (rslt.next()) {
                txtNopinjam.setText(rslt.getString("no_pinjam"));
                txtIdanggota.setText(rslt.getString("id_anggota"));
                txtKodebuku.setText(rslt.getString("kode_buku"));
                jdTglpinjam.setDate(rslt.getDate("tgl_pinjam"));
                jdTglhakem.setDate(rslt.getDate("tgl_hrskembali"));
                
                //deta.addRow(new Object[]{
                   // rslt.getString(1),
                   // rslt.getString(2),
                   // rslt.getString(3),
                   // rslt.getString(4),
                    //rslt.getString(5),
                }
            }
        catch (Exception e){
            //TbPinjam.setModel(deta);

        }
    }//GEN-LAST:event_btnCariActionPerformed
       
    private void txtCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCariActionPerformed

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
            java.util.logging.Logger.getLogger(Peminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Peminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Peminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Peminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Peminjaman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable TbPinjam;
    private javax.swing.JButton btnCari;
    public javax.swing.JButton btnHapus;
    private javax.swing.JButton btnOk;
    public javax.swing.JButton btnTambahkan;
    public javax.swing.JButton btnUbah;
    private javax.swing.JLabel idanggota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser jdTglhakem;
    private com.toedter.calendar.JDateChooser jdTglpinjam;
    private javax.swing.JLabel kodebuku;
    private javax.swing.JMenuItem mnKembali;
    private javax.swing.JMenuItem mnLogout;
    private javax.swing.JLabel nopinjam;
    private javax.swing.JLabel tglhrskembali;
    private javax.swing.JLabel tglpinjam;
    private javax.swing.JTextField txtCari;
    public javax.swing.JTextField txtIdanggota;
    public javax.swing.JTextField txtKodebuku;
    public javax.swing.JTextField txtNopinjam;
    // End of variables declaration//GEN-END:variables
}
