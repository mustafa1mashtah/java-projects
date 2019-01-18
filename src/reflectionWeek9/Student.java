package reflectionWeek9;

public class Student {
    String gender;
    String education;
    Integer math;
    Integer reading;
    Integer writing;

    public Student(String gender, String education, Integer math, Integer reading, Integer writing) {
        this.gender = gender;
        this.education = education;
        this.math = math;
        this.reading = reading;
        this.writing = writing;
    }

    public String getGender() {
        return gender;
    }

    public String getEducation() {
        return education;
    }

    public Integer getMath() {
        return math;
    }

    public Integer getReading() {
        return reading;
    }

    public Integer getWriting() {
        return writing;
    }

    @Override
    public String toString() {
        return "Student{" +
                "gender='" + gender + '\'' +
                ", education='" + education + '\'' +
                ", math=" + math +
                ", reading=" + reading +
                ", writing=" + writing +
                '}';
    }
}
//gender;parental level of education;math score;reading score;writing score