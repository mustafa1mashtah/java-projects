package week8java;
import java.util.List;


public class MainApplication {
    public static void main(String[] args) {
        Sensor sensor = new Sensor();
        Archive archive = new Archive();

        List<String> tricksList = sensor.getTricksList();
        archive.getTricksInfo(tricksList);


    }


}
