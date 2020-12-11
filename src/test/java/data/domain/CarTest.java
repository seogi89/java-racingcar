package data.domain;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarTest {


    @Test
    @DisplayName("자동차 이동 테스트 - 4 보다 크면 전진한다.")
    void move() {
        Car car = new Car();
        assertThat(car.move(5)).isEqualTo(1);
    }

}