/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package raudatulhikmah;
import frame.FrameApp;
import model.Harga;
import model.Jasa;
import model.Pengeluaran;
/**
 *
 * @author User
 */
public class RaudatulHikmah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FrameApp app =  new FrameApp();
        app.setVisible(true);
        
        System.out.println("\n === Laporan Pengeluaran ===");
        // Pengeluaran
        Pengeluaran pengeluaran = new Pengeluaran();
        pengeluaran.setId_pengeluaran("PG001");
        pengeluaran.setTanggal("23-06-2025");
        pengeluaran.setKeterangan("Pembelian ATK");
        pengeluaran.setNominal(75000);
        pengeluaran.setId_users("U001");
        System.out.println(pengeluaran.infoPengeluaran());

        System.out.println("\n === Laporan Penjualan Jasa ===");
        // Jasa
        Jasa jasa = new Jasa();
        jasa.setId_jasa("JS001");
        jasa.setKeterangan("Perbaikan Komputer");
        jasa.setNominal(150000);
        jasa.setId_users("U002");

        System.out.println(jasa.infoJasa());

        System.out.println("\n === Daftar Harga Barang ===");
        // Harga
        Harga harga = new Harga();
        harga.setId_harga("HG001");
        harga.setKeterangan("Buku Besar");
        harga.setNominal(10000);
        harga.setId_users("U003");

        System.out.println(harga.infoHarga());
    }
    
}
