package week2.extraExercises.exex1.ex66;

import week2.extraExercises.exex1.ex33.Tool;

import java.util.ArrayList;
import java.util.List;

public class Toolbox {
    private String color;
    private List<Tool>toolList=new ArrayList<>();

    public Toolbox(String color) {
        this.color = color;
    }

    public List<Tool> getToolList() {
        return toolList;
    }



    public void add(Tool tool){
        toolList.add(tool);

    }
}
//A Toolbox has a color and a list of Tool. Its constructor only asks for the color.
// Make sure its tools are initialized with an empty collection.
// It also has the method add to add a Tool to its list and the method getTools that returns the list.