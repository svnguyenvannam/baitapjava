package bai12;

public class OTO extends PhuongTien{

    private int socho;
    private String kieudongco;

    OTO(String id, String hangsx, String namsx, String gia, String mau,int socho,String kieudongco){
        super(id,hangsx,namsx,gia,mau);
        this.socho = socho;
        this.kieudongco = kieudongco;

    }

    public int getSocho() {
        return socho;
    }

    public void setSocho(int socho) {
        this.socho = socho;
    }

    public String getKieudongco() {
        return kieudongco;
    }

    public void setKieudongco(String kieudongco) {
        this.kieudongco = kieudongco;
    }
}
