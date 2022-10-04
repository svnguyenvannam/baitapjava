package bai15;

import java.util.GregorianCalendar;

public class SinhVienTaiChuc extends SinhVien{
    private String noilienketdaotao;
    private Khoa khoa;

    public String getNoilienketdaotao() {
        return noilienketdaotao;
    }

    public void setNoilienketdaotao(String noilienketdaotao) {
        this.noilienketdaotao = noilienketdaotao;
    }


    SinhVienTaiChuc(String id, String name, GregorianCalendar datebirth, int namvaohoc,
                    int diemdauvao, String noilienketdaotao, Khoa khoa){
        super(id, name, datebirth, namvaohoc,diemdauvao);
        this.noilienketdaotao = noilienketdaotao;
        this.khoa = khoa;
    }


}
