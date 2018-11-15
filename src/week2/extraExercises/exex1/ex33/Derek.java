package week2.extraExercises.exex1.ex33;

public class Derek {
    public Tool tool=new Tool(" ");

    public void setTool(Tool tool) {
        this.tool = tool;
    }

    public Boolean canHangPainting() {


        return tool.getName().equals("hammer");


    }

    public void hangPainting() {
        if (canHangPainting()){
            System.out.println("Derek can hang the painting");
        }else
        System.out.println("Derek is missing the hammer");



    }


}
