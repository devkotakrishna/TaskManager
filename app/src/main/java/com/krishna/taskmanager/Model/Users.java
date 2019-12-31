package com.krishna.taskmanager.Model;

public class Users {
    private String firstName;
    private String lastName;
    private String username ;
    private String pasword;
    private String image;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Users(String firstName, String lastName, String username, String pasword, String image) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.pasword = pasword;
        this.image = image;
    }
}
