package com.company.frs;

public class Main {

    public static void main(String[] args) {
Passenger passenger=new Passenger("Pune nashik road","Pune","Maharashtra","Ankita",7798663094l,"ankita@gmail.com");
         Flight flight1=new Flight("120","46",1,5);


        Ticket regularTicket = new RegularTicket("1A22B8", "9AM", "2PM",
                "Hyderabad", "Maldives",
                5000f, null, flight1,passenger,false);

        Ticket touristTicket = new TouristTicket("1G2456", "9AM", "2PM",
                "Hyderabad", "Maldives",
                7000f, "145A", flight1, passenger,true);

        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
    }
    public static void printTicketDetails(Ticket ticket){
        System.out.println(ticket.getPnrNo());
    }
}