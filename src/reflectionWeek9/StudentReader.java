package reflectionWeek9;

import week3java.ex9.FileReader;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentReader {
    public List<Student> getStudents() {
        return new FileReader().asStream("reflectionWeek9/students-performance.csv")
                .skip(1)
                .map(e -> Arrays.asList(e.split(";")))
                .map(e -> new Student(e.get(0), e.get(1), Integer.valueOf(e.get(2))
                        , Integer.valueOf(e.get(3)), Integer.valueOf(e.get(4))))
                .collect(Collectors.toList());

    }
}
