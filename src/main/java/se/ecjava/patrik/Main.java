package se.ecjava.patrik;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    /**
     * --------------Program description and goal---------------
     *Java Calculator exercise for ECUtbildning java kurs
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
                System.out.print("y/n");
                String onoff = scanner.nextLine();
                switch(onoff){
                    case"y":
                        calculation=true;
                        break;
                    default:
                        keepalive = false;
                        break;
                }//switch
                while(calculation){
                    System.out.println("Enter the first number");
                    int number1 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter the seconded number");
                    int number2 = Integer.parseInt(scanner.nextLine());
                    //char mathselect = Character.isJavaIdentifierPart();
                    // deleted and replaced with a simple number option for the time be
                    System.out.println("choose math equation");
                    System.out.println("+,-,*,/");
                    //int mathselect = Integer.parseInt(scanner.nextLine());
                    //swapped out the int to a string because it makes more sense for the user
                    String mathselect = scanner.nextLine();
                    switch(mathselect){
                        case "+":
                            calcMethodAdd(number1, number2);
                            break;
                        case "-":
                            calcMethodSub(number1,number2);
                            break;
                        case "*":
                            calcMethodMulti(number1,number2);
                            break;
                        case "/":
                            calcMethodDiv(number1,number2);
                            break;
                        default:
                            System.out.println("please only use +, - , * and /");
                            break;
                    }//switch
                    calculation=false;
                }//whilecalculation

            }//whilekeepalive
        }//static void

    //Calculation Methods
    static void calcMethodAdd(int x, int y){
        System.out.println(x + y);
    }
    static void calcMethodSub(int x, int y){
        System.out.println(x - y);
    }
    static void calcMethodMulti(int x, int y){
        System.out.println(x * y);
    }
    static void calcMethodDiv(int x, int y){
        System.out.println(x / y);
    }
}//main
