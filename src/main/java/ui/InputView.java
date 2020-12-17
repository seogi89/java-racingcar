package ui;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public final class InputView {

    private static final String PARTICIPANTS_MSG = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    private static final String LAPS_MSG = "시도할 회수는 몇 회 인가요?";
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String CAR_NAME_DELIMITER = ",";

    private InputView() {
    }

    public static List<String> getParticipants() {
        System.out.println(PARTICIPANTS_MSG);
        return Arrays.asList(SCANNER.next().split(CAR_NAME_DELIMITER));
    }

    public static int getLaps() {
        System.out.println(LAPS_MSG);
        return SCANNER.nextInt();
    }
}
