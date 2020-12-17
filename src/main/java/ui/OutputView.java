package ui;

import data.domain.Record;
import data.domain.Records;
import java.util.List;
import java.util.stream.Collectors;

public final class OutputView {

    private static final String POSITION_SYMBOL = "-";

    private OutputView() {
    }

    public static void printResultMessage() {
        System.out.println("실행 결과");
    }

    public static void print(Records records) {

        records.stream()
            .forEach(
                record -> System.out.println(record.getName() + ":" + POSITION_SYMBOL.repeat(record.getPosition())));
        System.out.println();
    }

    public static void printWinner(List<Record> winners) {
        String names = winners.stream()
            .map(Record::getName)
            .collect(Collectors.joining(","));
        System.out.println(names + "가 최종 우승했습니다.");

    }
}
