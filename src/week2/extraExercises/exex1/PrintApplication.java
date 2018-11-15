package week2.extraExercises.exex1;

public class PrintApplication {
    public static void main(String[] args) {
        String titel = "new book";
        Article article = new Article(titel, "i am not here");
        Printer printer = new Printer();
        printer.print(article);
    }
}
