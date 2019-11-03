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
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sdas301
 */
@WebServlet(name = "GetCustomers", urlPatterns = {"/GetCustomers"})
public class GetCustomers extends HttpServlet {

    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet GetCustomers</title>");            
            out.println("</head>");
            out.println("<body>");
            CustomerDAO dao = new CustomerDAO();
            ArrayList<Customer> custList= dao.getAllCustomers();
            
            out.println(custList.size());
            
            out.println("<table>");
            out.println("<thead><tr><th>First Name</th> <th>Last Name</th> <th>Customer ID</th> <th>Address</th> <th>Date of Birth</th></tr></thead>");
            out.println("<tbody>");
            for(Customer cust:custList){
                out.println("<tr>");
                out.println("<td>");
                out.print(cust.getFname());
                out.println("</td>");
                out.println("<td>");
                out.print(cust.getLname());
                out.println("</td>");
                out.println("<td>");
                out.print(cust.getCustomerID());
                out.println("</td>");
                out.println("<td>");
                out.print(cust.getAddress());
                out.println("</td>");
                out.println("<td>");
                out.print(cust.getDateOfBirth());
                out.println("</td>");
                out.println("</tr>");
            }
            out.println("</tbody>");
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
