package com.example.foodorder;

public class User  {

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    String Role;

    public User(String role)
    {
        Role=role;
    }
}
