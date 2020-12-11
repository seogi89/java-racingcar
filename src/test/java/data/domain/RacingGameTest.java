package data.domain;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RacingGameTest {

    @Test
    @DisplayName("이동 횟수가 없다면, 자동차를 전진 할 수 없다.")
    void move() {
        int labs = 0;
        RacingGame game = new RacingGame(1, labs);
        assertThatIllegalArgumentException()
            .isThrownBy(game::move)
            .withMessage("이미 종료 된 레이스 입니다.");
    }
}