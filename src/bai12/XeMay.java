package bai12;

public class XeMay extends PhuongTien{

    private String congsuat;

    public String getCongsuat() {
        return congsuat;
    }

    public void setCongsuat(String congsuat) {
        this.congsuat = congsuat;
    }

    XeMay(String id, String hangsx, String namsx, String gia, String mau, String congsuat){
        super(id,hangsx,namsx,gia,mau);

        this.congsuat = congsuat;
    }
}
