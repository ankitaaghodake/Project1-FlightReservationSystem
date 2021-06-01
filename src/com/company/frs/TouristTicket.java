package com.company.frs;

public class TouristTicket extends Ticket{
    //attributes
            private String hotelAddress;
            private String[] selectTouristLocation = {"Pune", "Mumbai", "Hyderabad", "Mysore", "Kashmir"};

            //constructor
            public TouristTicket(String pnrNo, String departureTime, String arrivalTime, String from, String to, float price, String seatNo, Flight flight, Passenger passenger,boolean cancelled) {
                super(pnrNo, departureTime, arrivalTime, from, to, price, seatNo, flight, passenger,cancelled);
                this.hotelAddress = "Paradise Hotel,Mysore";
                this.selectTouristLocation = new String[5];
            }

            //methods
            public String getHotelAddress() {
                return hotelAddress;
            }

            public String[] getTouristLocation() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(selectTouristLocation[i]);
                }
                return selectTouristLocation;
            }
}

