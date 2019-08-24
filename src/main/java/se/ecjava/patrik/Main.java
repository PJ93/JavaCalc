package se.ecjava.patrik;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    /**
     * --------------Program description and goal---------------
     *Java Calculator exercise for ECUtbildning java course
     *Make simple calculator that can do basic math
     *Make sure to use Test
     * -------------------------PJ93----------------------------
     */
        static Scanner scanner = new Scanner(System.in);
        public static void main(String... args){
            boolean keepalive = true;
            boolean calculation = false;
            while(keepalive){
                System.out.println("Make a calculation or quit?");
                System.out.println("y/n");
                String onoff = scanner.nextLine();
                switch(onoff){
                    case"y":
                        calculation=true;
                        break;
                    case"n":
                        keepalive = false;
                        break;
                    default:
                        System.out.println("Invalid input, please use y or n");
                        //break;
                }//switch
                while(calculation){
                    System.out.println("Enter the first number");
                    //int number1 = Integer.parseInt(scanner.nextLine());
                    double number1 = Double.parseDouble(scanner.nextLine());
                    System.out.println("Enter the seconded number");
                    //int number2 = Integer.parseInt(scanner.nextLine());
                    double number2 = Double.parseDouble(scanner.nextLine());
                    //char mathselect = Character.isJavaIdentifierPart();
                    // deleted and replaced with a simple number option for the time be



                    System.out.println("choose math equation");
                    System.out.println("+,-,*,/");
                    //int mathselect = Integer.parseInt(scanner.nextLine());
                    //swapped out the int to a string because it makes more sense for the user
                    String mathselect = scanner.nextLine();
                    switch(mathselect){
                        case "+":
                            System.out.println(number1+"+"+number2+ " = " +calcMethodAdd(number1, number2));
                            break;
                        case "-":
                            System.out.println(number1+"-"+number2+ " = " +calcMethodSub(number1, number2));
                            break;
                        case "*":
                            System.out.println(number1+"*"+number2+ " = " +calcMethodMulti(number1, number2));
                            break;
                        case "/":
                            System.out.println(number1+ "/" +number2 +" = " +calcMethodDiv(number1, number2));
                            break;
                        default:
                            System.out.println("please only use +, - , * and /");
                            //break;
                    }//switch
                    calculation=false;
                }//whilecalculation

            }//whilekeepalive
        }//static void

    //Calculation Methods
    static double calcMethodAdd(double x, double y){
        double i = x + y;
        return i;
    }
    static double calcMethodSub(double x, double y){
        double i = x - y;
        return i;
    }
    static double calcMethodMulti(double x, double y){
        double i = x * y;
        return i;
    }
    static double calcMethodDiv(double x, double y){
        double i = x / y;
        return i;
    }
}//main
