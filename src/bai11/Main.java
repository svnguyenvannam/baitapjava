package bai11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Khai bao doi tuong
        SoPhuc sp1 = new SoPhuc();
        SoPhuc sp2 = new SoPhuc();
        SoPhuc sp3 = new SoPhuc();
        SoPhuc sp4 = new SoPhuc();


        // Nhap
        System.out.println("Nhap vao so phuc 1:");
        sp1.nhap(sc);
        System.out.println("Nhap vao so phuc 2:");
        sp2.nhap(sc);

        // Hien thi
        System.out.println("Số phức thứ nhât là:");
        sp1.hienThi();
        System.out.println("Số phức thứ hai là:");
        sp2.hienThi();


        //Tong 2 so phuc

        System.out.println("Tổng của 2 số phức s1 và s2 là:");
        sp3.congSP(sp1,sp2);

        // Nhan 2 số phức
        System.out.println("Tích của 2 số phức s1 và s2 là:"  );
        sp4.congSP(sp1,sp2);


    }
}
