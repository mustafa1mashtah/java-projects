package week7java.evaluationWeek7;

public class Employees {
    private String name;
    private String department;
    private String salary;
    private String account;

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getSalary() {
        return salary;
    }

    public String getAccount() {
        return account;
    }

    public Employees(String name, String department, String salary, String account) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.account = account;
    }
}
