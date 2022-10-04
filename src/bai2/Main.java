package bai2;

import bai2.*;

import java.util.Scanner;
import bai2.QuanLiSach;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLiSach quanLiSach = new QuanLiSach();
        while (true) {
            System.out.println("Chương trình quản lí sách có các chức năng");
            System.out.println("Phím 1: Thêm tài liệu");
            System.out.println("Phím 2: Xoá tài liệu theo mã tài liệu ");
            System.out.println("Phím 3: Hiện thị thông tin về tài liệu");
            System.out.println("Phím 4: Tìm kiếm tài liệu theo loại:");
            System.out.println("Phím 5: Thoát chương trình");
            String line = scanner.nextLine();
            switch (line) {

                case "1": {
                    System.out.println("Nhấn a: Thêm Sách");
                    System.out.println("Nhấn b: Thêm Báo");
                    System.out.println("Nhấn c: Thêm Tạp Chí ");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {
                            System.out.print("Nhập Mã Tài Liệu: ");
                            String maTaiLieu = scanner.nextLine();
                            System.out.print("Nhập Tên NXB:");
                            String tenNXB = scanner.nextLine();
                            System.out.print("Nhập Số Bản Phát Hành: ");
                            int soBanPhatHanh = scanner.nextInt();
                            System.out.print("Nhập Tên Tác Giả: ");
                            String tenTacGia = scanner.nextLine();
                            System.out.print("Nhập Số Trang: ");
                            int soTrang = scanner.nextInt();
                            TaiLieu sach = new Sach(maTaiLieu,tenNXB,soBanPhatHanh,tenTacGia,soTrang);
                            quanLiSach.addTaiLieu(sach);
                            System.out.println(sach.toString());
                            scanner.nextLine();
                            break;

                        }
                        case "b": {
                            System.out.print("Nhập Mã Tài Liệu: ");
                            String maTaiLieu = scanner.nextLine();
                            System.out.print("Nhập Tên NXB:");
                            String tenNXB = scanner.nextLine();
                            System.out.print("Nhập Số Phát Hành: ");
                            int soPhatHanh = scanner.nextInt();
                            System.out.print("Nhập Ngày Phát Hành: ");
                            int ngayPhatHanh = scanner.nextInt();
                            TaiLieu bao = new Bao(maTaiLieu,tenNXB,soPhatHanh,ngayPhatHanh);
                            quanLiSach.addTaiLieu(bao);
                            System.out.println(bao.toString());
                            scanner.nextLine();
                            break;
                        }
                        case "c": {
                            System.out.print("Nhập Mã Tài Liệu: ");
                            String maTaiLieu = scanner.nextLine();
                            System.out.print("Nhập Tên NXB:");
                            String tenNXB = scanner.nextLine();
                            System.out.print("Nhập Số Bản Phát Hành: ");
                            int soBanPhatHanh = scanner.nextInt();
                            System.out.print("Nhập Số Phát Hành : ");
                            int soPhatHanh = scanner.nextInt();
                            System.out.print("Nhập tháng phát hành : ");
                            int thangPhatHanh = scanner.nextInt();
                            TaiLieu tapChi = new TapChi(maTaiLieu,tenNXB,soBanPhatHanh,soPhatHanh,thangPhatHanh);
                            quanLiSach.addTaiLieu(tapChi);
                            System.out.println(tapChi.toString());
                            scanner.nextLine();
                            break;
                        }
                        default:
                            break;
                    }
                    break;
                }
                case "2": {
                    System.out.print("Nhập Mã Tài Liệu cần xóa: ");
                    String id = scanner.nextLine();
                    System.out.println(quanLiSach.deletetaiLieu(id) ? "Success" : "Fail");
                }
                case "3":{

                    quanLiSach.hienThiThongTinTaiLieu();
                    break;

                }

                case "4": {
                    System.out.println("Nhấn a để tìm Sách");
                    System.out.println("Nhấn b để tìm Báo");
                    System.out.println("Nhấn c để tìm Tạp Chí");
                    String choise = scanner.nextLine();
                    switch (choise) {
                        case "a": {
                            quanLiSach.timSach();
                            break;
                        }
                        case "b": {
                            quanLiSach.timBao();
                            break;
                        }
                        case "c":
                            quanLiSach.timTapChi();
                            break;
                        default:
                            System.out.println("Không hợp lệ");
                            break;
                    }
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
