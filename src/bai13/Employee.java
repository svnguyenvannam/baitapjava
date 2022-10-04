package bai13;


import java.util.List;

public abstract class Employee {

    public static double count =0;
    protected String ID;
    protected String FullName;
    protected String BirthDay;
    protected double Phone;
    protected String Email;
    protected List<Certificate> certificates;

    public Employee(){};



    public Employee(String ID, String FullName, String BirthDay, double Phone,
                    String Email, List<Certificate> Certificates){
        this.ID = ID;
        this.FullName = FullName;
        this.BirthDay = BirthDay;
        this.Phone = Phone;
        this.Email = Email;
        this.certificates = Certificates;

    }
    public abstract void showInfo();

    public String getID() {
        return ID;
    }

    public void setID(String ID) throws Exception
    {

        if(ID.equals("")) throw new Exception("Không có nhân viên");
        this.ID = ID;
    }

    public String getFullName() {

        return FullName;
    }

    public void setFullName(String fullName) throws Exception {
        if (FullName.equals(""))
            throw new FullNameException("Tên không hợp lệ");
        this.FullName = fullName;
    }

    public String getBirthDay() {
        return BirthDay;
    }

    public void setBirthDay(String birthDay) throws Exception{

        if (birthDay == null) {
            throw new BirthDayException("Ngày sinh không hợp lệ");
        }

        BirthDay = birthDay;
    }

    public double getPhone() {
        return Phone;
    }

    public void setPhone(double phone) throws Exception {

        if (phone < 0) {
            throw new PhoneException("Số ddienj thoại không hợp lệ");
        }

        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public List<Certificate> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<Certificate> certificates) {
        this.certificates = certificates;
    }
}
