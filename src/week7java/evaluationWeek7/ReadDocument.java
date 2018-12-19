package week7java.evaluationWeek7;

import week3java.ex9.FileReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadDocument {



    public List<Employees> readEmployees(FileReader reader) {
        List<String> lines = reader.getLines("week7java/evaluationWeek7/employees.csv");
        List<Employees> employees = toEmployees(lines);
        return employees;


    }

    private List<Employees> toEmployees(List<String> lines) {
        List<Employees> employees = new ArrayList<>();
        for (String line : lines) {
            employees.add(toEmployee(line));

        }
        return employees;
    }

    private Employees toEmployee(String line) {
        String[] split = line.split(";");
        List<String> columns = Arrays.asList(split);
        String name = columns.get(0);
        String department = columns.get(1);
        String salary = columns.get(2);
        String account = columns.get(3);

        return new Employees(name, department, salary, account);
    }


}
