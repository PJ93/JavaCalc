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
            while(keepalive){
                System.out.println("Enter the first number");
                int number1 = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter the seconded number");
                int number2 = Integer.parseInt(scanner.nextLine());
                //char mathselect = Character.isJavaIdentifierPart();
                // deleted and replaced with a simple number option for the time be
                System.out.println("choose math equation");
                int mathselect = Integer.parseInt(scanner.nextLine());
                switch(mathselect){
                    case 1:
                        System.out.println(number1+number2);
                        break;
                    case 2:
                        System.out.println(number1-number2);
                        break;
                    case 3:
                        System.out.println(number1*number2);
                        break;
                    case 4:
                        System.out.println(number1%number2);
                        break;
                    default:
                        System.out.println("please only use +, - , * and /");
                        break;
                }//switch

            }//while
        }//static void
}//main
