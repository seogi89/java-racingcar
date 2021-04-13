package application.view;

import data.Records;

import java.util.List;

public final class OutputView {

    private OutputView() {
    }

    public static void printRecords(Records records) {
        records.stream()
                .forEach(it -> {
                    System.out.println(it.getName() + " :" + "-".repeat(it.getPosition()));
                });
        System.out.println();
    }

    public static void printWinner(List<String> winners) {
        System.out.println(String.join(",", winners) + "가 최종 우승했습니다.");
    }

    public static void printResult() {
        System.out.println("게임 결과");
    }
}
