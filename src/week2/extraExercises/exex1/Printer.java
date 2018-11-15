package week2.extraExercises.exex1;

import week2.extraExercises.exex1.ex55.Editor;
import week2.extraExercises.exex1.ex55.Magazine;

import java.util.List;

public class Printer {


    public void print(Article article){
        System.out.println("the titel is: "+article.getTitel() +"\n the text is: "+article.getText());


    }
    public void printMagazine(Magazine magazine){

        System.out.println(magazine.getTitel() );
        List<Article>magazineArticles= magazine.getArticles();
        for (Article article:magazineArticles
             ) {
            System.out.println(article.getTitel());
            System.out.println(article.getText());

        }


        }




    }







