/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.SinhVien;
import java.sql.Connection;
import helper.DatabaseHelper;
import java.sql.PreparedStatement;
import java.sql.Blob;
import javax.sql.rowset.serial.SerialBlob;

/**
 *
 * @author hiep1
 */
public class SinhVienDao {
    public boolean insert(SinhVien sv)
    throws Exception{
        String sql = " INSERT INTO  [dbo].[SinhVien],([MaSinhVien],[HoTen],[Email],[SoDT],[GioiTinh],[DiaChi],[Hinh])" 
                + "VALUES(?,?,?,?,?,?,?)";
      try(
           Connection con = DatabaseHelper.openConnection();
           PreparedStatement pstmt = con.prepareStatement(sql);
                  
              ){
        pstmt.setString(1, sv.getMaSinhVien());
        pstmt.setString(2, sv.getHoTen());
        pstmt.setString(3, sv.getEmail());
        pstmt.setString(4,sv.getSoDT());
        pstmt.setInt(5, sv.getGioiTinh());
        pstmt.setString(6, sv.getDiaChi());
        if(sv.getHinh()!=null){
            Blob hinh = new SerialBlob(sv.getHinh());
            pstmt.setBlob(7,hinh);
        } else {
            Blob hinh = null;
            pstmt.setBlob(7, hinh);
        }
        return pstmt.executeUpdate()>0;
        
    }
        
    }
}
