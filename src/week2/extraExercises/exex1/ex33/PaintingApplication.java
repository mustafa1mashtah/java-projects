package week2.extraExercises.exex1.ex33;

public class PaintingApplication {
    public static void main(String[] args) {

        Derek derek = new Derek();
        derek.hangPainting();
        Tool tool = new Tool("hammer");
        derek.setTool(tool);
        derek.hangPainting();


    }


}
