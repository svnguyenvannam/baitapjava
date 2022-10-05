package bai13;


import java.util.List;

public abstract class Employee {

    public static double count =0;
    protected String ID;
    protected String FullName;
    protected String BirthDay;
    protected String Phone;
    protected String Email;
    protected List<Certificate> certificates;

    protected int Employee_type;

    public Employee(){};


    public int getEmployee_type() {
        return Employee_type;
    }

    public void setEmployee_type(int employee_type) {
        Employee_type = employee_type;
    }

    public Employee(String ID, String FullName, String BirthDay, String Phone,
                    String Email, List<Certificate> Certificates, int Employee_type){
        this.ID = ID;
        this.FullName = FullName;
        this.BirthDay = BirthDay;
        this.Phone = Phone;
        this.Email = Email;
        this.certificates = Certificates;
        this.Employee_type =Employee_type;

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

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) throws Exception {

        if (Phone == null) {
            throw new PhoneException("Số điện thoại không hợp lệ");
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
