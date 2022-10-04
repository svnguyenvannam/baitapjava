package bai12;

import bai9.QuanLiBienLai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLi quanli = new QuanLi();
        while (true) {
            System.out.println("Chương trình quản lí phương tiện giao thông có các chức năng: ");
            System.out.println("Phím 1: Thêm phương tiện");
            System.out.println("Phím 2: Xóa phương tiện");
            System.out.println("Phím 3: Tìm phương tiện theo màu");
            System.out.println("Phím 4: Tìm phương tiện theo hãng sản xuất ");
            System.out.println("Phím 5: Thoát chương trình:");
            String line = scanner.nextLine();
            switch (line) {

                case "1": {
                    System.out.println("Nhấn 6: Thêm ô tô");
                    System.out.println("Nhấn 7: Thêm xe máy");
                    System.out.println("Nhấn 8: Thêm xe tải");
                    String a =scanner.nextLine();


                    switch (a){

                        case "6":{

                            System.out.println("Nhập id của ô tô");
                            String id = scanner.nextLine();
                            System.out.println("Nhập hãng sản xuất của ô tô");
                            String hangsx = scanner.nextLine();
                            System.out.println("Nhập năm sản xuất của ô tô");
                            String namsx = scanner.nextLine();
                            System.out.println("Nhập giá bán của ô tô");
                            String gia = scanner.nextLine();
                            System.out.println("Nhập màu xe của ô tô ");
                            String mau = scanner.nextLine();
                            System.out.println("Nhập số chỗ ngồi của ô tô");
                            int socho = scanner.nextInt();
                            System.out.println("Nhập kiểu động cơ của ô tô ");
                            String kieudongco = scanner.nextLine();
                            OTO oto = new OTO(id,hangsx,namsx,gia,mau,socho,kieudongco);
                            quanli.addPhuongTien(oto);
                            break;
                        }
                        case "7":{
                            System.out.println("Nhập id của xe máy");
                            String id = scanner.nextLine();
                            System.out.println("Nhập hãng sản xuất của xe máy");
                            String hangsx = scanner.nextLine();
                            System.out.println("Nhập năm sản xuất của xe máy");
                            String namsx = scanner.nextLine();
                            System.out.println("Nhập giá bán của xe máy");
                            String gia = scanner.nextLine();
                            System.out.println("Nhập màu xe của xe máy ");
                            String mau = scanner.nextLine();
                            System.out.println("Nhập công suất của xe máy");
                            String congsuat = scanner.nextLine();
                            XeMay xemay = new XeMay(id,hangsx,namsx,gia,mau,congsuat);
                            quanli.addPhuongTien(xemay);
                            break;
                        }
                        case "8":{
                            System.out.println("Nhập id của xe tải");
                            String id = scanner.nextLine();
                            System.out.println("Nhập hãng sản xuất của xe tải");
                            String hangsx = scanner.nextLine();
                            System.out.println("Nhập năm sản xuất của xe tải");
                            String namsx = scanner.nextLine();
                            System.out.println("Nhập giá bán của xe tải");
                            String gia = scanner.nextLine();
                            System.out.println("Nhập màu xe của xe tải ");
                            String mau = scanner.nextLine();
                            System.out.println("Nhập trọng tải của xe tải");
                            String trongtai = scanner.nextLine();
                            XeTai xetai = new XeTai(id,hangsx,namsx,gia,mau,trongtai);
                            quanli.addPhuongTien(xetai);
                            break;
                        }
                        }
                        break;

                        }
                case "2":{
                    System.out.println("Nhâp id xe cần xóa");
                    String id = scanner.nextLine();
                    quanli.deletePhuongTien(id);
                    break;


                }
                case "3":{
                    System.out.println("Nhập hãng sản xuất cẩn tìm");
                    String hangsx =scanner.nextLine();
                    quanli.timTheoHangSX(hangsx);
                    break;
                }
                case "4":{
                    System.out.println("Nhập nàu cần tìm");
                    String mau = scanner.nextLine();
                    quanli.timTheoMau(mau);
                    break;
                }
                case "5":{
                    return;
                }

                default :
                    System.out.println("Không hợp lệ");
                    continue;
                    }
                }

                }
}
