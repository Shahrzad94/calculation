package se.shjava.shahrzad;

import java.util.Scanner;

public class Calculation {


    static Scanner ab= new Scanner(System.in);
    static double  number1;
    static double number2;


    public static void main(String[] args) {

        boolean keepAlive= true;
        double result;
        /////Greeting
        System.out.println("Hi! welcome to this project!");

        while (keepAlive) {
            System.out.println(" Do you wanna continue? y/n " );
            String answer= ab.nextLine();

            switch(answer) {
                case "n":
                    System.out.println(" Goodbye!" );
                    keepAlive=false;
                    break;


                default:
                    System.out.println("continue!");

                    System.out.println("Please write the first number!");
                    double number1= Double.parseDouble(ab.nextLine());
                    System.out.println("you have entered the first number :)");

                    System.out.println("Please write the second number!");
                    double number2= Double.parseDouble(ab.nextLine());
                    System.out.println(" you have entered the second number :)");

                    System.out.println("please choose the operator!");
                    String operator = ab.next();


                    if (operator.equals("+")) {

                        result= Calculation.addition(number1, number2);
                        System.out.println("Here is the result" + " " + result);
                    }
                    else if (operator.equals("-")) {
                        result= Calculation.subtraction(number1, number2);
                        System.out.println("Here is the result" + " " + result);
                    }
                    else if (operator.equals("*")) {
                        result= Calculation.multiple(number1, number2);
                        System.out.println("Here is the result" + " " + result);
                    }
                    else if (operator.equals("/")) {
                        result= Calculation.division(number1, number2);
                        System.out.println("Here is the result" + " " + result);
                    }
            }
        } //whileloop1
    } //switch1


    //Methods

    public static  double addition(double number1, double number2) {
        double result= number1+number2;
        return result;
    }
    public static  double subtraction(double number1, double number2) {
        double result= number1-number2;
        return result;
    }
    public static  double multiple(double number1, double number2) {
        double result= number1*number2;
        return result;
    }
    public static  double division(double number1, double number2) {
        double result= number1/number2;
        return result;
    }

}




