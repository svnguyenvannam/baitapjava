package bai8;

public class TheMuon {

    private SinhVien sinhvien;
    private String maphieumuon;
    private String ngaymuon;
    private String hantra;
    private int sohieusach;


    public String getMaphieumuon() {
        return maphieumuon;
    }

    public void setMaphieumuon(String maphieumuon) {
        this.maphieumuon = maphieumuon;
    }

    public String getNgaymuon() {
        return ngaymuon;
    }

    public void setNgaymuon(String ngaymuon) {
        this.ngaymuon = ngaymuon;
    }

    public String getHantra() {
        return hantra;
    }

    public void setHantra(String hantra) {
        this.hantra = hantra;
    }

    public int getSohieusach() {
        return sohieusach;
    }

    public void setSohieusach(int sohieusach) {
        this.sohieusach = sohieusach;
    }

    public SinhVien getSinhvien() {
        return sinhvien;
    }

    public void setSinhvien(SinhVien sinhvien) {
        this.sinhvien = sinhvien;
    }

    TheMuon(SinhVien sinhvien, String maphieumuon, String ngaymuon, String hantra, int sohieusach){
        this.sinhvien =sinhvien;
        this.maphieumuon = maphieumuon;
        this.ngaymuon = ngaymuon;
        this.hantra = hantra;
        this.sohieusach = sohieusach;
    }
@Override

    public String toString() {
        return " Sinh Viên: "+sinhvien+",mã phiêu mượn"+maphieumuon+
                ",ngày mượn "+ ngaymuon+ ", hạn trả"+ hantra +", số hiệu sách "+ sohieusach;
    }
}
