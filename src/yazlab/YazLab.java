/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yazlab;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author PAŞAOĞLU
 */
public class YazLab {

    /**
     * @param args the command line arguments
     */    
    
    Connection conn = null;
    ResultSet rs = null;
    Statement st;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println("Bağlantı başarılı");
        }
        catch(Exception e){
            System.out.println("Veri bağlanmadı");
        }
        
        new NewJFrame().setVisible(true);
        
    }
    
}
