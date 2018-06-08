package com.company.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private Scanner input = new Scanner(System.in);

    public void mainMenu() {

        System.out.println("Please choose an option. " +
                "\n1. Manage People" +
                "\n2. Manage Animals" +
                "\n3. Manage Inventory" +
                "\n4. Exit program");
        try {

            //handles user input for navigation
            switch (input.nextInt()) {

                case 1:
                    //Manage People
                    PeopleMenu peopleMenu= new PeopleMenu();
                    peopleMenu.managePeople();
                    break;
                case 2:
                    //Manage animals
                    manageAnimals();
                    break;
                case 3:
                    //Manage Inventory
                    manageInventory();
                    break;
                case 4:
                    System.out.println("Thank you for using the Zoo Program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("That is not a valid entry. Please enter a number between 1-4.");
                    //Handle wrong number
                    mainMenu();
                    //Restart method to allow user to try again
                    break;
            }
        } catch (InputMismatchException ime) {
            //handle if a user puts in something that is not an int
            input.nextLine();
            System.out.println("That is not a valid entry. Please enter a number between 1-4.");
            mainMenu();
        }
    }


    //Handles People options




    private void addPeople() {

    }

    private void removePeople() {
    }

    private void viewPeople() {

    }


    private void manageInventory() {

    }

    private void manageAnimals() {

    }
}
