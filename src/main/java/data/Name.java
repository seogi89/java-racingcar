package data;

public class Name {

    private static final int MAX_NAME_LENGTH = 5;

    private final String name;

    public Name(String name) {
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException("참가자의 이름은 5글자를 초과할 수 없습니다.");
        }
        this.name = name;
    }
}
