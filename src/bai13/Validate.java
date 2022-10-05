package bai13;

import java.util.Scanner;

public class Validate {
    public static void birthdayCheck(String birthday) throws BirthDayException {
        boolean flag;
        Scanner sc = new Scanner(System.in);

        do {

            // must be a digit from 0 - 9

            String digit = "\\d";

            System.out.print("Nhâp ngày sinh: ");

            String input = sc.next();

            flag = input.matches(digit);

            if (!flag) System.out.println("Bạn phải nhập 1 số!");

        } while (!flag);

        System.out.println("Ngày sinh hợp lệ");
    }


    public static void phoneCheck(String phone) throws PhoneException {
        boolean flag;
        Scanner sc = new Scanner(System.in);

        do {

            // must be a digit from 0 - 9

            String digit = "\\d";

            System.out.print("Nhập số điện thoại: ");

            String input = sc.next();

            flag = input.matches(digit);

            if (!flag) System.out.println("Bạn phải nhập 1 số!");

        } while (!flag);

        System.out.println("Số điện thoại hợp lệ");
    }


    public static void emailCheck(String email) throws EmailException {
        // TODO HERE
    }

    public static void nameCheck(String name) throws FullNameException {
        // TODO HERE
    }
}
