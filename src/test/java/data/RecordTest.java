package data;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RecordTest {

    @DisplayName("같은 기록을 가지는지 확인 할 수 있습니다.")
    @Test
    void same() {
        Record record = new Record("seok2", 5);
        Record other = new Record("pobi", 5);
        assertThat(record.same(other)).isTrue();
    }
}