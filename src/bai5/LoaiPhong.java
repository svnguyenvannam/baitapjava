package bai5;

public class LoaiPhong {

    protected String loaiphong;
    protected int gia;

    public String getLoaiPhong() {
        return loaiphong;
    }

    public void setLoai(String loaiphong) {
        this.loaiphong = loaiphong;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    LoaiPhong(String loai, int gia){

        this.loaiphong =loai;
        this.gia= gia;
    }
}
