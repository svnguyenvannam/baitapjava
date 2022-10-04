package bai13;

import java.util.Scanner;

public class Validate {
    public static void birthdayCheck(String birthday) throws BirthDayException {
        boolean flag;
        Scanner sc = new Scanner(System.in);

        do {

            // must be a digit from 0 - 9

            String digit = "\\d";

            System.out.print("Input an integer: ");

            String input = sc.next();

            flag = input.matches(digit);

            if (!flag) System.out.println("You must enter a number!");

        } while (!flag);

        System.out.println("Valid data");
    }


    public static void phoneCheck(String phone) throws PhoneException {
        boolean flag;
        Scanner sc = new Scanner(System.in);

        do {

            // must be a digit from 0 - 9

            String digit = "\\d";

            System.out.print("Input an integer: ");

            String input = sc.next();

            flag = input.matches(digit);

            if (!flag) System.out.println("You must enter a number!");

        } while (!flag);

        System.out.println("Valid data");
    }


    public static void emailCheck(String email) throws EmailException {
        // TODO HERE
    }

    public static void nameCheck(String name) throws FullNameException {
        // TODO HERE
    }
}
