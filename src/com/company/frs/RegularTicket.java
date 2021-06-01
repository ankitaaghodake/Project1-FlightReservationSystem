package com.company.frs;

public class RegularTicket extends Ticket {
        private String specialService="Snacks,Water,ColdDrink";

        public RegularTicket(String pnrNo, String departureTime, String arrivalTime, String from, String to, float price, String seatNo, Flight flight, Passenger passenger,boolean cancelled) {
            super(pnrNo, departureTime, arrivalTime, from, to, price, seatNo, flight, passenger,cancelled);
            this.specialService=specialService;
        }

        //methods
        public String getSpecialService() {
            return specialService;
        }
    }


