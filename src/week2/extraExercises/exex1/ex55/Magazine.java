package week2.extraExercises.exex1.ex55;

import week2.extraExercises.exex1.Article;

import java.util.ArrayList;
import java.util.List;

public class Magazine {
    private String titel;
    private List<Article>articles=new ArrayList<>();

    public Magazine(String titel) {
        this.titel = titel;
    }

    public String getTitel() {
        return titel;
    }


    public void add(Article article){
        articles.add(article);

    }
    public List<Article> getArticles() {
        return articles;
    }






    }

