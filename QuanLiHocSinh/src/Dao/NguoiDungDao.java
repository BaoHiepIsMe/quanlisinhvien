/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.NguoiDung;
import helper.DatabaseHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author hiep1
 */
public class NguoiDungDao {
    public NguoiDung checkLogin(String tenDangNhap,String matKhau) throws Exception{
          String sql = " select tenDangNhap, matKhau, vaiTro from NguoiDung "
                + " where tendangnhap=? and matKhau=?";


        try(
               Connection con = DatabaseHelper.openConnection();
               PreparedStatement pstmt = con.prepareStatement(sql);
                ){

            pstmt.setString(1, tenDangNhap);
            pstmt.setString(2, matKhau);
            
            try(ResultSet rs = pstmt.executeQuery()){
                if(rs.next()){
                  NguoiDung nd = new NguoiDung();
                  nd.setTenDangNhap(tenDangNhap);
                  nd.setVaiTro(rs.getString("VaiTro"));
                  return nd;
                }
                    
            }
            
        }
       
        return null;
    
    }
}