package bai12;

public class XeTai  extends PhuongTien{

    private String trongtai;

    public String getTrongtai() {
        return trongtai;
    }

    public void setTrongtai(String trongtai) {
        this.trongtai = trongtai;
    }

    XeTai (String id, String hangsx, String namsx, String gia, String mau, String trongtai){
        super(id,hangsx,namsx,gia,mau);
        this.trongtai = trongtai;
    }

}
