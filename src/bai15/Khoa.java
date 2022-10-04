package bai15;

import java.util.List;

public class Khoa {

    private String tenkhoa;
    private List<SinhVien> sinhvien;

    public String getTenkhoa() {
        return tenkhoa;
    }

    public void setTenkhoa(String tenkhoa) {
        this.tenkhoa = tenkhoa;
    }

    public List<SinhVien> getSinhvien() {
        return sinhvien;
    }

    public void setSinhvien(List<SinhVien> sinhvien) {
        this.sinhvien = sinhvien;
    }

    Khoa(String tenkhoa, List<SinhVien> sinhvien){

        this.tenkhoa = tenkhoa;
        this.sinhvien = sinhvien;

    }
}
