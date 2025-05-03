package org.example;
import java.util.Scanner;

public class Main {
    //This is my first java program


    public static void main(String[] args) {
 /*       System.out.println("I like pizza");
        System.out.println("It's really good");
        System.out.println("Buy me pizza");
        int age = 21;
        int year = 2025;
        int quantity = 1;

        double price = 19.99;
        double gpa = 3.5;
        double temperature = -12.4;

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

        String name = "Bro code";
        String food = "pizza";
        String email = "fake1244@gmail.com";
        String car = "Mustang";
        String color = "red";
        System.out.println("Your choice is a " + color + " " + year + " " + car);
        System.out.println("The prince is: " + currency + price);
        if(forSale){
            System.out.println("There is a" + car + " for sale");
        }else{
            System.out.println("The " + car + " for sale");
        }
        System.out.println("Hello " + name);
        System.out.println("Your favouite food is " + food);
        System.out.println("Your gpa is: " + gpa);
        System.out.println("Your average letter grade is: " + grade);


        if (isStudent) {
            System.out.println("You are a student");
        } else {
            System.out.println("You are not a student");
    } */

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine();
//
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//
//        System.out.print("Enter your gpa: ");
//        double gpa = scanner.nextDouble();
//
//        System.out.print("Are you a student? (true/false): ");
//        boolean isStudent = scanner.nextBoolean();
//
//        System.out.println("Your name is: " + name);
//        System.out.println("Your age is: " + age);
//        System.out.println("Your gpa is: " + gpa);
//        if(isStudent){
//            System.out.println("You are enrolled as student.");
//        }else{
//            System.out.println("You are NOT student.");
//        }
//        scanner.close();
        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("The area is: " + area + "cm²");

        scanner.close();

    }
}
