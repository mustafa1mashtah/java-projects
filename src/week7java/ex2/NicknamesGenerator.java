package week7java.ex2;


import java.util.Optional;

public class NicknamesGenerator {
    public Optional<String> getNickname(String name) {
        if (name.length() == 0) {
            return Optional.empty();
        }
        if (name.length() == 1) {
            return Optional.of(name);
        }

        Integer nicknameLength = name.length() / 2;
        String nickname = name.substring(0, nicknameLength);

        return Optional.of(nickname);

    }
}
