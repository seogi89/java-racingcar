package data;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @DisplayName("자동차는 4보다 큰 값을 가질 때 1칸 전진합니다.")
    @Test
    public void move() {
        Car car = new Car(new Name("seok2"), () -> 5);
        assertThat(car.move()).isEqualTo(1);
    }

    @DisplayName("자동차는 4보다 작은 값을 가질 때 전진 할 수 없습니다.")
    @Test
    public void hold() {
        Car car = new Car(new Name("seok2"), () -> 3);
        assertThat(car.move()).isEqualTo(0);
    }

    @DisplayName("자동차는 이동 테스트 - 4, 3, 2, 5 일때")
    @Test
    public void move_2() {
        Car car = new Car(new Name("seok2"), new RepeatPowerEngine(List.of(4, 3, 2, 5)));
        assertThat(car.move()).isEqualTo(1);
        assertThat(car.move()).isEqualTo(1);
        assertThat(car.move()).isEqualTo(1);
        assertThat(car.move()).isEqualTo(2);
    }
}
