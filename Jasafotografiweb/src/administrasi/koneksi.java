/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administrasi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author acer
 */
public class koneksi {
    
   private String databaseName = "dbjasafoto";
   private String username = "root";
   private String password = "";
   private String lokasi = "jdbc:mysql://localhost/"+databaseName;
   public static Connection koneksiDB;
   
   public koneksi(){
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           koneksiDB = DriverManager.getConnection(lokasi,username,password);
           System.out.println("Database Terkoneksi");
       }catch (Exception e){
           System.err.println(e.toString());
       }
   }
 
   public void simpanpelanggan(int paramidpelanggan, String paramnamapelanggan, String paramnomorrekening, 
           String paramnamabank, String paramidpesanan, String paramalamat, String paramtelpon, String paramstatus, int paramjam, int paramtransaksitotal){
       try{
           String SQL = "INSERT INTO pelanggan(idpelanggan, namapelanggan, nomorrekening, namabank, idpesanan, alamat, telpon, status, jam, transaksitotal)"
                   +"VALUES(?,?,?,?,?,?,?,?,?,?)";
           PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
           perintah.setInt(1, paramidpelanggan);
           perintah.setString(2, paramnamapelanggan);
           perintah.setString(3, paramnomorrekening);
           perintah.setString(4, paramnamabank);
           perintah.setString(5, paramidpesanan);
           perintah.setString(6, paramalamat);
           perintah.setString(7, paramtelpon);
           perintah.setString(8, paramstatus);
           perintah.setInt(9, paramjam);
           perintah.setInt(10, paramtransaksitotal);
           perintah.executeUpdate();
                System.out.println("Data Berhasil disimpan");
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
   } 
   
   public void ubahpelanggan(int paramidpelanggan, String paramnamapelanggan, String paramnomorrekening, 
           String paramnamabank, String paramidpesanan, String paramalamat, String paramtelpon, String paramstatus, int paramjam, int paramtransaksitotal){
       try{
           String SQL = "UPDATE pelanggan SET namapelanggan=?, nomorrekening=?, namabank=?, idpesanan=?,"
                   + "alamat=?, telpon=?, status=?, jam=?, transaksitotal=? WHERE idpelanggan=?";
           PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
           perintah.setString(1, paramnamapelanggan);
           perintah.setString(2, paramnomorrekening);
           perintah.setString(3, paramnamabank);
           perintah.setString(4, paramidpesanan);
           perintah.setString(5, paramalamat);
           perintah.setString(6, paramtelpon);
           perintah.setString(7, paramstatus);
           perintah.setInt(8, paramjam);
           perintah.setInt(9, paramtransaksitotal);
           perintah.setInt(10, paramidpelanggan);
           perintah.executeUpdate();
                System.out.println("Data Berhasil disimpan");
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
}
   public void hapuspelanggan(int paramidpelanggan){
       try{
           String SQL ="DELETE FROM pelanggan WHERE idpelanggan=?";
           PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
           perintah.setInt(1, paramidpelanggan);
           perintah.executeUpdate();
           System.out.println("Data Berhasil dihapus");
       }catch (Exception e){
           System.err.println(e.getMessage());
       }
   }
   
   public void caripelanggan(int paramidpelanggan){
       try{
           String SQL="SELECT*FROM pelanggan WHERE idpelanggan=?";
           PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
           perintah.setInt(1,paramidpelanggan);
           ResultSet data = perintah.executeQuery();
           while(data.next()){
               System.out.println("idpelanggan :"+data.getInt("idpelanggan"));
               System.out.println("namapelanggan :"+data.getString("namapelanggan"));
               System.out.println("nomorrekening :"+data.getString("nomorrekening"));
               System.out.println("idpesanan :"+data.getString("idpesanan"));
               System.out.println("alamat :"+data.getString("alamat"));
               System.out.println("telpon :"+data.getString("telpon"));
               System.out.println("status :"+data.getString("status"));
               System.out.println("jam :"+data.getInt("jam"));
               System.out.println("transaksitotal :"+data.getInt("transaksitotal"));
               
           }
       }catch(Exception e){
           System.err.println(e.getMessage());
       }
   }
   
   public void datapelanggan(){
       try{
           Statement stmt = koneksiDB.createStatement();
           ResultSet baris = stmt.executeQuery("SELECT*FROM pelanggan ORDER BY idpelanggan");
           while(baris.next()){
               System.out.println(baris.getInt("idpelanggan")+" | "+
                       baris.getString("namapelanggan")+" | "+
                        baris.getString("nomorrekening")+"|"+
                        baris.getString("namabank")+"|"+
                        baris.getString("idpesanan")+"|"+
                        baris.getString("alamat")+"|"+
                        baris.getString("telpon")+"|"+
                        baris.getString("status")+"|"+
                        baris.getInt("jam"));
           }
       }catch (Exception e){
           System.err.println(e.getMessage());
       }
   }
}



  
