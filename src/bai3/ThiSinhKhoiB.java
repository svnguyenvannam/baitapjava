package bai3;

public class ThiSinhKhoiB extends ThiSinh {

    public static final String MON_TOAN =" Toán";
    public static final String MON_HOA = "Hóa";
    public static final String MON_SINH = "Sinh";
    ThiSinhKhoiB(String soBaoDanh,String name,String address, String mucUuTien){
        super(soBaoDanh, name, address, mucUuTien);
    }

    @Override
    public String toString(){

        return "Thí sinh thi khối B{" +" Họ và tên:"+name+ ",Số báo danh:" +soBaoDanh
                +" Địa chỉ:"+ address+", Mức ưu tiên:"+ mucUuTien+ "}";
    }
}
