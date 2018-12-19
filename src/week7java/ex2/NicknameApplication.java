package week7java.ex2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class NicknameApplication {
    public static void main(String[] args) {
        NicknamesGenerator nicknamesGenerator = new NicknamesGenerator();
        List<String> names = Arrays.asList("House", "tree", "Theatre", "somewhere", "bottle");
        for (String name : names) {
            Optional<String> nickname = nicknamesGenerator.getNickname(name);
            if (nickname.isPresent()) {
                System.out.println("the nickname of " + name + " is " + nickname.get());
            }

        }

    }
}
