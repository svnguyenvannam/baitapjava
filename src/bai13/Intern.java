package bai13;

import java.util.GregorianCalendar;
import java.util.List;

public class Intern extends Employee{
    private String Majors;
    private String Semesteres;
    private String University_name;

    public String getMajors() {
        return Majors;
    }

    public void setMajors(String majors) {
        Majors = majors;
    }

    public String getSemesteres() {
        return Semesteres;
    }

    public void setSemesteres(String semesteres) {
        Semesteres = semesteres;
    }

    public String getUniversity_name() {
        return University_name;
    }

    public void setUniversity_name(String university_name) {
        University_name = university_name;
    }
    public Intern(){};

    public  Intern (String ID, String FullName, String BirthDay, String Phone,
            String Email,List<Certificate> certificates,int Employee_type, String Majors, String Semesteres, String University_name){
        super(ID, FullName, BirthDay, Phone,Email,certificates,Employee_type);
        this.Majors = Majors;
        this.Semesteres = Semesteres;
        this.University_name = University_name;
    }
    @Override
    public void showInfo(){
        System.out.println(this);
    }
    public String toString() {
        return "Intern{" + "id='" + ID + "," +
                ", fullName='" + FullName +
                ", birthday=" + BirthDay +
                ", phone='" + Phone +
                ", email='" + Email  +
                ",certificates" + certificates+
                ", Majors " +Majors +
                ", Semesteres " +Semesteres +
                ", University_name " +University_name + "}";
    }
}
