package data.domain;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RacingGame {

    private List<Car> cars;
    private int labs;

    public RacingGame(int participants, int labs) {
        this.cars = ready(participants);
        this.labs = labs;
    }

    private List<Car> ready(int participants) {
        return Stream.generate(Car::new)
            .limit(participants)
            .collect(Collectors.toList());
    }

    public void move() {
        if(labs == 0) {
            throw new IllegalArgumentException("이미 종료 된 레이스 입니다.");
        }
        labs--;
    }
}
