/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author NadiaRezaSavira
 */
public class Pinjam {
    String no_pinjam;
    String id_anggota;
    String kode_buku;
    String tgl_pinjam;
    String tgl_hrskembali;
    
    public Pinjam() {
        no_pinjam="";
        id_anggota="";
        kode_buku="";
        tgl_pinjam="";
        tgl_hrskembali="";
    }

    public String getNo_pinjam() {
        return no_pinjam;
    }

    public void setNo_pinjam(String no_pinjam) {
        this.no_pinjam = no_pinjam;
    }

    public String getId_anggota() {
        return id_anggota;
    }

    public void setId_anggota(String id_anggota) {
        this.id_anggota = id_anggota;
    }

    public String getKode_buku() {
        return kode_buku;
    }

    public void setKode_buku(String kode_buku) {
        this.kode_buku = kode_buku;
    }

    public String getTgl_pinjam() {
        return tgl_pinjam;
    }

    public void setTgl_pinjam(String tgl_pinjam) {
        this.tgl_pinjam = tgl_pinjam;
    }

    public String getTgl_hrskembali() {
        return tgl_hrskembali;
    }

    public void setTgl_hrskembali(String tgl_hrskembali) {
        this.tgl_hrskembali = tgl_hrskembali;
    }
    
    
}
