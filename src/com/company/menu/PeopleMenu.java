package com.company.menu;
import com.company.people.Employees;
import com.company.people.Visitors;

import java.util.Scanner;
import java.util.InputMismatchException;

public class PeopleMenu {

    private Scanner input = new Scanner(System.in);


    protected void managePeople() {

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
                    manageVisitor();
                    break;
                case 3:
                    Menu menu = new Menu();
                    menu.mainMenu();
                    break;
                case 4:
                    System.out.println("Thank you for using the Zoo Program.");
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

    private void manageVisitor() {

        try {
            System.out.println("You're in the Visitor menu!");
            System.out.println("Do you want to " +  //Find out what type of people we need to manage.
                    "\n1. Create New Visitor" +
                    "\n2. View All Visitors" +
                    "\n3. Remove a Visitor" +
                    "\n4. Edit a Visitor" +
                    "\n5. Go back" +
                    "\n6. Exit Program");
            switch (input.nextInt()) {
                case 1:
                    //create new visitor
                    createPerson(2);
                    break;
                case 2:
                    //view all visitors
                    break;
                case 3:
                    //remove a visitor
                    break;
                case 4:
                    //edit a visitor
                    break;
                case 5:
                    managePeople();
                    break;
                case 6:
                    System.out.println("Thank you for using the Zoo Program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("That is not a valid entry. Please enter a number between 1-6");
                    manageVisitor();
                    break;
            }
        } catch (InputMismatchException ime) {
            System.out.println(ime.toString());
            input.nextLine();
            System.out.println("That is not a valid entry. Please enter a number between 1-6");
            manageVisitor();
        }

    }


    private void manageEmployee() {

        try {
            System.out.println("You're in the Employee menu!");
            System.out.println("Do you want to " +  //Find out what type of people we need to manage.
                    "\n1. Create New Employee" +
                    "\n2. View All Employees" +
                    "\n3. Remove an Employee" +
                    "\n4. Edit an Employee" +
                    "\n5. Go back" +
                    "\n6. Exit Program");
            switch (input.nextInt()) {
                case 1:
                    //create new employee
                    createPerson(1);
                    break;
                case 2:
                    //view all employees
                    break;
                case 3:
                    //remove an employee
                    break;
                case 4:
                    //edit an employee
                    break;
                case 5:
                    managePeople();
                    break;
                case 6:
                    System.out.println("Thank you for using the Zoo Program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("That is not a valid entry. Please enter a number between 1-6");
                    manageEmployee();
                    break;
            }
        } catch (InputMismatchException ime) {
            System.out.println(ime.toString());
            input.nextLine();
            System.out.println("That is not a valid entry. Please enter a number between 1-6");
            manageEmployee();
        }

    }

    private void createPerson(int location) {
        //If location ==1, new Employee,, If location == 2, new Visitor
        if (location ==1 ) {

            System.out.println("What is the employee's age?");
            int employeeAge= input.nextInt();
            input.nextLine();
            System.out.println("What is the employee's name?");
            String employeeName = input.nextLine();
            System.out.println("What gender is the employee?");
            char employeeGender = input.nextLine().charAt(0);
            System.out.println("What is the employee's race?");
            String employeeRace = input.nextLine();
            System.out.println("What is the employee's ID number?");
            int employeeNumber = input.nextInt();
            input.nextLine();
            System.out.println("What is the employee's job? title");
            String employeeTitle = input.nextLine();
            System.out.println("What is the employee's hire date?");
            String employeeHireDate = input.nextLine();
            Employees newEmployee = new Employees(employeeAge, employeeName, employeeGender, employeeRace, employeeNumber,employeeTitle, employeeHireDate);
        }
        else if (location == 2){

            System.out.println("What is the visitor's age?");
            int visitorAge= input.nextInt();
            input.nextLine();
            System.out.println("What is the visitor's name?");
            String visitorName = input.nextLine();
            System.out.println("What gender is the visitor?");
            char visitorGender = input.nextLine().charAt(0);
            System.out.println("What is the visitor's race?");
            String visitorRace = input.nextLine();
            System.out.println("What is the visitor's group number?");
            int visitorNumber = input.nextInt();
            input.nextLine();
            System.out.println("Does the visitor have a membership?");
            Boolean visitorMembership = input.nextBoolean();
            System.out.println("What is the visitor's home address?");
            String visitorHomeAddress = input.nextLine();
            Visitors newVisitor = new Visitors(visitorAge,visitorName,visitorGender,visitorRace,visitorNumber,visitorMembership,visitorHomeAddress);

        }



    }

    }

