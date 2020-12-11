package ui;

import java.util.Arrays;

public final class OutputView {

    private static final String POSITION_SYMBOL = "-";

    private OutputView() {
    }

    public static void printResultMessage() {
        System.out.println("실행 결과");
    }

    public static void print(int[] positions) {
        Arrays.stream(positions)
            .forEach(position -> System.out.println(POSITION_SYMBOL.repeat(position)));
        System.out.println();
    }
}
