package bai13;

import java.util.GregorianCalendar;
import java.util.List;

public class Experience extends   Employee{
    private int ExpInYear;
    private String ProSkill;

    public Experience(){};


   public Experience(String ID, String FullName, String BirthDay, double Phone,
                     String Email, List<Certificate> certificates,int ExpInYear, String ProSkill){
        super(ID,FullName,BirthDay,Phone,Email,certificates);
        this.ExpInYear =ExpInYear;
        this.ProSkill = ProSkill;


    }
    @Override
    public void showInfo(){
       System.out.println(this);
    }

    public int getExpInYear() {
        return ExpInYear;
    }

    public void setExpInYear(int expInYear) {
        ExpInYear = expInYear;
    }

    public String getProSkill() {
        return ProSkill;
    }

    public void setProSkill(String proSkill) {
        ProSkill = proSkill;
    }
    @Override
    public String toString() {
        return "Experience{" + "id='" + ID + "," +
                ", fullName='" + FullName +
                ", birthday=" + BirthDay +
                ", phone='" + Phone +
                ", email='" + Email  +
                ",certificates" + certificates+
                ", yearOfExperience=" + ExpInYear +
                ", proSkill='" + ProSkill + '}';
    }
}
