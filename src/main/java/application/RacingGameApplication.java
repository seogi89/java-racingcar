package application;

import application.view.InputView;
import application.view.OutputView;
import data.RacingGame;
import data.Records;

public class RacingGameApplication {

    public static void main(String[] args) {

        RacingGame game = new RacingGame(InputView.inputAllParticipants(), InputView.inputLaps());
        Records records = null;
        OutputView.printResult();
        while (!game.isEnd()) {
            records = game.move();
            OutputView.printRecords(records);
        }
        if (records == null) {
            throw new IllegalArgumentException("유효하지 않은 게임입니다.");
        }
        OutputView.printWinner(records.findWinners());
    }
}
