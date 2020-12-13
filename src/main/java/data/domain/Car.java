package data.domain;

import static data.domain.RacingGameConstants.THRESHOLD;

public class Car {


    private int position;

    public int move(int power) {
        if (power >= THRESHOLD) {
            position++;
        }
        return position;
    }


}
