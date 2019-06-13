package com.example.alumno.myapplication.models;

import java.lang.reflect.Array;

public class User {
    private String username;
    private String password;
    private String firstName;
    private String LastName;

    public static User fingUserByUsername(Array<User>users,String username){
                    String username){
            for (User o : users) {
                if (o.getUsername().equals(username)) {
                    return o;
                }
            }
        }

    return null;
    }
    public boolean isValid (String _password){
        return getPassword().equals(_password);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
}
