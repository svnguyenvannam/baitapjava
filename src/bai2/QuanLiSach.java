package bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.SynchronousQueue;

public class QuanLiSach {
    List <TaiLieu> tailieu;

    public QuanLiSach(){

        this.tailieu =new ArrayList<>();

    }
    public void addTaiLieu(TaiLieu taiLieu){

        this.tailieu.add(taiLieu);
    }
    public boolean deletetaiLieu(String maTailieu){

        TaiLieu tailieu1 = this.tailieu.stream().filter(o -> o.getMaTaiLieu().equals(maTailieu))
                .findFirst().orElse(null);

        if (tailieu1 == null){

            return false;
        }
        this.tailieu.remove(tailieu1);
        return true;

    }

    public void hienThiThongTinTaiLieu(){

        this.tailieu.forEach(tailieu->System.out.println(tailieu.toString()));
    }

    public void timSach(){

        this.tailieu.stream()
                .filter(taiLieu -> tailieu instanceof Sach)
                .forEach(taiLieu -> System.out.println(taiLieu.toString()));
    }
    public void timBao(){
        this.tailieu.stream()
                .filter(taiLieu -> tailieu instanceof Bao)
                .forEach(taiLieu -> System.out.println(taiLieu.toString()));
    }
    public void timTapChi(){

        this.tailieu.stream()
                .filter(taiLieu -> tailieu instanceof TapChi)
                .forEach(taiLieu -> System.out.println(tailieu.toString()));
    }




}
