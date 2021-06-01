package com.company.frs;

public class Passenger {
        //Attributes
        private static int  id;
        private static int idCounter;

        //nested class
        private static class Contact {
            //Attributes
            String name;
            long phoneNo;
            String email;

            //constructor
            public Contact(String name, long phoneNo, String email) {
                this.name = name;
                this.phoneNo = phoneNo;
                this.email = email;
            }
        }
        private Contact contact;

        //nested class
        private static class Address {
            String street, city, state;  //attributes

            //constructor
            public Address(String street, String city, String state) {
                this.street = street;
                this.city = city;
                this.state = state;
            }
        }

        private Address address;

        //initialize idCounter
        static {
            idCounter = 0;
        }

        //Passenger constructor
        public Passenger(String addressStreet, String addressCity, String addressState,
                         String contactName, long contactPhoneNo, String contactEmail) {
            this.id = ++idCounter;
            this.address = new Address(addressStreet, addressState, addressCity);
            this.contact = new Contact(contactName, contactPhoneNo, contactEmail);
        }

        //Methods

        public String getContactDetails(){
            return  contact.name + ", " + contact.phoneNo + ", " +contact.email;
        }

        public String getAddressDetails(){
            return   address.street+ ", " + address.state  + ", " + address.city;
        }

        public void bookTicket(){
            boolean bookTicket;
            bookTicket=true;
        }

        public int passengerCount(){
            return this.id;
        }

        //getter and setter
        public int getId() {
            return this.id;
        }

}

