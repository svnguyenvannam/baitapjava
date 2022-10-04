package bai5;

public class LoaiA extends LoaiPhong{

    public LoaiA() {
        super("A",500);
    }
    @Override
    public String toString() {
        return "Loại A{" +
                "loai phòng:'" + loaiphong + "," +
                ", giá=" + gia +
                '}';
    }
}