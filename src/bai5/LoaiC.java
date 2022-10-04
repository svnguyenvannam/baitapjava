package bai5;

public class LoaiC extends LoaiPhong{

    public LoaiC() {
        super("A",100);
    }
    @Override
    public String toString() {
        return "Loại C{" +
                "loai phòng:'" + loaiphong + "," +
                ", giá=" + gia +
                '}';
    }
}