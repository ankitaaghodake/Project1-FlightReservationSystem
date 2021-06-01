package com.company.frs;

public abstract  class Ticket {
            //Attributes
            private String pnrNo;
            private String departureTime;
            private String arrivalTime;
            private String from;
            private String to;
            private Float price;
            private String seatNo;
            private boolean cancelled;
            Flight flight;
            Passenger passenger;

            //constructor
            public Ticket(String pnrNo, String departureTime, String arrivalTime, String from,String to, Float price, String seatNo, Flight flight, Passenger passenger,boolean cancelled){
                this.pnrNo=pnrNo;
                this.departureTime=departureTime;
                this.arrivalTime=arrivalTime;
                this.from=from;
                this.to=to;
                this.price=price;
                this.seatNo=seatNo;
                this.flight=flight;
                this.passenger=passenger;
                this.cancelled=cancelled;
            }



     //Methods
            public int getJourneyDuration(){
                return (Integer.parseInt(departureTime)-Integer.parseInt(arrivalTime));
            }
            public void cancelTicket(){
                cancelled=true;
            }
            public String checkStatus(){
                if(cancelled){
                    return "Cancelled";
                }
                else{
                    return "Confirmed";
                }
            }


            //getter and setter
            public String getPnrNo() {
                return pnrNo;
            }

            public void setPnrNo(String pnrNo) {
                this.pnrNo = pnrNo;
            }

            public String getDepartureTime() {
                return departureTime;
            }

            public void setDepartureTime(String departureTime) {
                this.departureTime = departureTime;
            }

            public String getArrivalTime() {
                return arrivalTime;
            }

            public void setArrivalTime(String arrivalTime) {
                this.arrivalTime = arrivalTime;
            }

            public String getFrom() {
                return from;
            }

            public void setFrom(String from) {
                this.from = from;
            }

            public String getTo() {
                return to;
            }

            public void setTo(String to) {
                this.to = to;
            }

            public Float getPrice() {
                return price;
            }

            public void setPrice(Float price) {
                this.price = price;
            }

            public boolean isCancel() {
                return cancelled;
            }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
}
