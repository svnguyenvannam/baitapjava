package bai8;

import java.util.ArrayList;
import java.util.List;

public class QuanLi {

    List<TheMuon> quanli;
    public QuanLi(){

        this.quanli = new ArrayList<>();
    }

    public void addTheMuon(TheMuon themuon){

        this.quanli.add(themuon);
    }

    public boolean deleteTheMuon(String maphieumuon){

        TheMuon themuon=this.quanli.stream()
                .filter(TheMuon -> TheMuon.getMaphieumuon().equals(maphieumuon))
                .findFirst().orElse(null);

        if (themuon == null) {
            return false;
        }
        this.quanli.remove(themuon);
        return true;
    }

    public  void hienThi(){

        this.quanli.forEach(o->System.out.println(o.toString()));
    }
}
