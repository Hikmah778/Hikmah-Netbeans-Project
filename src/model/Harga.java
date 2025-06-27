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
public class Harga extends Transaksi{
    public String id_harga;
    
    public Harga(){}

    public Harga(String id_harga) {
        this.id_harga = id_harga;
    }

    public void setId_harga(String id_harga) {
        try {
            if(id_harga.equals(null) || id_harga.equals("")){
                JOptionPane.showMessageDialog(null, "Id Harga wajib diisi");
                this.id_harga="-";
            } else {
                this.id_harga=id_harga;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }

    public String getId_harga() {
        return id_harga;
    }
    
    public String infoHarga(){   
    String pesan =super.infoTransaksi()+
                "\n ID Harga: " + getId_harga();
    return pesan;
    }
    
    public void infoHargaPopup(){
        String pesan = "ID Harga : " + getId_harga() + "\n"
                    + "Keterangan : " + getKeterangan() + "\n"
                    + "Nominal : " + getNominal() + "\n"
                    + "ID Users : " + getId_users();
        JOptionPane.showMessageDialog(null, pesan, "Data Harga",JOptionPane.INFORMATION_MESSAGE);
    }
}
