package com.example.foodorder.DeliveryFoodPanel;

public class DelieveryBoyModel {

    String Area;
    String City;
    String ConfirmPassword;
    String EmailID;
    String Fname;
    String House;
    String Lname;
    String Mobile;
    String Password;
    String Postcode;
    String State;
    String Suburban;
    String deliveryBoyID;

    public DelieveryBoyModel(String area, String city, String confirmPassword, String emailID, String fname, String house, String lname, String mobile, String password, String postcode, String state, String suburban, String deliveryBoyID) {
        Area = area;
        City = city;
        ConfirmPassword = confirmPassword;
        EmailID = emailID;
        Fname = fname;
        House = house;
        Lname = lname;
        Mobile = mobile;
        Password = password;
        Postcode = postcode;
        State = state;
        Suburban = suburban;
        this.deliveryBoyID = deliveryBoyID;
    }

    public DelieveryBoyModel(){}

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getConfirmPassword() {
        return ConfirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        ConfirmPassword = confirmPassword;
    }

    public String getEmailID() {
        return EmailID;
    }

    public void setEmailID(String emailID) {
        EmailID = emailID;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getHouse() {
        return House;
    }

    public void setHouse(String house) {
        House = house;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPostcode() {
        return Postcode;
    }

    public void setPostcode(String postcode) {
        Postcode = postcode;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getSuburban() {
        return Suburban;
    }

    public void setSuburban(String suburban) {
        Suburban = suburban;
    }

    public String getDeliveryBoyID() {
        return deliveryBoyID;
    }

    public void setDeliveryBoyID(String deliveryBoyID) {
        this.deliveryBoyID = deliveryBoyID;
    }
}

