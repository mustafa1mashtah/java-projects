package reflectionWeek9;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StudentSummarizer {
    private StudentReader studentReader = new StudentReader();


    public Integer getBoysNumber() {
        return studentReader.getStudents().stream()
                .filter(e -> e.gender.equals("male")).collect(Collectors.toList()).size();
    }

    public Integer getGirlsNumber() {
        return studentReader.getStudents().stream()
                .filter(e -> e.gender.equals("female")).collect(Collectors.toList()).size();
    }

    public Integer getTotalNumberOfStudents() {
        return studentReader.getStudents()
                .stream()
                .collect(Collectors.toList()).size();
    }

    public List<String> getDistinctOfEducation() {
        return studentReader.getStudents().stream()
                .map(e -> e.getEducation())
                .distinct()
                .sorted()
                .collect(Collectors.toList());


    }

    public Integer getScoredMoreThan90() {
        return studentReader.getStudents().stream()
                .filter(e -> e.math > 90)
                .filter(e -> e.reading > 90)
                .filter(e -> e.writing > 90)
                .collect(Collectors.toList()).size();
    }

    public Integer getScored100() {
        return studentReader.getStudents().stream()
                .filter(e -> e.math == 100)
                .filter(e -> e.reading == 100)
                .filter(e -> e.writing == 100)
                .collect(Collectors.toList()).size();
    }

    public List<String> getGenderOfStudentsScored100() {
        return studentReader.getStudents().stream()
                .filter(e -> e.math == 100)
                .filter(e -> e.reading == 100)
                .filter(e -> e.writing == 100)
                .map(e -> e.getGender()).collect(Collectors.toList());

    }


}
