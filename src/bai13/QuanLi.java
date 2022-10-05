package bai13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import bai13.*;

public class QuanLi {

    public static Scanner scanner = new Scanner(System.in);

    List<Employee> quanli;

    public QuanLi() {
        this.quanli = new ArrayList<>();
    }
    public void add(Employee employee) {
        this.quanli.add(employee);

    }
    /*public void edit(String id){

        Employee employee = this.quanli.stream()
                .filter(Employee->Employee.getID().equals(id))
                .findFirst().orElse(null);
        if (employee == null) {
            System.out.println("Nhân viên không tồn tại");

        }
        else {
                employee.setFullName(inputFullName());
                employee.setBirthDay(inputBirthDay());
                employee.setPhone(inputPhone());
                employee.setEmail(inputEmail());
                employee.setEmployee_type(inputEmployee_type());
            }

        }
    private String inputFullName() {

        System.out.print("Nhập tên mới nhân viên : ");
        return scanner.nextLine() ;
    }
    private String inputBirthDay() {

        System.out.print("Nhập ngày sinh mới : ");
        return scanner.nextLine() ;
    }
    private String inputPhone() {

        System.out.print("Nhập số điện thoại mới : ");
        return scanner.nextLine() ;
    }
    private String inputEmail() {

        System.out.print("Nhập Email mới : ");
        return scanner.nextLine() ;
    }
    private String inputEmployee_type() {

        System.out.print("Nhập loại nhân viên mới : ");
        return scanner.nextLine() ;
    }*/



    public boolean delete(String id) {

        Employee employee = this.quanli.stream()
                .filter(Employee -> Employee.getID().equals(id))
                .findFirst().orElse(null);

        if (employee == null) {
            System.out.println("Không tồn tại");

        }
        this.quanli.remove(employee);
        return true;
    }
    public List<Employee> findbybyEmployee_Type(int Employee_Type){

        return this.quanli.stream()
                .filter(employee -> {
                    if (Employee_Type == 0) {
                        return employee instanceof Experience;
                    }
                    if (Employee_Type == 1) {
                        return employee instanceof Fresher;
                    }
                    if (Employee_Type == 2) {
                        return employee instanceof Intern;
                    }

                    return false;
                }
                )
                .collect(Collectors.toList());
    }
    public List<Employee> findAll() {
        return this.quanli;
    }
    public Employee fimdByID(String id){
       return this.quanli.stream()
                .filter(Employee->Employee.getID().equals(id))
                .findFirst().orElse(null);

    }

}
