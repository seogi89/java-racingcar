package data.domain;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RacingGameTest {

    @Test
    @DisplayName("이동 횟수가 없다면, 자동차를 전진 할 수 없다.")
    void move() {
        int laps = 0;
        RacingGame game = new RacingGame(1, laps);
        assertThatIllegalArgumentException()
            .isThrownBy(game::move)
            .withMessage("이미 종료 된 레이스 입니다.");
    }

    @Test
    @DisplayName("이동 횟수가 없다면, 게임은 종료 된다.")
    void isEnd() {
        int laps = 0;
        RacingGame game = new RacingGame(1, laps);
        assertThat(game.isNotEnd()).isFalse();
    }

    @Test
    @DisplayName("자동차를 이동 시키면, 이동 횟수가 차감된다.")
    void move_and_end() {
        int laps = 1;
        RacingGame game = new RacingGame(1, laps);
        game.move();
        assertThat(game.isNotEnd()).isFalse();
    }

    @Test
    @DisplayName("자동 차를 이동 시키면, 현재 위치 배열을 응답한다.")
    void move_and_get() {
        RacingGame game = new RacingGame(2, 2);
        assertThat(game.move()).hasSize(2);
    }
}