package ui;

import java.util.Scanner;

public final class InputView {

    private static final String PARTICIPANTS_MSG = "자동차 대수는 몇 대 인가요?";
    private static final String LAPS_MSG = "시도할 회수는 몇 회 인가요?";
    private static final Scanner SCANNER = new Scanner(System.in);

    private InputView() {
    }

    public static int getParticipants() {
        System.out.println(PARTICIPANTS_MSG);
        return SCANNER.nextInt();
    }

    public static int getLaps() {
        System.out.println(LAPS_MSG);
        return SCANNER.nextInt();
    }
}
