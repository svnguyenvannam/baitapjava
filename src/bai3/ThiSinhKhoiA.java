package bai3;

public class ThiSinhKhoiA extends ThiSinh{

    public static final String MON_TOAN =" Toán";
    public static final String MON_lI = "Lí";
    public static final String MON_HOA = "Hóa";
    ThiSinhKhoiA(String soBaoDanh,String name,String address, String mucUuTien){
        super(soBaoDanh, name, address, mucUuTien);
    }

    @Override
    public String toString(){

        return "Thí sinh thi khối A{" +" Họ và tên:"+name+ ",Số báo danh:" +soBaoDanh
        +" Địa chỉ:"+ address+", Mức ưu tiên:"+ mucUuTien+ "}";
    }

}
