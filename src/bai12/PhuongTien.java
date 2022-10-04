
package bai12;

public class PhuongTien {


    protected String id;
    protected String hangxs;
    protected String namsx;
    protected String gia;
    protected String mau;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHangxs() {
        return hangxs;
    }

    public void setHangxs(String hangxs) {
        this.hangxs = hangxs;
    }

    public String getNamsx() {
        return namsx;
    }

    public void setNamsx(String namsx) {
        this.namsx = namsx;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public PhuongTien(String id, String hangxs
            , String namsx, String gia, String mau){
        this.id = id;
        this.hangxs = hangxs;
        this.namsx = namsx;
        this.gia = gia;
        this.mau = mau;
    }
}
