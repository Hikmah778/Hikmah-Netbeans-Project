/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import javax.swing.JOptionPane;


/**
 *
 * @author User
 */
public class Transaksi {
    public String keterangan;
    public int nominal;
    public String id_users;

    public Transaksi (){}

    public Transaksi(String keterangan, int nominal, String id_users) {
        this.keterangan = keterangan;
        this.nominal = nominal;
        this.id_users = id_users;
    }

    public void setKeterangan(String keterangan) {
        try {
            if(keterangan.equals(null) || keterangan.equals("")){
                JOptionPane.showMessageDialog(null, "Keterangan wajib diisi");
                this.keterangan="-";
            } else {
                this.keterangan=keterangan;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setNominal(int nominal) {
        try {
            // area koding benar
            if (nominal < 0) {
                JOptionPane.showMessageDialog(null, "Nominal tidak Boleh minus");
                this.nominal = 0;
            } else {
                this.nominal = nominal;
            }
        } catch (Exception salah) {
            // area kode jika salah
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }

    public int getNominal() {
        return nominal;
    }

    public void setId_users(String id_users) {
        try {
            if(id_users.equals(null) || id_users.equals("")){
                JOptionPane.showMessageDialog(null, "Id Users wajib diisi");
                this.id_users="-";
            } else {
                this.id_users=id_users;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }

    public String getId_users() {
        return id_users;
    }
    
    public String infoTransaksi(){   
    String pesan ="\n Keterangan : " + getKeterangan()+
                "\n Nominal : " + getNominal()+
                "\n ID Users : " + getId_users();
    return pesan;
    }
    
    public void infoTransaksiPopup(){
        String pesan = "Keterangan : " + getKeterangan() + "\n"
                    + "Nominal : " + getNominal() + "\n"
                    + "ID Users : " + getId_users();
        JOptionPane.showMessageDialog(null, pesan, "Data Transaksi",JOptionPane.INFORMATION_MESSAGE);
    }
}
