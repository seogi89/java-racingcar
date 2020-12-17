package data.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RecordTest {

    @DisplayName("동일한 위치에 있는지 확인한다.")
    @Test
    void isSamePosition() {
        Record record1 = Record.of("jinny", 3);
        Record record2 = Record.of("seok", 3);
        assertThat(record1.isSamePosition(record2)).isTrue();
    }

}