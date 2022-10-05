package bai13;

import java.util.*;

import bai13.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLi quanli =new QuanLi();
        List<Certificate> certificates = new ArrayList<>();
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
                    System.out.println("Nhâp Employee_type");
                    int Employee_type = scanner.nextInt();

                        if(Employee_type == 0) {

                            System.out.print("Nhập ID: ");
                            String id = scanner.nextLine();
                            System.out.print("Nhập tên: ");
                            String name = scanner.nextLine();
                            System.out.print("Nhập ngày sinh");
                            String birthday = scanner.nextLine();
                            System.out.print("Nhập số điện thoại: ");
                            String phone = scanner.nextLine();
                            System.out.print("Nhập Email: ");
                            String email = scanner.nextLine();
                            System.out.print("Nhập  số lượng Certificates");
                            int a = scanner.nextInt();
                            if (a == 1) {
                                System.out.print("Nhập CertificatedID");
                                String certificatedID = scanner.nextLine();
                                System.out.print("Nhập CertificateName");
                                String certificateName = scanner.nextLine();
                                System.out.print("Nhập CertificateRank");
                                String certificateRank = scanner.nextLine();
                                System.out.print("Nhập CertificatedDate");
                                String certificatedDate = scanner.nextLine();
                                Certificate certificate = new Certificate(certificatedID, certificateName, certificateRank, certificatedDate);
                                certificates.add(certificate);

                            }
                            /*    Experience e = new Experience(id,name,phone,email,certificate);
                             */
                            if (a > 1) {
                                for (int i = 0; i < a; i++) {
                                    System.out.print("Nhập CertificatedID thứ " + i);
                                    String CertificatedID = scanner.nextLine();
                                    System.out.print("Nhập CertificateName thứ " + i);
                                    String CertificateName = scanner.nextLine();
                                    System.out.print("Nhập CertificateRank thứ " + i);
                                    String CertificateRank = scanner.nextLine();
                                    System.out.print("Nhập CertificatedDate thứ " + i);
                                    String CertificatedDate = scanner.nextLine();
                                    Certificate certificate = new Certificate();
                                    certificate.setCertificatedID(CertificatedID);
                                    certificate.setCertificateName(CertificateName);
                                    certificate.setCertificateRank(CertificateRank);
                                    certificate.setCertificatedDate(CertificatedDate);
                                    certificates.add(certificate);
                                }
                                System.out.print("Nhập ExpInYear");
                                int expinyear = scanner.nextInt();
                                System.out.print("Nhập ProSkill");
                                String proskill = scanner.nextLine();
                                Experience e = new Experience(id, name, birthday, phone, email, certificates, Employee_type, expinyear, proskill);
                                quanli.add(e);
                                break;
                            }
                        }
                        if(Employee_type == 1){
                            System.out.print("Nhập ID: ");
                            String id = scanner.nextLine();
                            System.out.print("Nhập tên: ");
                            String name = scanner.nextLine();
                            System.out.print("Nhập ngày sinh");
                            String birthday = scanner.nextLine();
                            System.out.print("Nhập số điện thoại: ");
                            String phone = scanner.nextLine();
                            System.out.print("Nhập Email: ");
                            String email = scanner.nextLine();
                            System.out.print("Nhập  số lượng Certificates");
                            int a = scanner.nextInt();
                            if (a == 1) {
                                System.out.print("Nhập CertificatedID");
                                String certificatedID = scanner.nextLine();
                                System.out.print("Nhập CertificateName");
                                String certificateName = scanner.nextLine();
                                System.out.print("Nhập CertificateRank");
                                String certificateRank = scanner.nextLine();
                                System.out.print("Nhập CertificatedDate");
                                String certificatedDate = scanner.nextLine();
                                Certificate certificate = new Certificate(certificatedID, certificateName, certificateRank, certificatedDate);
                                certificates.add(certificate);

                            }
                            /*    Experience e = new Experience(id,name,phone,email,certificate);
                             */
                            if (a > 1) {
                                for (int i = 0; i < a; i++) {
                                    System.out.print("Nhập CertificatedID thứ " + i);
                                    String CertificatedID = scanner.nextLine();
                                    System.out.print("Nhập CertificateName thứ " + i);
                                    String CertificateName = scanner.nextLine();
                                    System.out.print("Nhập CertificateRank thứ " + i);
                                    String CertificateRank = scanner.nextLine();
                                    System.out.print("Nhập CertificatedDate thứ " + i);
                                    String CertificatedDate = scanner.nextLine();
                                    Certificate certificate = new Certificate();
                                    certificate.setCertificatedID(CertificatedID);
                                    certificate.setCertificateName(CertificateName);
                                    certificate.setCertificateRank(CertificateRank);
                                    certificate.setCertificatedDate(CertificatedDate);
                                    certificates.add(certificate);
                                }
                                System.out.println("Nhập Graduation_date");
                                String Graduation_date = scanner.nextLine();
                                System.out.println("Nhập Graduation_rank");
                                String Graduation_rank = scanner.nextLine();
                                System.out.println("Nhập Education");
                                String Education = scanner.nextLine();
                                Fresher fr = new Fresher(id,name,birthday,phone,email,certificates,Employee_type,Graduation_date,Graduation_rank,Education);
                                quanli.add(fr);
                                break;
                            }
                        }
                        if(Employee_type==2) {
                            System.out.print("Nhập ID: ");
                            String id = scanner.nextLine();
                            System.out.print("Nhập tên: ");
                            String name = scanner.nextLine();
                            System.out.print("Nhập ngày sinh");
                            String birthday = scanner.nextLine();
                            System.out.print("Nhập số điện thoại: ");
                            String phone = scanner.nextLine();
                            System.out.print("Nhập Email: ");
                            String email = scanner.nextLine();
                            System.out.print("Nhập  số lượng Certificates");
                            int a = scanner.nextInt();
                            if (a == 1) {
                                System.out.print("Nhập CertificatedID");
                                String certificatedID = scanner.nextLine();
                                System.out.print("Nhập CertificateName");
                                String certificateName = scanner.nextLine();
                                System.out.print("Nhập CertificateRank");
                                String certificateRank = scanner.nextLine();
                                System.out.print("Nhập CertificatedDate");
                                String certificatedDate = scanner.nextLine();
                                Certificate certificate = new Certificate(certificatedID, certificateName, certificateRank, certificatedDate);
                                certificates.add(certificate);

                            }
                            /*    Experience e = new Experience(id,name,phone,email,certificate);
                             */
                            if (a > 1) {
                                for (int i = 0; i < a; i++) {
                                    System.out.print("Nhập CertificatedID thứ " + i);
                                    String CertificatedID = scanner.nextLine();
                                    System.out.print("Nhập CertificateName thứ " + i);
                                    String CertificateName = scanner.nextLine();
                                    System.out.print("Nhập CertificateRank thứ " + i);
                                    String CertificateRank = scanner.nextLine();
                                    System.out.print("Nhập CertificatedDate thứ " + i);
                                    String CertificatedDate = scanner.nextLine();
                                    Certificate certificate = new Certificate();
                                    certificate.setCertificatedID(CertificatedID);
                                    certificate.setCertificateName(CertificateName);
                                    certificate.setCertificateRank(CertificateRank);
                                    certificate.setCertificatedDate(CertificatedDate);
                                    certificates.add(certificate);
                                }
                                System.out.println("Nhập Majors");
                                String Majors = scanner.nextLine();
                                System.out.println("Nhập Semesteres");
                                String Semesteres = scanner.nextLine();
                                System.out.println("Nhập University_name");
                                String University_name = scanner.nextLine();
                                Intern in = new Intern(id, name, birthday, phone, email, certificates, Employee_type, Majors, Semesteres, University_name);
                                quanli.add(in);
                                break;
                            }
                        }

                }

                case "2":{
                    System.out.println("Nhập ID nhân viên");
                    String id = scanner.nextLine();
                    quanli.delete(id);
                    break;
                }
                case "3":{
                    System.out.println("Nhập ID nhân viên");
                    String id = scanner.nextLine();
                    quanli.fimdByID(id);
                    break;
                }
                case "4":{
                    System.out.println("Nhập Employee_type");
                    int Employee_type = scanner.nextInt();
                    quanli.findbybyEmployee_Type(Employee_type);
                    break;
                }
                case "5":{
                    quanli.findAll();
                    break;
                }
                case "6":{
                    return;
                }
                default :
                    System.out.println("Không hợp lệ");
                    continue;

            }
        }
    }

}

