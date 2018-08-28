/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author Risma
 */
public class testransaksi extends pembeli {
    public int jumlahbrg;
    public int totalharga;
    
    public testransaksi(int idpembeli,String namapembeli,String alamat,String notelepon,String namabarang, String merkbarang,int idbarang,
    int hargabarang, int jumlahbrg, int totalharga)
    {
    super(idpembeli,namapembeli,alamat,notelepon,namabarang,merkbarang,idbarang,hargabarang);
       
       }
    
    public void cetak()
    {
    super.infos();
    
     System.out.println("Total harga  :"+this.totalharga);
     System.out.println("Jumah Barang :"+this.jumlahbrg);
    }

    public int getJumlahbrg() {
        return jumlahbrg;
    }

    public void setJumlahbrg(int jumlahbrg) {
        this.jumlahbrg = jumlahbrg;
    }

    public int getTotalharga() {
        return totalharga;
    }

    public void setTotalharga(int totalharga) {
        this.totalharga = totalharga;
    }
    
    public static void main(String[]args)
    {
    System.out.println("Nota Pembelian Barang");
    
    testransaksi nota= new testransaksi(121,"Risma","Jln.Danau Buyan ","08987654456","Laptop","Asus",1124,4234,23,7000000);
    nota.setJumlahbrg(5);
    nota.setTotalharga(700000);
    nota.cetak();
    }
}
