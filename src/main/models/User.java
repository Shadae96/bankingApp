package models;

public class User {

// Here we are defining our variables

private String username = "";
private String password = "";
private String firstname = "";
private String lastnmae = "";
private String checkingaccount = "";
private String savingsaccount = "";  

// Calling the U ser object and giving it input

public User(String username, String password, String firstname, String lastname) {
    this.username = username;
    this.password = password;
    this.firstname = firstname;
    this.lastname = lastname;
};


// creating getters and setters -- variables are private so we have to create public getters and setters to access the variables we created. 


    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastnmae() {
        return this.lastnmae;
    }

    public void setLastnmae(String lastnmae) {
        this.lastnmae = lastnmae;
    }

    public String getCheckingaccount() {
        return this.checkingaccount;
    }

    public void setCheckingaccount(String checkingaccount) {
        this.checkingaccount = checkingaccount;
    }

    public String getSavingsaccount() {
        return this.savingsaccount;
    }

    public void setSavingsaccount(String savingsaccount) {
        this.savingsaccount = savingsaccount;
    }

}