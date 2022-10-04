package bai1;

public class KiSu extends CanBo{

    private String major;
    KiSu(String name,int age, String gender, String address,String major){
        super(name, age, gender, address);
        this.major = major;
    }
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Kĩ Sư:"+"name "+name+" age "+age+" gender "+gender+" address "+address+" major"+ major;
    }
}

