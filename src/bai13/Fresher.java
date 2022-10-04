package bai13;


import java.util.List;

public class Fresher extends Employee{
    private String Graduation_date;
    private String Graduation_rank;
    private String Education;

    public String getGraduation_date() {
        return Graduation_date;
    }

    public void setGraduation_date(String graduation_date) {
        Graduation_date = graduation_date;
    }

    public String getGraduation_rank() {
        return Graduation_rank;
    }

    public void setGraduation_rank(String graduation_rank) {
        Graduation_rank = graduation_rank;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        Education = education;
    }
    public Fresher(){};

    public Fresher(String ID, String FullName, String BirthDay, double Phone,
            String Email, List<Certificate> certificates, String Graduation_date
    , String Graduation_rank, String Education) {
        super(ID, FullName, BirthDay, Phone, Email,certificates);
        this.Graduation_date = Graduation_date;
        this.Graduation_rank = Graduation_rank;
        this.Education = Education;

    }
    @Override
    public void showInfo(){
        System.out.println(this);
    }
    public String toString() {
        return "Fresher{" + "id='" + ID + "," +
                ", fullName='" + FullName +
                ", birthday=" + BirthDay +
                ", phone='" + Phone +
                ", email='" + Email  +
                ",certificates" + certificates+
                ", Graduation_date " +Graduation_date +
                ", Graduation_rank " +Graduation_rank+
                ", Education " +Education + "}";
    }
}
