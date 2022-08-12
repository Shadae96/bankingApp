package com.example.consoleviews;

import java.util.Scanner;

import com.example.models.customer;
import com.example.models.employee;
import com.example.models.user;

import com.example.services.store;
import com.example.util.inputUtil;


public class MainMenu {

    UserService userService = new UserService();
    InputUtil inputUtil = new InputUtil();

    public void view(){

        Scanner scanner = new Scanner(System.in);
        Boolean running = true;

        while (running) { 

        System.out.println( "Welcome to Java Bank!\n 1.)Login\n 2.)Register\n 3.)EXIT");
        string input = scanner.nextLine();

            switch (input) {
                case "1":
                String usernameInput = inputUtil.retrieveString("Usename: ");
                String passwordInput = inputUtil.retrieveString("Password: ");

                Boolean areCredentialsValid = userService.validateCredentials(new User (usernameInput, passwordInput));
                    
                if (areCredentialsValid) {
                    System.out.println("Welcome to Java Bank");
                    
                } else {
                    System.out.println("The username or password you entered is incorrect. Try again.");
                    
                }
                    break;

                case "2":

                String usernameInputReg = inputUtil.retrieveString("Username: ");
                String passwordInputReg = inputUtil.retrieveString("Password: ");
                String firstNameInputReg = inputUtil.retrieveString("First Name: ");
                String lastNameInputReg = inputUtil.retrieveString("Last Name: ");


                User userToCreate = new User(usernameInput,passwordInput,firstNameInputReg,lastNameInputReg);

                User userFromDB = this.userService.createUser(userToCreate);

                    if (userFromDB == null) {
                        System.out.println("Username already exists. Please try another input");
                        
                    } else {
                        System.out.println("User successfully created!");
                        
                    }

                    break;


                case "3":
                    running = false;
                    break;
                default:
                    System.out.println("invalid input");
                    break;
            }
        }


        








    }

    
}
