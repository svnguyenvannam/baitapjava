package bai13;

import java.util.*;

import bai13.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLi quanli =new QuanLi();
        while (true) {
            System.out.println("Chương trình quản lí nhân viên có các chức năng: ");
            System.out.println("Phím 1: Thêm nhân viên");
            System.out.println("Phím 2: Xóa nhân viên");
            System.out.println("Phím 3:Tìm kiếm nhân viên");
            System.out.println("Phím 4: Hiển thị toàn bộ nhân viên theo loại");
            System.out.println("Phím 5: Hiển thị toàn bộ nhân viên ");
            System.out.println("Phím 6: Thoát chương trình:");
            String line = scanner.nextLine();
            switch (line) {
                case "1":{
                    System.out.println("Nhấn 7: Thêm Experience");
                    System.out.println("Nhấn 8: Thêm Fresher");
                    System.out.println("Nhấn 9: Thêm Intern");
                    String sc = scanner.nextLine();
                    switch (sc){

                        case "7": {

                            System.out.print("Nhập ID: ");
                            String id = scanner.nextLine();
                            System.out.print("Nhập Name: ");
                            String name = scanner.nextLine();
                            System.out.print("Nhập Phone: ");
                            String phone = scanner.nextLine();
                            System.out.print("Nhập Email: ");
                            String email = scanner.nextLine();
                            System.out.print("Nhập  số lượng Certificates");
                            int a = scanner.nextInt();
                            if (a == 1) {
                                System.out.print("Nhập CertificatedID");
                                String CertificatedID = scanner.nextLine();
                                System.out.print("Nhập CertificateName");
                                String CertificateName = scanner.nextLine();
                                System.out.print("Nhập CertificateRank");
                                String CertificateRank = scanner.nextLine();
                                System.out.print("Nhập CertificatedDate");
                                String CertificatedDate = scanner.nextLine();
                                Certificate certificate = new Certificate(CertificatedID,CertificateName,CertificateRank,CertificatedDate);


                            }
                        /*    Experience e = new Experience(id,name,phone,email,certificate);
*/
                            if (a>1){
                                for (int i = 0; i <a;i++ ) {
                                    System.out.print("Nhập CertificatedID thứ " + i);
                                    String CertificatedID = scanner.nextLine();
                                    System.out.print("Nhập CertificateName thứ " + i);
                                    String CertificateName = scanner.nextLine();
                                    System.out.print("Nhập CertificateRank thứ " + i);
                                    String CertificateRank = scanner.nextLine();
                                    System.out.print("Nhập CertificatedDate thứ " + i);
                                    String CertificatedDate = scanner.nextLine();
                                    Certificate certificate = new Certificate(CertificatedID,CertificateName,CertificateRank,CertificatedDate);
                                    List<Certificate> certificates = new ArrayList<>();

                                }


                            }




                            }



                        }
                            }

                        }
                    }
                }

                }

