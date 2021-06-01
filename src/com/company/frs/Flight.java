package com.company.frs;

public class Flight {
        //Attributes
        private String flightNo;
        private String airlineNo;
        private int capacity;
        private int bookedSeats;
        private int bookingCounter;

        //constructor
        public Flight(String flightNo,String airlineNo,int capacity,int bookedSeats){
            this.flightNo=flightNo;
            this.airlineNo=airlineNo;
            this.capacity=capacity;
            this.bookedSeats=bookedSeats;
        }

        //Methods
        public String getFlightDetails() {
            return "flight Number:"+flightNo+","+"Airline Number:"+airlineNo;
        }

        public boolean checkSeatsAvailability(){
            if(bookedSeats<capacity){
                return true;
            }
            else {
                return false;
            }
        }

        public void incrementBookingCounter(){
            ++bookingCounter;
        }

        //getter and setter
        public String getFlightNo() {
            return flightNo;
        }

        public void setFlightNo(String flightNo) {
            this.flightNo = flightNo;
        }

        public String getAirlineNo() {
            return airlineNo;
        }

        public void setAirlineNo(String airlineNo) {
            this.airlineNo = airlineNo;
        }

        public int getCapacity() {
            return capacity;
        }

        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }

        public int getBookedSeats() {
            return bookedSeats;
        }

        public void setBookedSeats(int bookedSeats) {
            this.bookedSeats = bookedSeats;
        }

    }

