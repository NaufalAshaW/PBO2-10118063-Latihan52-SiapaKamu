/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118063.latihan52;

/**
 *
 * @author 
 * NAMA   : Naufal Asha
 * KELAS  : IF-2
 * NIM    : 10118063
 */
public class Dosen extends Manusia {
    private String nip, mataKuliah;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    @Override
    public void siapaKamu() {
        System.out.println("Saya Dosen");
    }
    
    public void mengajarApa(){
        System.out.println("Saya " +nama+ " umur " +umur+ " sedang"
                + " mengajar matakuliah " +mataKuliah);
    }
    
}
