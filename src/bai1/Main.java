package bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QLCB qlcb = new QLCB();
        while (true) {
            System.out.println("Chương trình quản lí cán bộ có các chức năng:");
            System.out.println("Phím 1: Thêm cán bộ");
            System.out.println("Phím 2: Tìm kiếm theo tên ");
            System.out.println("Phím 3: Hiển thị danh sách cán bộ");
            System.out.println("Phím 4: Thoát chương trình");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Nhấn a: Thêm Kĩ Sư");
                    System.out.println("Nhấn b: Thêm Nhân Viên");
                    System.out.println("Nhấn c: Thêm Công Nhân");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {
                            System.out.print("Nhâp tên: ");
                            String name = scanner.nextLine();
                            System.out.print("Nhâp tuổi:");
                            int age = scanner.nextInt();
                            System.out.print("Nhâp giới tính: ");
                            scanner.nextLine();
                            String gender = scanner.nextLine();
                            System.out.print("Nhâp địa chỉ: ");
                            String address = scanner.nextLine();
                            System.out.print("Nhâp ngành đào tạo: ");
                            String major = scanner.nextLine();
                            KiSu kiSu = new KiSu(name, age, gender, address, major);
                            qlcb.addCanBo(kiSu);
                            System.out.println(kiSu.toString());
                            break;

                        }
                        case "b": {
                            System.out.print("Nhâp tên: ");
                            String name = scanner.nextLine();
                            System.out.print("Nhâp tuổi:");
                            int age = scanner.nextInt();
                            System.out.print("Nhâp giới tính: ");
                            scanner.nextLine();
                            String gender = scanner.nextLine();
                            System.out.print("Nhâp địa chỉ: ");
                            String address = scanner.nextLine();
                            System.out.print("Nhâp công việc: ");
                            String job = scanner.nextLine();
                            NhanVien nhanVien = new NhanVien(name, age, gender, address, job);
                            qlcb.addCanBo(nhanVien);
                            System.out.println(nhanVien.toString());
                            scanner.nextLine();
                            break;
                        }
                        case "c": {
                            System.out.print("Nhâp tên: ");
                            String name = scanner.nextLine();
                            System.out.print("Nhâp tuổi: ");
                            int age = scanner.nextInt();
                            System.out.print("Nhâp giới tính: ");
                            scanner.nextLine();
                            String gender = scanner.nextLine();
                            System.out.print("Nhâp địa chỉ: ");
                            String address = scanner.nextLine();
                            System.out.print("Nhâp bậc: ");
                            int  level = scanner.nextInt();
                            CongNhan congNhan = new CongNhan(name, age, gender, address, level);
                            qlcb.addCanBo(congNhan);
                            System.out.println(congNhan.toString());
                            break;
                        }
                        default:
                            System.out.println("Không hơp lệ");
                            break;
                    }
                    break;
                }
                case "2": {
                    System.out.print("Nhập tên để tìm kiếm: ");
                    String name = scanner.nextLine();
                    qlcb.timKiemTheoTen(name).forEach(canBo -> {
                        System.out.println(canBo.toString());
                    });
                    break;
                }
                case "3": {
                    qlcb.hienThiCanBo();
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
