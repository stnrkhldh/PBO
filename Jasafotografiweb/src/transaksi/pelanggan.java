/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transaksi;
import java.util.ArrayList;

/**
 *
 * @author acer
 */
public class pelanggan extends pemesanan{
    
    String id_pelanggan, namapelanggan, nomor_rekening, nama_bank;
    
    ArrayList<String>idpelanggans;
    ArrayList<String>namapelanggans;
    ArrayList<String>nomorrekenings;
    ArrayList<String>namabanks;
        
    
    
    public pelanggan(){
    
    idpelanggans = new ArrayList<>();
    namapelanggans = new ArrayList<>();
    nomorrekenings = new ArrayList<>();
    namabanks = new ArrayList<>();
    }
    
    public pelanggan(String Id, String Nama, String Nomor, String Bank){
        this.id_pelanggan = Id;
        this.namapelanggan = Nama;
        this.nomor_rekening = Nomor;
        this.nama_bank = Bank;
    }
    
    public void isiIDPELANGGAN(String Id){
     idpelanggans.add(Id);   
    }
    
    public ArrayList<String>getIDpelanggan(){
        return this.idpelanggans;
    }
    
    public void inputIDPELANGGAN(String id){
        this.id_pelanggan = id;
    }
    public String ambilIDPELANGGAN(){
        return this.id_pelanggan;
    }
    
    public void isiNAMAPELANGGAN(String NAMA){
     namapelanggans.add(NAMA);   
    }
    
    public ArrayList<String>getNAMApelanggan(){
        return this.namapelanggans;
    }
    public void inputNAMAPELANGGAN(String Nama){
        this.namapelanggan = Nama;
    }
    
    public String ambilNAMAPELANGGAN(){
        return this.namapelanggan;
    }
    
    public void isiNOMORREKENING(String Id){
     nomorrekenings.add(Id);   
    }
    
    public ArrayList<String>getNOMORrekening(){
        return this.nomorrekenings;
    }
    
    public void inputNOMORREKENING(String Nomor){
        this.nomor_rekening = Nomor;
    }
    
    public String ambilNOMORREKENING(){
        return this.nomor_rekening;
    }
    
    public void isiNAMABANK(String Id){
     namabanks.add(Id);   
    }
    
    public ArrayList<String>getNAMAbank(){
        return this.namabanks;
    }
    
    public void inputNAMABANK(String Bank){
        this.nama_bank = Bank;
    }
    
    public String ambilNAMABANK(){
        return this.nama_bank;
    }
    
}
