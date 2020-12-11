package data.domain;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RacingGame {

    private static final int END_GAME_LAPS = 0;
    private static final int ENGINE_MAX_POWER = 10;
    private static final Random RANDOM = new Random();

    private List<Car> cars;
    private int laps;

    public RacingGame(int participants, int laps) {
        this.cars = ready(participants);
        this.laps = laps;
    }

    private List<Car> ready(int participants) {
        return Stream.generate(Car::new)
            .limit(participants)
            .collect(Collectors.toList());
    }

    public int[] move() {
        if (laps == END_GAME_LAPS) {
            throw new IllegalArgumentException("이미 종료 된 레이스 입니다.");
        }
        laps--;
        return cars.stream()
            .mapToInt(car -> car.move(RANDOM.nextInt(ENGINE_MAX_POWER)))
            .toArray();
    }

    public boolean isNotEnd() {
        return laps > END_GAME_LAPS;
    }
}
