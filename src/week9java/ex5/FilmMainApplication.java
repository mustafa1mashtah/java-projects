package week9java.ex5;

import java.util.List;

public class FilmMainApplication {
    public static void main(String[] args) {
        FilmSummarizer filmSummarizer=new FilmSummarizer();
        List<Film> topThreeRating = filmSummarizer.getTopThreeRating();
        System.out.println("Top 3 with highest rating, sorted by rating:");
        System.out.println(topThreeRating);
        System.out.println(filmSummarizer.getTopThreeRatingLessThanThreeHours());
        System.out.println(filmSummarizer.getFourMostExpensive());
        System.out.println(filmSummarizer.getFourMostExpensiveShorterThanOneAndHalfHours());
        System.out.println(filmSummarizer.getFourWithMoreThanSevenRatingAndSpecificBudget());
    }
}
