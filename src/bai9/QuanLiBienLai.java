package bai9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLiBienLai {

    public static Scanner scanner = new Scanner(System.in);

    List<BienLai> quanli;

    public QuanLiBienLai() {
        this.quanli = new ArrayList<>();
    }

    public void addKhachHang(KhachHang khachHang) {

        this.addKhachHang(khachHang);
    }

    public boolean deleteKhachHang(String id) {

        BienLai bienlai = this.quanli.stream()
                .filter(BienLai -> BienLai.getKhachhang().getId().equals(id))
                .findFirst().orElse(null);
        if (bienlai == null) {
            return false;
        }
        this.quanli.remove(bienlai);
        return true;
    }

    public KhachHang editKhachHang(String id) {
        BienLai bienlai = this.quanli.stream()
                .filter(BienLai -> BienLai.getKhachhang().getId().equals(id))
                .findFirst().orElse(null);
        if (bienlai == null) {
            System.out.println("Khách hàng không tồn tại");

        } else {

            bienlai.getKhachhang().setName(inputName());
            bienlai.getKhachhang().setSonha(inputSonha());
            bienlai.getKhachhang().setId(inputId());
        }
        return bienlai.getKhachhang();

    }
    private String inputName() {

        System.out.print("Nhập tên khách hàng: ");
        return scanner.nextLine() ;
    }
    private int inputSonha() {

        System.out.print("Nhập số nhà: ");
        return scanner.nextInt() ;
    }
    private String inputId() {

        System.out.print("Nhập mã số công tơ điện : ");
        return scanner.nextLine() ;
    }

    public int tienDien(String id){
        BienLai bienlai = this.quanli.stream()
                .filter(BienLai -> BienLai.getKhachhang().getId().equals(id))
                .findFirst().orElse(null);
        if (bienlai == null) {
            System.out.println("Khách hàng không tồn tại");

        }
            return (bienlai.getChisomoi() - bienlai.getChisocu())*5;


    }
}
