/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.lang.Integer;


/**
 *
 * @author administrador1
 */
public class FirstConnection 
{
    public static void main(String[] args) {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "mysql");
            
            Statement s = con.createStatement();
            
            
            
            s.execute("insert into personas (id,nombre) values (1, 'ariel')");
            
            ResultSet rs = s.executeQuery("select * from personas");
            
            while(rs.next())
            {
                System.out.println("id: "+ rs.getInt(1));
                System.out.println("nombre: " + rs.getString(2));
                
            }
            
        } catch (ClassNotFoundException ex) {
            System.out.println("class not found exception");
        } catch (InstantiationException ex) {
            System.out.println("instatiantion exception");
        } catch (IllegalAccessException ex) {
            System.out.println("IllegalAccessException");
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }            
}
