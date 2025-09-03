import java.util.Scanner;

public class Converter {
    public static Scanner scanner = new Scanner(System.in);
    
    public static double getDoubleInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }
    public static void main(String[] args) {
        double dollar_amount = getDoubleInput("Enter a monetary amount (e.g., 67.67): ");
        double cents = Math.round(dollar_amount * 100);

        String[] names = new String[ ]{"dollars", "quarters", "dimes", "nickels", "pennies"};
        int[] money = new int[ ]{0,0,0,0,0};
        int[] values = new int []{100,25,10,5,1};
        for (int i = 0; i < money.length; i++) {
            while ((cents - values[i]) >= 0) {
            money[i] += 1;
            cents -= values[i];
            }
            System.out.println(names[i] + ": " + money[i]);
        }

        /* Here is the other simpler version i made. WITHOUT ARRAYS. 

        int dollars = 0;
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;
        while ((cents - 100) >= 0) {
            dollars += 1;
            cents -= 100;
        }
        while ((cents - 25) >= 0) {
            quarters += 1;
            cents -= 25;
        }
        while ((cents - 10) >= 0) {
            dimes += 1;
            cents -= 10;
        }
        while ((cents - 5) >= 0) {
            nickels += 1;
            cents -= 5;
        }
        while ((cents - 1) >= 0) {
            pennies += 1;
            cents -= 1;
        }
        System.out.println("Dollars:" + dollars);
        System.out.println("Quarters:" +  quarters);
        System.out.println("dimes:" +  dimes);
        System.out.println("nickels:" +  nickels);
        System.out.println("pennies:" +  pennies);
        */
    }
}