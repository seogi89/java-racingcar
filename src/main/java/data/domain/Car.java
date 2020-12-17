package data.domain;

import static data.domain.RacingGameConstants.THRESHOLD;

public class Car {

    private Name name;
    private int position;

    private Car(final Name name) {
        this.name = name;
    }

    public static Car of(String name) {
        return new Car(Name.of(name));
    }

    public int move(int power) {
        if (power >= THRESHOLD) {
            position++;
        }
        return position;
    }


}
