package com.myhib.service;

import com.myhib.dao.CustomerDao;
import com.myhib.model.Customer;

public class CustomerService {

public static void main(String[] args) {


Customer cust=new Customer();
cust.setCustId(1);
cust.setCustName("JOHN");

CustomerDao dao=new CustomerDao();
dao.saveCustomer(cust);

System.out.println("DONE");

}

}