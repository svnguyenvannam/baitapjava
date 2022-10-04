package bai5;

public class Nguoi {
    private String name;
    private int age;
    private String socmt;
    private int songaythue;
    private LoaiPhong loaiphong;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSocmt() {
        return socmt;
    }

    public void setSocmt(String socmt) {
        this.socmt = socmt;
    }

    public int getSongaythue() {
        return songaythue;
    }

    public void setSongaythue(int songaythue) {
        this.songaythue = songaythue;
    }

    public LoaiPhong getLoaiphong() {
        return loaiphong;
    }

    public void setLoaiphong(LoaiPhong loaiphong) {
        this.loaiphong = loaiphong;
    }

    Nguoi(String name, int age, String socmt, int songaythue, LoaiPhong loaiphong) {
        this.name = name;
        this.age = age;
        this.socmt = socmt;
        this.songaythue = songaythue;
        this.loaiphong = loaiphong;
    }
    @Override
    public String toString() {
        return "Người {" +" Họ và ten"+ name+ " tuổi" + age+ " số chứng minh nhân dân "+socmt
                +" số ngày thuê " +songaythue + " loại phòng" +loaiphong +"}";
    }
}
