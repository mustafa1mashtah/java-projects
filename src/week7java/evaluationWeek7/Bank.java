package week7java.evaluationWeek7;

import week3java.ex9.FileReader;

import java.util.List;

public class Bank {
    ReadDocument readDocument = new ReadDocument();
    FileReader fileReader = new FileReader();
    List<Employees> employees = readDocument.readEmployees(fileReader);


    public void transferSalary() {

        for (Employees employee : employees) {
            System.out.println("Transfer successful: " + employee.getSalary() + "€" + " to account " + employee.getAccount());

        }


    }

    public void getTotalAmount() {
        Integer totalAmount = 0;
        for (Employees employee : employees) {
            String salaryASString = employee.getSalary();
            Integer salary = Integer.valueOf(salaryASString);
            totalAmount += salary;


        }
        System.out.println("Total amount paid: " + totalAmount);


    }

    public void TheEmployeeWithTheHighestSalary() {


        Integer highestSalary = 0;
        String highestSalaryEmployee = "";
        String department = "";

        for (Employees employee : employees) {
            Integer salary = Integer.valueOf(employee.getSalary());
            if (highestSalary < salary) {
                highestSalary = salary;
                highestSalaryEmployee = employee.getName();
                department = employee.getDepartment();


            }


        }
        System.out.println("Highest salary employee: " + highestSalaryEmployee + " from " + department + " with " + highestSalary);


    }
}
