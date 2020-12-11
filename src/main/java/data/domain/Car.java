package data.domain;

public class Car {

    private static final int THRESHOLD = 4;

    private int position;

    public int move(int power) {
        if (power >= THRESHOLD) {
            position++;
        }
        return position;
    }


}
