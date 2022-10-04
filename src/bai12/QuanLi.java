package bai12;

import java.util.ArrayList;
import java.util.List;

public class QuanLi {

    List<PhuongTien> quanli;
    public QuanLi() {
        this.quanli = new ArrayList<>();
    }

    public void addPhuongTien(PhuongTien phuongtien){
        this.quanli.add(phuongtien);
    }
    public boolean deletePhuongTien(String id){

        PhuongTien phuongtien = this.quanli.stream()
                .filter(PhuongTien ->PhuongTien.getId().equals(id))
                .findFirst().orElse(null);
        if(phuongtien == null)
            return false;
        else{

            this.quanli.remove(phuongtien);

        }
        return true;
    }


    public PhuongTien timTheoMau(String mau) {

      return this.quanli.stream()
                .filter(PhuongTien -> PhuongTien.getMau().equals(mau))
                .findFirst().orElse(null);

    }
    public PhuongTien timTheoHangSX(String hangsx) {

        return this.quanli.stream()
                .filter(PhuongTien -> PhuongTien.getMau().equals(hangsx))
                .findFirst().orElse(null);

    }

}
