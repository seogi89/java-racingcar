package data.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RecordsTest {

    @DisplayName("우승자를 찾는다.")
    @Test
    void findAllWinner() {
        Record record1 = Record.of("seok", 3);
        Record record2 = Record.of("nari", 3);
        Record record3 = Record.of("jin", 1);

        Records records = new Records(List.of(record1, record2, record3));
        assertThat(records.findAllWinners()).contains(record1, record2);
    }

}