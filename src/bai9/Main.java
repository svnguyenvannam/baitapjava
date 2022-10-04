package bai9;

import bai5.KhachSan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLiBienLai quanli = new QuanLiBienLai();
        while (true) {
            System.out.println("Chương trình quản lí biên lại tiền điện có các chức năng: ");
            System.out.println("Phím 1: Thêm khách hàng");
            System.out.println("Phím 2: Xóa khách hàng");
            System.out.println("Phím 3:Thay đổi thông tin khách hàng");
            System.out.println("Phím 4: Tính tiền điện");
            System.out.println("Phím 5: Thoát chương trình:");
            String line = scanner.nextLine();
            switch (line) {

                case "1": {

                    System.out.println("Nhập tên khách hàng");
                    String name = scanner.nextLine();
                    System.out.println("Nhâp số nhà:");
                    int soNha = scanner.nextInt();
                    System.out.println("Nhập mã số công tơ điện");
                    String id = scanner.nextLine();
                    KhachHang khachhang = new KhachHang(name, soNha, id);
                    quanli.addKhachHang(khachhang);
                    break;

                }
                case "2": {
                    System.out.println("Nhập mã số công tơ điện");
                    String id = scanner.nextLine();
                    quanli.deleteKhachHang(id);
                    break;

                }
                case "3": {
                    System.out.println("Nhập mã số công tơ điện");
                    String id = scanner.nextLine();
                    quanli.editKhachHang(id);
                    break;
                }
                case "4": {
                    System.out.println("Nhập mã số công tơ điện");
                    String id = scanner.nextLine();
                    quanli.tienDien(id);
                    break;
                }
                case "5":
                    return;


                default:
                    System.out.println("Không hợp lệ");
                    continue;


            }
        }
    }
}

