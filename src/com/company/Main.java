package com.company;
import java.util.Scanner;

// program to calculate shape areas
public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Get the area of a: ");
        System.out.println("1 - Square");
        System.out.println("2 - Circle");
        System.out.println("3 - Triangle");
        System.out.println("4 - Cube");


        int option = sc.nextInt();

        switch (option) {
            case 1 : getSquare();
                break;

            case 2 : getCircle();
                break;

            case 3 : getTriangle();
                break;

            case 4 : getCube();
                break;

            default: System.out.print("That is an invalid option...");
                break;

        }



    }

    private static void getSquare() {

        System.out.print("Enter a side to calculate the area: ");

        double input = sc.nextDouble();
        System.out.println("\nThe area of the square is " + (input * input) + " units.");
    }

    private static void getCircle() {

        System.out.print("Enter the radius to calculate the area: ");

        double input = sc.nextDouble();
        System.out.println("\nThe area of the circle is " + (Math.PI * (Math.pow(input, 2)) + " units."));
    }

    private static void getTriangle() {


        System.out.print("Enter a the base and the height respectively to calculate the area: ");

        double inputBase = sc.nextDouble();
        double inputHeight = sc.nextDouble();
        System.out.println("\nThe area of the triangle is " + (inputBase * inputHeight * (1/2)) + " units.");
    }

    private static void getCube() {


        System.out.print("Enter a side to calculate the area: ");

        double input = sc.nextDouble();
        System.out.println("\nThe area of the cube is " + (input * input * input) + " units.");
    }
}
