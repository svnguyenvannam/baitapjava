package bai2;

public class TapChi extends TaiLieu {
    private int soPhatHanh;
    private int thangPhatHanh;

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    public TapChi(String maTaiLieu, String tenNXB, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh){

        super(maTaiLieu, tenNXB, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh=thangPhatHanh;
    }
    @Override
    public String toString() {
        return " Tạp Chí"+ " so Phat Hanh"+ soPhatHanh+" So Ban Phat Hanh"+ soBanPhatHanh
                +" Ma tai lieu " +maTaiLieu+ " Ten NXB"+ tenNXB
                +" Thang Phat Hanh" + thangPhatHanh;
    }
}
