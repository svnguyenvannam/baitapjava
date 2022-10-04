package bai2;

public class Bao extends TaiLieu{

    private int ngayPhatHanh;
    public Bao(String maTaiLieu, String tenNXB, int soBanPhatHanh, int ngayPhatHanh){
        super(maTaiLieu, tenNXB, soBanPhatHanh);
        this.ngayPhatHanh=ngayPhatHanh;
    }

    public int getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }
    @Override
    public String toString() {
        return " Báo"+" Ngay Phat Hanh" +ngayPhatHanh+" Ma tai lieu " +maTaiLieu+ " Ten NXB"+
                tenNXB + " So Ban Phat Hanh"+ soBanPhatHanh;
    }
}
