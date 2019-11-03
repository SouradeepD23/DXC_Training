/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mydemos.servlets;

import com.mydemos.dao.CustomerDAO;
import com.mydemos.pojos.Customer;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sdas301
 */
@WebServlet(name = "MyFirstSrv", urlPatterns = {"/MyFirstSrv"})
public class MyFirstSrv extends HttpServlet {

//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        
//    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
        try {
            PrintWriter out = response.getWriter();

        String customerFirstName = request.getParameter("customerFirstName");
        String customerLastName = request.getParameter("customerLastName");
        String customerAddress = request.getParameter("customerAddress");
        String customerDOB = request.getParameter("customerDOB");

        Customer cust = new Customer(customerFirstName, customerLastName, customerAddress);

        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
        Date dob = sd.parse(customerDOB);
        cust.setDateOfBirth(dob);

        CustomerDAO dao = new CustomerDAO();
        out.println(dao.saveCustomer(cust));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
