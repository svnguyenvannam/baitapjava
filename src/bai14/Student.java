package bai14;

import bai13.FullNameException;

import java.util.GregorianCalendar;
import java.util.regex.Pattern;

public  class Student {

    String s[]= {"090","098","091","031","035","038"};

    Pattern patternDate = Pattern.compile("\\d{2}[-|/]\\d{2}[-|/]\\d{4}");
    protected String fullname;
    protected String doB;
    protected String gender;
    protected String phoneNumber;
    protected String university_Name;
    protected String gradeLevel;

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) throws Exception{

        if(fullname.length() >  50|fullname.length()< 10)
            throw new FullNameException(" Họ và tên sinh viên không hợp lệ");


        this.fullname = fullname;
    }

    public String getDoB() {
        return doB;
    }

    public void setDoB(String doB) throws Exception {
        if(doB.equals(patternDate))
            throw new InvalidDOBException ("Ngày tháng năm sinh không hợp lệ");

        this.doB = doB;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)throws Exception {

      /* *//* if(phoneNumber.length()!=10|phoneNumber){

        }else
            throw new InvalidPhoneNumberException(" Số điện thoạt*//* không hợp lệ");
*/


    }

    public String getUniversity_Name() {
        return university_Name;
    }

    public void setUniversity_Name(String university_Name) {
        this.university_Name = university_Name;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }


    Student(String fullname, String doB, String gender, String phoneNumber,
             String university_Name, String gradeLevel){
        this.fullname = fullname;
        this.doB = doB;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.university_Name = university_Name;
        this.gradeLevel = gradeLevel;


    }

}
