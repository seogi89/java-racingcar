package data;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

public class NameTest {

    @DisplayName("이름은 5자를 초과할 수 없습니다.")
    @Test
    public void create() {
        assertThatIllegalArgumentException().isThrownBy(() -> new Name("pattern"))
                .withMessage("참가자의 이름은 5글자를 초과할 수 없습니다.");
    }
}