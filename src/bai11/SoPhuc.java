package bai11;

import java.util.Scanner;

public class SoPhuc {
    private double phanthuc;
    private double phanao;

    SoPhuc(){



    }
    SoPhuc(double phanthuc,double phanao){
        this.phanthuc = phanthuc;
        this.phanao = phanao;
    }

    public void nhap(Scanner sc) {
        System.out.print("\tNhap vao phan thuc: ");
        phanthuc = sc.nextDouble();
        System.out.print("\tNhap vao phan ao: ");
        phanao = sc.nextDouble();
    }

    // Ham hien thi so phuc
    public void hienThi() {
        if (phanao< 0) {
            System.out.println(phanthuc + " - " + Math.abs(phanao) + "*i");
        } else {
            System.out.println(phanthuc + " + " + phanao + "*i");
        }
    }

    // Ham cong 2 so phuc
    public SoPhuc congSP(SoPhuc sp1,SoPhuc sp2) {
        double thuc = sp1.phanthuc+sp2.phanthuc;
        double ao = sp1.phanao + sp2.phanao;
        return new SoPhuc(thuc, ao);
    }


    // Ham nhan 2 so phuc
    public SoPhuc nhanSP(SoPhuc sp1,SoPhuc sp2) {
        double thuc = sp1.phanthuc *(sp2.phanthuc)- sp1.phanao*(sp2.phanao);
        double ao = sp1.phanthuc* sp2.phanao+ sp1.phanao*sp2.phanthuc;
        return new SoPhuc(thuc, ao);
    }


}





