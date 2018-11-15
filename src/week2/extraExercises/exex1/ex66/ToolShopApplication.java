package week2.extraExercises.exex1.ex66;

import week2.extraExercises.exex1.ex33.Tool;

import java.util.List;

public class ToolShopApplication {
    public static void main(String[] args) {
        Tool tool1 = new Tool("kaka");
        Tool tool2 = new Tool("nana");
        Tool tool3 = new Tool("jaja");
        Toolbox toolbox = new Toolbox("red");
        List<Tool> toolList = toolbox.getToolList();
        toolList.add(tool1);
        toolList.add(tool2);
        toolList.add(tool3);
        ShopAssistant shopAssistant = new ShopAssistant();
        shopAssistant.findToolbox(toolList);


    }


}
//In the ToolShopApplication class main method, create a list of String with three tool names inside,
// create a ShopAssistant and use it to find a red Toolbox with those three tools inside.