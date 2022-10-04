package bai14;

import java.util.GregorianCalendar;

public class NormalStudent extends Student{

    private int englishScore;
    private float entryTestScore;

    public int getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }

    public float getEntryTestScore() {
        return entryTestScore;
    }

    public void setEntryTestScore(float entryTestScore) {
        this.entryTestScore = entryTestScore;
    }

    public NormalStudent(String fullname, GregorianCalendar doB, String gender, String phoneNumber,
                  String university_Name, String gradeLevel, int englishScore, float entryTestScore) {
                      super(fullname, doB, gender, phoneNumber,university_Name,gradeLevel);
                      this.englishScore = englishScore;
                      this.englishScore = englishScore;
                  }
    public void showMyInfo(){

    }
}
