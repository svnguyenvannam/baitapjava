package bai3;

import java.util.ArrayList;
import java.util.List;

public class TuyenSinh {
    List<ThiSinh> tuyensinh;

    public TuyenSinh(){

        this.tuyensinh = new ArrayList<>();

    }

    public void addThiSinh(ThiSinh thiSinh){

       this.tuyensinh.add(thiSinh);

    }
    public void hienThi(){

        this.tuyensinh.forEach(thiSinh ->System.out.println(thiSinh.toString()));
    }
    public ThiSinh timKiemBangSoBaoDanh(String soBaoDanh){

        return this.tuyensinh.stream()
                .filter(thiSinh->thiSinh.getSoBaoDanh().equals(soBaoDanh))
                .findFirst().orElse(null);
    }

}
