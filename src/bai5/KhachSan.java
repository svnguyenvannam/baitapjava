package bai5;

import java.util.ArrayList;
import java.util.List;
import bai5.*;


public class KhachSan {

    List<Nguoi> khachsan;
    public KhachSan() {
        this.khachsan = new ArrayList<>();
    }
    public void addKhach(Nguoi nguoi){

        this.khachsan.add(nguoi);
    }
    public  boolean deleteKhach(String socmt){

        Nguoi nguoi = this.khachsan.stream()
                .filter(Nguoi -> Nguoi.getSocmt().equals(socmt))
                .findFirst().orElse(null);

        if(nguoi == null){
            return false;
        }
        khachsan.remove(nguoi);
        return true;
    }

    public int tienThue(String socmt) {

        Nguoi nguoi = this.khachsan.stream()
                .filter(Nguoi -> Nguoi.getSocmt().equals(socmt))
                .findFirst().orElse(null);
        if (nguoi == null) {
            return 0;
        }
        return nguoi.getLoaiphong().getGia()* nguoi.getSongaythue();
    }
    public void hienThi(){

        this.khachsan.forEach(o->System.out.println(o.toString()));
    }






}
