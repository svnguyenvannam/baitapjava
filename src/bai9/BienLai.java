package bai9;

public class BienLai {

    private KhachHang khachhang;
    private int chisocu;
    private int chisomoi;
    private int tien;

    public KhachHang getKhachhang() {
        return khachhang;
    }

    public void setKhachhang(KhachHang khachhang) {
        this.khachhang = khachhang;
    }

    public int getChisocu() {
        return chisocu;
    }

    public void setChisocu(int chisocu) {
        this.chisocu = chisocu;
    }

    public int getChisomoi() {
        return chisomoi;
    }

    public void setChisomoi(int chisomoi) {
        this.chisomoi = chisomoi;
    }

    public int getTien() {
        return tien;
    }

    public void setTien(int tien) {
        this.tien = tien;
    }

    public BienLai(KhachHang khachhang, int chisocu, int chisomoi, int tien) {
        this.khachhang = khachhang;
        this.chisocu = chisocu;
        this.chisomoi = chisomoi;
        this.tien = tien;


    }


}
