package com.bridgelabz.Addressbook;
import java.util.ArrayList;
import java.util.Scanner;

public class Contact {
    private String Fname;//First Name
    private String Lname;//Last Name
    private String Addr;//Address
    private String City;
    private String State;
    private int Zip;
    private String Email;
    private int Phonenumber;
    private static ArrayList<Contact> l = new ArrayList<>();


    public Contact(String fname, String lname, String addr, String city, String state, int zip, String email, int phonenumber) {
        Fname = fname;
        Lname = lname;
        Addr = addr;
        City = city;
        State = state;
        Zip = zip;
        Email = email;
        Phonenumber = phonenumber;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public String getAddr() {
        return Addr;
    }

    public void setAddr(String addr) {
        Addr = addr;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public int getZip() {
        return Zip;
    }

    public void setZip(int zip) {
        Zip = zip;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getPhonenumber() {
        return Phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        Phonenumber = phonenumber;
    }
    public static void addContact(Contact add){
        l.add(add);
    }

    public static  ArrayList<Contact> getContact(){
        return l;
    }
    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + Fname + '\'' +
                ", lastName='" + Lname + '\'' +
                ", address='" + Addr + '\'' +
                ", zipNo=" + Zip +
                ", phoneNumber=" + Phonenumber +
                ", email='" + Email + '\'' +
                '}';
    }
}
class AddressBook {
    public static void main(String[] args) {
        Contact c1 = new Contact("Prathm","Jawahire","Latur","Pune","Maharashtra",477654,"prathm@gmail.com",1234567890);
        Contact c2= new Contact("Nilay","Jape","Latur","Jalna","Maharashtra",437604,"nilay@gmail.com",1284567890);
        Contact.addContact(c1);
        Contact.addContact(c2);
        c2.setFname("Shridhar");
        System.out.println(c1.getFname());

        ArrayList<Contact> l=Contact.getContact();
        for (int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
    }
}


