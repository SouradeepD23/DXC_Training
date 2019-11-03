/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author sdas301
 */
public class Tickets {
    private int noOfTickets;

    Tickets(int noOfTickets){
        this.noOfTickets=noOfTickets;
    }
    
    public int getNoOfTickets() {
        return noOfTickets;
    }

    
    public void setNoOfTickets(int noOfTickets) {
        this.noOfTickets = noOfTickets;
    }
    
    public void bookTickets(int n) throws TicketNotAvailableException{
        if(noOfTickets<n)
        {
            throw new TicketNotAvailableException();
            
        }
        else{
            noOfTickets=noOfTickets-n;
            System.out.println("Number of tickets remaining = "+noOfTickets);
        }
    }
    
}
