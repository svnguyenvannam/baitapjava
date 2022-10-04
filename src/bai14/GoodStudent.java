package bai14;

import java.util.GregorianCalendar;

public class GoodStudent extends Student {
    private float gpa;
    private String bestRewardName;

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getBestRewardName() {
        return bestRewardName;
    }

    public void setBestRewardName(String bestRewardName) {
        this.bestRewardName = bestRewardName;
    }

    public GoodStudent(String fullname, GregorianCalendar doB, String gender, String phoneNumber,
                String university_Name, String gradeLevel, float gpa, String bestRewardName){

        super(fullname, doB, gender, phoneNumber,university_Name, gradeLevel);
        this.gpa = gpa;
        this.bestRewardName = bestRewardName;

    }
    public void showMyInfo(){

    }
}
