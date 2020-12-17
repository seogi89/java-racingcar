package ui;

import data.domain.Record;
import java.util.List;

public final class OutputView {

    private static final String POSITION_SYMBOL = "-";

    private OutputView() {
    }

    public static void printResultMessage() {
        System.out.println("실행 결과");
    }

    public static void print(List<Record> positions) {

        positions.stream()
            .forEach(
                record -> System.out.println(record.getName() + ":" + POSITION_SYMBOL.repeat(record.getPosition())));
        System.out.println();
    }
}
