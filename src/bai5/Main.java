package bai5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KhachSan khachsan = new KhachSan();
        while (true) {
            System.out.println("Chương trình quản lí khách sạn có các chức năng: ");
            System.out.println("Phím 1: Thêm khách thuê");
            System.out.println("Phím 2: Xóa khách theo số chứng minh nhân dân");
            System.out.println("Phím 3: Tính tiền thuê");
            System.out.println("Phím 4: Hiển thị thông tin");
            System.out.println("Phím 5: Thoát chương trình:");
            String line = scanner.nextLine();
            switch(line) {
                case "1": {
                    System.out.print("Nhập tên: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập tuổi: ");
                    int age = scanner.nextInt();
                    System.out.print("Nhập chứng minh nhân dân: ");
                    String soCmt=scanner.nextLine();
                    System.out.println("Nhập a để thuê phòng loại A");
                    System.out.println("Nhập b để thuê phòng loại B");
                    System.out.println("Nhập c để thuê phòng loại C");
                    String choise = scanner.nextLine();
                    LoaiPhong loaiphong;
                    if (choise.equals("a")) {
                      loaiphong= new LoaiA();
                    } else if (choise.equals("b")) {
                        loaiphong = new LoaiB();
                    } else if (choise.equals("c")) {
                        loaiphong = new LoaiC();
                    } else {
                        continue;
                    }
                    System.out.print("Nhập số ngày thuê: ");
                    int soNgayThue = scanner.nextInt();
                    Nguoi nguoi = new Nguoi(name, age, soCmt,  soNgayThue, loaiphong);
                    khachsan.addKhach(nguoi);
                    break;
                }
                case "2": {
                    System.out.print("Nhâp số chúng minh nhân dân: ");
                    String soCmt = scanner.nextLine();
                    khachsan.deleteKhach(soCmt);
                    break;
                }
                case "3": {
                    System.out.print("Nhâp số chúng minh nhân dân: ");
                    String soCmt = scanner.nextLine();
                    System.out.println("Tiền tuê là: " + khachsan.tienThue(soCmt));
                    break;
                }
                case "4": {
                    khachsan.hienThi();
                    break;
                }
                case "5": {
                    return;
                }
                default:
                    System.out.println("Không hợp lệ");
                    continue;
            }
        }

    }

    }

