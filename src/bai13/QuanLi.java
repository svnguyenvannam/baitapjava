package bai13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QuanLi {

    public static Scanner scanner = new Scanner(System.in);

    List<Employee> quanli;

    public QuanLi() {
        this.quanli = new ArrayList<>();
    }
    public void add(Employee employee) {
        this.quanli.add(employee);

    }

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
                })
                .collect(Collectors.toList());


    }
    public List<Employee> findAll() {
        return this.quanli;
    }


}
