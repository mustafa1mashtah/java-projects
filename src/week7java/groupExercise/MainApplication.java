package week7java.groupExercise;

import week3java.ex9.FileReader;

import java.util.List;

public class MainApplication {
    public static void main(String[] args) {

        ReadDocument readDocument=new ReadDocument();
        TransferOneNameIntoNumber converter = new TransferOneNameIntoNumber();
        Vortex vortex = new Vortex();

        List<String> names = readDocument.getNames();
        for (String name : names) {
            Integer numberOfName = converter.getNameNumber(name);
            Integer vortexNumber = vortex.getVortexNumber(numberOfName);
            while (vortexNumber > 9) {
                vortexNumber = vortex.getVortexNumber(vortexNumber);
            }

            System.out.println(name + " Vortex number: " + vortexNumber);

        }





        }
    }

