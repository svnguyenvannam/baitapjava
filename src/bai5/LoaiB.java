package bai5;

public class LoaiB extends LoaiPhong{

    public LoaiB() {
        super("B",300);
    }
    @Override
    public String toString() {
        return "Loại B{" +
                "loại phòng:'" + loaiphong + "," +
                ", giá=" + gia +
                '}';
    }
}