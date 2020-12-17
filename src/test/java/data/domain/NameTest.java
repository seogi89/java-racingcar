package data.domain;

import static data.domain.RacingGameConstants.NAME_MAX_LENGTH;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NameTest {

    @Test
    @DisplayName("자동차의 이름은" + NAME_MAX_LENGTH + "를 초과 할 수 없다.")
    void of() {
        assertThatIllegalArgumentException()
            .isThrownBy(() -> Name.of("abcdefg"))
            .withMessage("자동차 이름은 " + NAME_MAX_LENGTH + "자를 초과할 수 없습니다.");
    }

}