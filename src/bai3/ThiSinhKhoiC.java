package bai3;

public class ThiSinhKhoiC extends ThiSinh{


    public static final String MON_VAN =" Văn";
    public static final String MON_SU = "Sử";
    public static final String MON_DIA = "Địa";
    ThiSinhKhoiC(String soBaoDanh,String name,String address, String mucUuTien){
        super(soBaoDanh, name, address, mucUuTien);
    }

    @Override
    public String toString(){

        return "Thí sinh thi khối C{" +" Họ và tên:"+name+ ",Số báo danh:" +soBaoDanh
                +" Địa chỉ:"+ address+", Mức ưu tiên:"+ mucUuTien+"}";
    }
}
