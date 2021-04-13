package data;

import java.util.Random;

public class RandomPowerEngine implements Engine {

    private static final int MAX_POWER = 10;

    private final Random random = new Random();

    @Override
    public int get() {
        return random.nextInt(MAX_POWER);
    }
}
