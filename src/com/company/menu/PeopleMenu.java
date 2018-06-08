package com.company.menu;
import java.util.Scanner;
import java.util.InputMismatchException;

public class PeopleMenu {

    private Scanner input = new Scanner(System.in);


    private void managePeople() {

        try {
            System.out.println("Are you " +  //Find out what type of people we need to manage.
                    "\n1. An Employee?" +
                    "\n2. A Visitor?" +
                    "\n3. Go back" +
                    "\n4. Exit Program");
            switch (input.nextInt()) {
                case 1:
                    //handle employee
                    manageEmployee();
                    break;
                case 2:
                    //handle visitor
                    break;
                case 3:
                    mainMenu();
                    break;
                case 4:
                    System.out.println("Thank you or using the Zoo Program.");
                    System.exit(0);
                    break;
                default:
                    managePeople();
                    break;
            }
        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("That is not a valid entry. Please enter a number between 1-4.");
            managePeople();
        }

    }

    private void manageEmployee() {

    }
}
