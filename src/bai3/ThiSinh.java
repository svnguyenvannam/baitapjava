package bai3;

public class ThiSinh {
    protected String soBaoDanh;
    protected String name;
    protected String address;
    protected String mucUuTien;

    public String getSoBaoDanh() {
        return soBaoDanh;
    }

    public void setSoBaoDanh(String soBaoDanh) {
        this.soBaoDanh = soBaoDanh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMucUuTien() {
        return mucUuTien;
    }

    public void setMucUuTien(String mucUuTien) {
        this.mucUuTien = mucUuTien;
    }

    ThiSinh(String  soBaoDanh, String name, String address, String mucUuTien){
        this.soBaoDanh =soBaoDanh;
        this.name = name;
        this.address = address;
        this.mucUuTien = mucUuTien;
    }

}
