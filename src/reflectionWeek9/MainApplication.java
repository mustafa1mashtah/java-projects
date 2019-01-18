package reflectionWeek9;

public class MainApplication {
    public static void main(String[] args) {
        StudentSummarizer studentSummarizer = new StudentSummarizer();
        System.out.println("Number of male students:");
        System.out.println(studentSummarizer.getBoysNumber());

        System.out.println("Number of female students:");
        System.out.println(studentSummarizer.getGirlsNumber());

        System.out.println("Total number of student performance entries:");
        System.out.println(studentSummarizer.getTotalNumberOfStudents());

        System.out.println("Parental education levels sorted alphabetically:");
        System.out.println(studentSummarizer.getDistinctOfEducation());

        System.out.println("Number of students with scores higher than 90:");
        Integer numberPassedMath = studentSummarizer.getScoredMoreThan90();
        System.out.println(numberPassedMath);

        System.out.println("Number of students with scores equal to 100:");
        System.out.println(studentSummarizer.getScored100());

        System.out.println("Genders of these students are:");
        System.out.println(studentSummarizer.getGenderOfStudentsScored100());

    }
}
