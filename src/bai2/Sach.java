package bai2;
import bai2.TaiLieu;
public class Sach extends TaiLieu{
    private String tenTacGia;
    private int soTrang;
    public Sach(String maTaiLieu, String tenNXB, int soBanPhatHanh, String tenTacGia, int soTrang){

        super(maTaiLieu, tenNXB, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return " Sách" + " Ten Tac Gia"
                + tenTacGia +" Ma tai lieu " +maTaiLieu+ " Ten NXB"+ tenNXB +
                " So Ban Phat Hanh"+ soBanPhatHanh+ " So Trang" +soTrang;
    }
}
