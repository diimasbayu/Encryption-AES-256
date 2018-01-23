/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projectsmkn8;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author AdiRahmad
 */
public class Koneksi {
    public Connection buka(){
         Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/smkn8","root","");
            System.out.println("Koneksi Berhasil");
            return con;
        }catch (Exception e){
            System.out.println("Gagal Koneksi"+e.getMessage());
            return con = null;
            }
        }
    }

