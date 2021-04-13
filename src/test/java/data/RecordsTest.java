package data;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RecordsTest {

    @Test
    void findWinners() {
        Records records = new Records(List.of(new Record("pobi", 5),
                new Record("seok2", 5),
                new Record("jason", 2)
        ));

        assertThat(records.findWinners()).containsOnly("pobi", "seok2");
    }
}