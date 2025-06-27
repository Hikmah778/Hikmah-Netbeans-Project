/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.Date;
/**
 *
 * @author User
 */
public class Pengeluaran extends Transaksi {
    public String id_pengeluaran;
    public String tanggal;
    
    public Pengeluaran(){};

    public Pengeluaran(String id_pengeluaran, String tanggal) {
        this.id_pengeluaran = id_pengeluaran;
        this.tanggal = tanggal;
    }

    public void setId_pengeluaran(String id_pengeluaran) {
        try {
            if(id_pengeluaran.equals(null) || id_pengeluaran.equals("")){
                JOptionPane.showMessageDialog(null, "Id Pengeluaran wajib diisi");
                this.id_pengeluaran="-";
            } else {
                this.id_pengeluaran=id_pengeluaran;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }

    public void setTanggal(String tanggal) {
        try {
            if (tanggal == null || tanggal.trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Tanggal wajib diisi");
                this.tanggal = "-";
            } else {
                // Coba parsing tanggal dengan format tertentu (misalnya: yyyy-MM-dd)
                SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
                format.setLenient(false); // supaya format harus valid
                Date tgl = format.parse(tanggal); // akan melempar Exception jika salah format

                this.tanggal = tanggal; // jika valid, simpan
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, "Format tanggal tidak valid (contoh: 2025-06-25)\n" + salah.getMessage());
            this.tanggal = "-";
        }
    }
    
    public String getId_pengeluaran() {
        return id_pengeluaran;
    }

    public String getTanggal() {
        return tanggal;
    }
    
    public String infoPengeluaran(){   
    String pesan =super.infoTransaksi()+
                "\n ID Pengeluaran : " + getId_pengeluaran()+
                "\n Tanggal : " + getTanggal();
    return pesan;
    }
    
    public void infoPengeluaranPopup(){
        String pesan = "ID Pengeluaran : " + getId_pengeluaran() + "\n"
                    + "Tanggal : " + getTanggal() + "\n"
                    + "Keterangan : " + getKeterangan() + "\n"
                    + "Nominal : " + getNominal() + "\n"
                    + "ID Users : " + getId_users();
        JOptionPane.showMessageDialog(null, pesan, "Data Pelanggan",JOptionPane.INFORMATION_MESSAGE);
    }
}
