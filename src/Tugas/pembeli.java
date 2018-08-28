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
 class pembeli extends barang {
    private int idpembeli;
    private String namapembeli;
    private String alamat;
    private String notelepon;
    
    public pembeli (int idpembeli,String namapembeli,String alamat,String notelepon,String namabarang, String merkbarang,int idbarang,
    int hargabarang)
 
    {
    super(namabarang,merkbarang,idbarang,hargabarang);
    
    this.idpembeli=idpembeli;
    this.namapembeli=namapembeli;
    this.alamat=alamat;
    this.notelepon=notelepon;
    }
    
    public void infos()
    {
        super.info();
    System.out.println("Id Pembeli   :"+this.idpembeli);
    System.out.println("Nama Pembeli :"+this.namapembeli);
    System.out.println("Alamat       :"+this.alamat);
    System.out.println("No Telepon   :"+this.notelepon);
    }
    }

