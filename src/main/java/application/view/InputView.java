package application.view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public final class InputView {

    private static final Scanner SCANNER = new Scanner(System.in);

    private InputView() {
    }

    public static List<String> inputAllParticipants() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        return Arrays.stream(SCANNER.nextLine().split(","))
                .collect(Collectors.toList());
    }

    public static int inputLaps() {
        System.out.println("시도할 회수는 몇회인가요?");
        return SCANNER.nextInt();
    }
}
