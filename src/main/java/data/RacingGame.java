package data;

import java.util.List;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toList;

public class RacingGame {

    private static final int END_GAME_LAPS = 0;

    private final Cars cars;
    private int laps;

    public RacingGame(List<String> participants, int laps) {
        this.cars = participants.stream()
                .map(Car::new)
                .collect(collectingAndThen(toList(), Cars::new));
        this.laps = laps;
    }

    public Records move() {
        if (isEnd()) {
            throw new IllegalArgumentException("이미 게임이 종료 되었습니다.");
        }
        laps--;
        return cars.move();
    }

    public boolean isEnd() {
        return laps <= END_GAME_LAPS;
    }

}
