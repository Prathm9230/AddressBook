package com.bridgelabz.Addressbook;
import java.util.ArrayList;

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
}