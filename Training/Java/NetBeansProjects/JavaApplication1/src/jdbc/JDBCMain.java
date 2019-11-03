/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author sdas301
 */
public class JDBCMain {

    public void insertEmployee(String name, int age, String address) {
        try {

            Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("Driver Loaded");

            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "DXC", "pass");
            System.out.println("JDBC Connected");

            String sql = "insert into emp values(?,?,?)";
            PreparedStatement stat = conn.prepareStatement(sql);

            stat.setString(1, name);
            stat.setInt(2, age);
            stat.setString(3, address);

            stat.executeUpdate();
            System.out.println("inserted");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
            JDBCMain obj=new JDBCMain();
            obj.insertEmployee("xyz", 25, "luk");
    }
}
