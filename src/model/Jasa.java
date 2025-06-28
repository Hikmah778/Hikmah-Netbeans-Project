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
public class Jasa extends Transaksi{
    public String id_jasa;
    
    public Jasa(){}

    public Jasa(String id_jasa) {
        this.id_jasa = id_jasa;
    }

    public void setId_jasa(String id_jasa) {
        try {
            if(id_jasa.equals(null) || id_jasa.equals("")){
                JOptionPane.showMessageDialog(null, "Id Jasa wajib diisi");
                this.id_jasa="-";
            } else {
                this.id_jasa=id_jasa;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }

    public String getId_jasa() {
        return id_jasa;
    }
    
    public String infoJasa(){   
    String pesan =super.infoTransaksi()+
                "\n ID Jasa: " + getId_jasa();
    return pesan;
    }
    
    public void infoJasaPopup(){
        String pesan = "ID Jasa : " + getId_jasa() + "\n"
                     + "Keterangan : " + getKeterangan() + "\n" 
                     + "Nominal : " + getNominal() + "\n" 
                     + "Id Users : " + getId_users(); 
        JOptionPane.showMessageDialog(null, pesan, "Data Jasa",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
