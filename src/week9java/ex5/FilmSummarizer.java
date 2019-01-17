package week9java.ex5;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilmSummarizer {
    private FilmReader filmReader = new FilmReader();


    public List<Film> getTopThreeRating() {
        return filmReader.getFilms().stream()
                .sorted(Comparator.comparing(Film::getScore).reversed())
                .limit(3)
                .collect(Collectors.toList());


    }

    public List<Film> getTopThreeRatingLessThanThreeHours() {
        return filmReader.getFilms().stream()
                .sorted(Comparator.comparing(Film::getScore).reversed())
                .filter(e -> e.getRunTime() >= 180)
                .limit(3)
                .collect(Collectors.toList());

    }

    public List<Film> getFourMostExpensive() {
        return filmReader.getFilms().stream()
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .limit(4)
                .collect(Collectors.toList());


    }

    public List<Film> getFourMostExpensiveShorterThanOneAndHalfHours() {
        return filmReader.getFilms().stream()
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .filter(e -> e.getRunTime() <= 90)
                .limit(4)
                .collect(Collectors.toList());


    }

    public List<Film> getFourWithMoreThanSevenRatingAndSpecificBudget() {
        return filmReader.getFilms().stream()
                .filter(e -> e.getScore() > 7.0)
                .filter(e -> e.getBudget() > 50000)
                .filter(e -> e.getBudget() < 500000)
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .limit(4)
                .collect(Collectors.toList());


    }

}
