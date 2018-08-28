/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

/**
 *
 * @author Risma
 */
public class Tes {
     public static void main(String[] args){
        jurusan myjurusan = new jurusan();
        System.out.println("-----------------------------------------");
        myjurusan.cetakSekolah("SMK Telkom Malang");
        myjurusan.cetakGuru("Pak Arifin");
        myjurusan.cetakJurusan("Rekayasa Perangkat Lunak");
        myjurusan.cetakMapel("PBO");
        myjurusan.cetakKelas("XIR5");
        System.out.println("-----------------------------------------");
    }
}
