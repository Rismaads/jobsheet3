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
class barang {
  private String namabarang;
  private String merkbarang;
  private  int idbarang;
   private int hargabarang;
   
   public barang(String namabarang,String merkbarang,int idbarang,int hargabarang)
   {
   this.namabarang=namabarang;
   this.hargabarang=hargabarang;
   this.idbarang=idbarang;
   this.merkbarang=merkbarang;
   }
   
   public void info()
   {
   System.out.println("Id Barang    :"+this.idbarang);
   System.out.println("Nama Barang  :"+this.namabarang);
   System.out.println("Harga Barang :"+this.hargabarang);
   System.out.println("Merk Barang  :"+this.merkbarang);
   }
   
 }

