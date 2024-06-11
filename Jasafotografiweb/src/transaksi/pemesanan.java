/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transaksi;

/**
 *
 * @author acer
 */
public class pemesanan {
    
    String id_pesanan, alamat, telpon, status_pesanan;
    int jum_id,trimstatus,jam,lama_jam;
    
    public pemesanan(){}
    public pemesanan(String ID){
        this.id_pesanan = ID;
    }
    public pemesanan(String ID, String Alamat){
        this.id_pesanan = ID;
        this.alamat = Alamat;
    }
    public pemesanan(String ID, String Alamat, String Telp){
        this.id_pesanan = ID;
        this.alamat = Alamat;
        this.telpon = Telp;
    }
    public pemesanan(String ID, String Alamat, String Telp, String Status){
        this.id_pesanan = ID;
        this.alamat = Alamat;
        this.telpon = Telp;
        this.status_pesanan = Status;
    }
    public pemesanan(String ID, String Alamat, String Telp, String Status,int Jam){
        this.id_pesanan = ID;
        this.alamat = Alamat;
        this.telpon = Telp;
        this.status_pesanan = Status;
        this.jam = Jam;
    }
    
    
    
    public void inputID_PEMESANAN(String ID){
        this.id_pesanan = ID;
    }
    
    public int ambilJUM_ID(){
        this.jum_id = 0;
        if(this.id_pesanan.equals("I")){
            this.jum_id = 150000;
        }else if(this.id_pesanan.equals("II")){
            this.jum_id = 200000;
        }else if(this.id_pesanan.equals("III")){
            this.jum_id = 250000;
        }else{this.jum_id = 300000;}
        
        return this.jum_id;
    }
    
    public void inputALAMAT(String Alamat){
        this.alamat = Alamat;
    }
    
    public String ambilALAMAT(){
        return this.alamat;
    }
    
    
   public void inputTELPON(String Telp){
        this.telpon = Telp;
    }
    
    public String ambilTELPON(){
        return this.telpon;
    }
    
    public void inputSTATUSPEMESANAN(String Status){
        this.status_pesanan = Status;
    }
    
    public String getSTATUSPEMESANAN(){
        return this.status_pesanan;
    }
    
    public int ambilTERIMASTATUS(){
        this.trimstatus = 0;
        if(this.status_pesanan.equals("TERIMA")){
            this.trimstatus = 50000;
        }else{this.trimstatus = 30000;}
        
        return this.trimstatus;
    }
    
    public void inputJAM(int Jam){
        this.jam = Jam;
    }
    
    public int ambilLAMAJAM(){
        this.lama_jam = 0;
        if(this.jam==0){
            this.lama_jam = 0;
        }else if(this.jam>=1 && this.jam<=2){
            this.lama_jam = 50000;
        }else if(this.jam>=2 && this.jam<=3){
            this.lama_jam = 80000;
        }else{this.lama_jam = 100000;}
        
        return this.lama_jam;
    }
    
    
    public int transaksiTotal(){
        return ambilJUM_ID() + ambilTERIMASTATUS()+ ambilLAMAJAM();
    }
}
