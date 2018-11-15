import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        List<String>names=getNamesCollection();
        List<String>rooms=getRooms();

        Scanner scanner = new Scanner(System.in);
        System.out.println("GIVE ME A NUMBER");
        Integer number1 =scanner.nextInt();
        System.out.println("GIVE ME A NUMBER");
        Integer number2 =scanner.nextInt();
        System.out.println("GIVE ME A NUMBER");
        Integer number3 =scanner.nextInt();
        Integer number = number1*number2*number3*199;
        Integer personNumber=number%3;

        String person1=names.get(personNumber);
        System.out.println(person1+"gets room "+ rooms.get(0));
        rooms.remove(0);

        personNumber =number%2;
        String person2 =names.get(personNumber);
        names.remove(personNumber);
        System.out.println(person2+"gets room "+ rooms.get(1));
        rooms.remove(0);







    }

    public static List<String> getRooms() {
        List<String>rooms=new ArrayList<>();
        rooms.add("Living room");
        rooms.add("studio");
        rooms.add("bathroom");
        return rooms;
    }

    public static List<String> getNamesCollection() {
        List<String>names=new ArrayList<>();
        names.add("Dereck");
        names.add("Hansel");
        names.add("Matilda");
        return names;
    }
}
