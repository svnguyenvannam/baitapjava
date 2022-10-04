package bai15;

import java.util.GregorianCalendar;
import bai15.*;

public class SinhVien {
    protected String id;
    protected String name;
    protected GregorianCalendar datebirth;
    protected int namvaohoc;
    protected int diemdauvao;
    protected KetQua ketqua;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GregorianCalendar getDatebirth() {
        return datebirth;
    }

    public void setDatebirth(GregorianCalendar datebirth) {
        this.datebirth = datebirth;
    }

    public int getNamvaohoc() {
        return namvaohoc;
    }

    public void setNamvaohoc(int namvaohoc) {
        this.namvaohoc = namvaohoc;
    }

    public int getDiemdauvao() {
        return diemdauvao;
    }

    public void setDiemdauvao(int diemdauvao) {
        this.diemdauvao = diemdauvao;
    }

    public KetQua getKetqua() {
        return ketqua;
    }

    public void setKetqua(KetQua ketqua) {
        this.ketqua = ketqua;
    }

    SinhVien(String id, String name, GregorianCalendar datebirth, int namvaohoc, int diemdauvao){
        this.id = id;
        this.name = name;
        this.datebirth = datebirth;
        this.namvaohoc = namvaohoc;
        this.diemdauvao = diemdauvao;
    }

}
