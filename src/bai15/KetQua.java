package bai15;

public class KetQua {
    private String tenhocki;
    private float diemtb;

    public String getTenhocki() {
        return tenhocki;
    }

    public void setTenhocki(String tenhocki) {
        this.tenhocki = tenhocki;
    }

    public float getDiemtb() {
        return diemtb;
    }

    public void setDiemtb(float diemtb) {
        this.diemtb = diemtb;
    }

    KetQua(String tenhocki, float diemtb){
        this.tenhocki = tenhocki;
        this.diemtb = diemtb;
    }
}
