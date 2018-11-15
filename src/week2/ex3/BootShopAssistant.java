package week2.ex3;

import java.util.ArrayList;
import java.util.List;

public class BootShopAssistant {

    public List<HikingBoot>getHikingBootRecommendations(){
        List<HikingBoot>hikingBoots=new ArrayList<>();
        HikingBoot hikingBoot=new HikingBoot(41);
        hikingBoots.add(hikingBoot);
        hikingBoots.add(hikingBoot=new HikingBoot(40));
        hikingBoots.add(hikingBoot=new HikingBoot(42));

        return hikingBoots;

    }
}
