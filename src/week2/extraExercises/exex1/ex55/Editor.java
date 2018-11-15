package week2.extraExercises.exex1.ex55;

import week2.extraExercises.exex1.Article;

public class Editor {
    public Magazine writeMagazine() {
        Article article1 = new Article("titel1", "how are you doing");
        Article article2 = new Article("titel2", "how is it going");
        Article article3 = new Article("titel3", "very bad");
        Magazine magazine = new Magazine("titelmain");
        magazine.add(article1);
        magazine.add(article2);
        magazine.add(article3);
        return magazine;

    }


}
