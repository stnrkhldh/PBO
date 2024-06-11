/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jasafotografiweb;
import transaksi.*;
import java.util.Scanner;
import java.util.ArrayList;
import administrasi.koneksi;

/**
 *
 * @author acer
 */
public class Jasafotografiweb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       koneksi db = new koneksi();
      //db.simpanpelanggan(445,"KHALIDAH","002268", "bri", "II", "rantau", "6987567", "TERIMA", 10, 500000);
        //db.ubahpelanggan(286,"ica","0099988", "bni", "II", "gampa", "62359723", "TERIMA", 2, 400000);
        //db.hapuspelanggan(286);
        //db.caripelanggan(445);
        db.datapelanggan();
    }
    
}
