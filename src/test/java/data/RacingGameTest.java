package data;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

class RacingGameTest {

    @DisplayName("게임이 모두 종료 되면 더이상 이동 할 수 없습니다.")
    @Test
    void move() {
        RacingGame game = new RacingGame(List.of("soek2", "pobi"), 1);
        game.move();
        assertThatIllegalArgumentException().isThrownBy(() -> game.move())
                .withMessage("이미 게임이 종료 되었습니다.");
    }

    @DisplayName("게임을 이동시키면 이동횟수가 1회 차감됩니다.")
    @Test
    void isEnd() {
        RacingGame game = new RacingGame(List.of("soek2", "pobi"), 1);
        assertThat(game.isEnd()).isFalse();
        game.move();
        assertThat(game.isEnd()).isTrue();
    }
}