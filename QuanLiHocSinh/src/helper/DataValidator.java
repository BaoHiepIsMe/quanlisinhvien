/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helper;
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author hiep1
 */
public class DataValidator {
   public static void validateEmpty(JTextField field,StringBuilder sb,String errorMessage){
       if(field.getText().equals("")){
           sb.append(errorMessage).append("\n");
           field.setBackground(Color.red);
           field.requestFocus();
    } else{
           field.setBackground(Color.white);
       }
    }
      public static void validateEmpty(JPasswordField field,StringBuilder sb,String errorMessage){
          String password = new String(field.getPassword());
       if(password.equals("")){
           sb.append(errorMessage).append("\n");
           field.setBackground(Color.red);
           field.requestFocus();
    } else{
           field.setBackground(Color.white);
       }
    } 

    public static void validateEmpty(ButtonGroup buttonGroup1, StringBuilder a, String giới_tính_không_được_để_trống) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

//    public static void validateEmpty(JDateChooser dkns, StringBuilder a, String họ_và_tên_không_được_để_trống) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }  
}
