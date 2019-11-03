/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mydemos.dao;

import com.mydemos.dbutil.DbConn;
import com.mydemos.pojos.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author sdas301
 */
public class CustomerDAO {

    public String saveCustomer(Customer cust) {
        try {
            Connection conn = DbConn.getConnection();
            int nextSeqVal = 0;
            String sql = "select genid.nextval from DUAL";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                nextSeqVal = rs.getInt(1);
            }

            sql = "insert into Customer values(?,?,?,?,?)";

            PreparedStatement stat = conn.prepareStatement(sql);

            stat.setString(1, cust.getFname());
            stat.setString(2, cust.getLname());
            String id = null;

            if (nextSeqVal < 10) {
                id = "00" + nextSeqVal;
            } else if (nextSeqVal >= 10 && nextSeqVal < 100) {
                id = "0" + nextSeqVal;
            } else {
                id = "" + nextSeqVal;
            }

            id = cust.getFname().substring(0, 2) + cust.getLname().substring(0, 2) + id;
            cust.setCustomerID(id);

            stat.setString(3, cust.getCustomerID());
            stat.setString(4, cust.getAddress());

            Date utilDOB = cust.getDateOfBirth();
            java.sql.Date dob = new java.sql.Date(utilDOB.getYear(), utilDOB.getMonth(), utilDOB.getDate());
            stat.setDate(5, dob);

            int res = stat.executeUpdate();
            if (res > 0) {
                return "Customer saved";
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "Cannot save Customer";

    }

    public ArrayList<Customer> getAllCustomers() {
        ArrayList<Customer> custList=new ArrayList<Customer>();
        try {
            Connection conn = DbConn.getConnection();

            String sql = "select * from Customer";
            
            
            
            PreparedStatement stat = conn.prepareStatement(sql);

            ResultSet rs = stat.executeQuery();

            if (rs.next()) {
                do {
                    Customer cust = new Customer();
                    cust.setFname(rs.getString(1));
                    cust.setLname(rs.getString(2));
                    cust.setCustomerID(rs.getString(3));
                    cust.setAddress(rs.getString(4));
                    cust.setDateOfBirth(rs.getDate(5));
                    

                    custList.add(cust);

                } while (rs.next());

            } else {
                return custList;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return custList;

    }

}
