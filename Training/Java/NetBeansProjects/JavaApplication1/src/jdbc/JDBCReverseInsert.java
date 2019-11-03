/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author sdas301
 */
public class JDBCReverseInsert {


    static String reverseName(String name) {
        String revName = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            revName += name.charAt(i);
        }
        return revName;
    }

    static void insertName(String name, Connection conn) {

        try {
            String sql = "insert into name values(?)";
            PreparedStatement stat = conn.prepareStatement(sql);
            
            stat.setString(1, name);
            
            stat.executeUpdate();
            System.out.println("inserted");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    static void getNames(Connection conn) {

        try {

            String sql = "select * from name";
            PreparedStatement stat = conn.prepareStatement(sql);

            ResultSet rs = stat.executeQuery();
            if (rs.next()) {
                do {
                    System.out.println(reverseName(rs.getString(1)));

                } while (rs.next());
            } else {
                System.out.println("DATA NOT FOUND");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        String name = "ij idom , ij hahs , uppap , lawirjek";
        Connection conn = null;
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "DXC", "pass");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        String[] namearr = name.split(" , ");

//        for (String str : namearr) {
//            insertName(reverseName(str), conn);
//        }
        
        getNames(conn);

    }

    
}
