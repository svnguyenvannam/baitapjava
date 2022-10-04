package bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TuyenSinh tuyensinh = new TuyenSinh();
        while (true) {
            System.out.println("Chương trình tuyển sinh gồm các chức năng");
            System.out.println("Phím 1: Thêm thí sinh");
            System.out.println("Phím 2: Hiển thị thông tin thí sinh ");
            System.out.println("Phím 3: Tìm kiếm theo số báo danh");
            System.out.println("Phím 4: Thoát chương trình");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Nhấn a: Thêm thí sinh thi khối A");
                    System.out.println("Nhấn b: Thêm thí sinh thi khối B");
                    System.out.println("Nhấn c: Thêm thí sinh thi khối C");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {
                            System.out.println("NHập số báo danh:");
                            String soBaoDanh= scanner.nextLine();
                            System.out.println("NHập họ và tên:");
                            String name= scanner.nextLine();
                            System.out.println("NHập địa chỉ:");
                            String address= scanner.nextLine();
                            System.out.println("NHập mức ưu tiên:");
                            String mucUuTien= scanner.nextLine();
                            ThiSinh a = new ThiSinhKhoiA(soBaoDanh,name,address,mucUuTien);
                            tuyensinh.addThiSinh(a);
                            System.out.println(a.toString());
                            break;


                        }
                        case "b": {
                            System.out.println("NHập số báo danh:");
                            String soBaoDanh= scanner.nextLine();
                            System.out.println("NHập họ và tên:");
                            String name= scanner.nextLine();
                            System.out.println("NHập địa chỉ:");
                            String address= scanner.nextLine();
                            System.out.println("NHập mức ưu tiên:");
                            String mucUuTien= scanner.nextLine();
                            ThiSinh b = new ThiSinhKhoiB(soBaoDanh,name,address,mucUuTien);
                            tuyensinh.addThiSinh(b);
                            System.out.println(b.toString());
                            break;

                        }
                        case "c": {
                            System.out.println("NHập số báo danh:");
                            String soBaoDanh= scanner.nextLine();
                            System.out.println("NHập họ và tên:");
                            String name= scanner.nextLine();
                            System.out.println("NHập địa chỉ:");
                            String address= scanner.nextLine();
                            System.out.println("NHập mức ưu tiên:");
                            String mucUuTien= scanner.nextLine();
                            ThiSinh c = new ThiSinhKhoiC(soBaoDanh,name,address,mucUuTien);
                            tuyensinh.addThiSinh(c);
                            System.out.println(c.toString());
                            break;
                        }
                        default:
                            System.out.println("Không hợp lệ");
                            break;
                    }
                    break;
                }
                case "2": {
                    tuyensinh.hienThi();
                    break;
                }
                case "3": {
                    System.out.print("Nhập số báo danh cần tìm: ");
                    String id = scanner.nextLine();
                    ThiSinh thisinh = tuyensinh.timKiemBangSoBaoDanh(id);
                    if (thisinh == null) {
                        System.out.println("Not found");
                    } else {
                        System.out.println(thisinh.toString());
                    }
                    break;
                }
                case "4": {
                    return;
                }
                default:
                    System.out.println("Không hợp lệ");
                    continue;
            }

        }
    }


}
