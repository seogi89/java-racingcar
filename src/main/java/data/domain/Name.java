package data.domain;

import static data.domain.RacingGameConstants.NAME_MAX_LENGTH;

public class Name {

    private String name;

    private Name(String name) {
        if (name.length() > NAME_MAX_LENGTH) {
            throw new IllegalArgumentException("자동차 이름은 " + NAME_MAX_LENGTH + "자를 초과할 수 없습니다.");
        }
        this.name = name;
    }

    public static Name of(String name) {
        return new Name(name);
    }
}
