package week2.extraExercises.exex1.ex55;

import week2.extraExercises.exex1.Printer;

public class MagazineApplication {
    public static void main(String[] args) {
        Editor editor=new Editor();
        Magazine magazine=editor.writeMagazine();
        Printer printer=new Printer();
        printer.printMagazine(magazine);


    }
}
