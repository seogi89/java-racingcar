package data.domain;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarTest {


    @Test
    @DisplayName("자동차 이동 테스트 - " + RacingGameConstants.THRESHOLD + " 보다 크면 전진한다.")
    void move() {
        Car car = Car.of("seok");
        assertThat(car.move(5)).isEqualTo(1);
    }

    @Test
    @DisplayName("자동차 이동 테스트 -" + RacingGameConstants.THRESHOLD + " 보다 작으면 멈춘다.")
    void hold() {
        Car car = Car.of("seok");
        assertThat(car.move(3)).isEqualTo(0);
    }

}