package week2.extraExercises.exex1;

public class Article {
    private String titel;
    private String text;

    public Article(String titel, String text) {
        this.titel = titel;
        this.text = text;
    }

    public String getTitel() {
        return titel;
    }

    public String getText() {
        return text;
    }
}
