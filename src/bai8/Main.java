package bai8;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLi quanli = new QuanLi();
        while (true) {
            System.out.println("Chương trình quản lí việc mượn trả sach có các chức năng: ");
            System.out.println("Phím 1: Thêm thẻ mượn");
            System.out.println("Phím 2: Xóa thẻ mượn theo mã phiếu mượn");
            System.out.println("Phím 3: Hiển thị thông tin các thẻ mươn");
            System.out.println("Phím 4: Thoát chương trình:");

            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Nhập tên sinh viên:");
                    String name = scanner.nextLine();
                    System.out.println("Nhập tuổi sinh viên:");
                    int age = scanner.nextInt();
                    System.out.println("Nhâp lớp sinh viên");
                    String lop = scanner.nextLine();
                    SinhVien sinhvien = new SinhVien(name,age,lop);
                    System.out.println("Nhập mã phiếu mượn");
                    String maphieumuon = scanner.nextLine();
                    System.out.println("Ngày mượn");
                    String ngaymuon = scanner.nextLine();
                    System.out.println("Hạn trả");
                    String hantra = scanner.nextLine();
                    System.out.println("Số hiệu sách");
                    int sohieusach = scanner.nextInt();

                    TheMuon themuon = new TheMuon(sinhvien,maphieumuon,ngaymuon,hantra,sohieusach);
                    quanli.addTheMuon(themuon);
                    break;

                }

                case "2":{
                    System.out.println("Nhập mã phiếu mượn");
                    String maphieumuon =scanner.nextLine();
                    quanli.deleteTheMuon(maphieumuon);
                    break;

                }
                case "3":{
                    System.out.println("Thông tin các thẻ mượn là:");
                    quanli.hienThi();
                    break;
                }
                case "4":{
                    return;
                }
                default:
                    System.out.println("Không hợp lệ");
                    continue;
            }

        }
    }
}

