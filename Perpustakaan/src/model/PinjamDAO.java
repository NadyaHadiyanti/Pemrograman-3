/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import perpustakaan.*;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author NadiaRezaSavira
 */
public class PinjamDAO {
    Koneksi konek;
    
    public PinjamDAO() {
        konek = new Koneksi();
    }
    
    public String insertPinjam(String no_pinjam, String id_anggota, String kode_buku, String tgl_pinjam, String tgl_hrskembali) {
        String rptTambahkan=null;
        try {
            Connection accessDB = konek.getKoneksi();
            CallableStatement cs = accessDB.prepareCall("{call sp_insertPinjam(?,?,?,?,?)}");
            cs.setString(1, no_pinjam);
            cs.setString(2, id_anggota);
            cs.setString(3, kode_buku);
            cs.setString(4, tgl_pinjam);
            cs.setString(5, tgl_hrskembali);
            
            int numTambahkan = cs.executeUpdate();
            
            if (numTambahkan>0) {
                rptTambahkan = "Penambahan Berhasil";
            }
        } catch (Exception e) {
        }
        return rptTambahkan;
    }
    
    public ArrayList<Pinjam> listPinjam() {
        ArrayList listPibuk = new ArrayList();
        Pinjam pinjam;
        try {
            Connection acceDB = konek.getKoneksi();
            PreparedStatement ps = acceDB.prepareStatement("select * from pinjam");
            ResultSet rslt = ps.executeQuery();
            while (rslt.next()) {
                pinjam = new Pinjam();
                pinjam.setNo_pinjam(rslt.getString(1));
                pinjam.setId_anggota(rslt.getString(2));
                pinjam.setKode_buku(rslt.getString(3));
                pinjam.setTgl_pinjam(rslt.getString(4));
                pinjam.setTgl_hrskembali(rslt.getString(5));
                listPibuk.add(pinjam);
            }
        } catch (Exception e) {
        }
        return listPinjam();
    }
}
