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
public class MainException {

    public static void main(String[] args) {
        Tickets tkt = new Tickets(10);
        try {
            tkt.bookTickets(5);
            tkt.bookTickets(5);
            tkt.bookTickets(5);
        } catch (TicketNotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}
