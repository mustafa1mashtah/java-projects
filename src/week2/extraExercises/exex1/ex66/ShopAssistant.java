package week2.extraExercises.exex1.ex66;

import week2.extraExercises.exex1.ex33.Tool;

import java.util.List;

public class ShopAssistant {




    public Toolbox findToolbox(List<Tool>toolsName){
        Tool tool=new Tool("toolName");
        Toolbox toolbox=new Toolbox("color");
        toolbox.add(tool);
        return toolbox;

    }
}
//A ShopAssistant has no attributes. It has the findToolbox method that receives
// a list of String representing the names of the tools the customer asks for and returns a Toolbox.
// In order to create a Toolbox it creates one article per tool requested adding them to the Toolbox then it returns it.