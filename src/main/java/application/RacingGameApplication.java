package application;

import data.domain.RacingGame;
import data.domain.Records;
import java.util.List;
import ui.InputView;
import ui.OutputView;

public class RacingGameApplication {

    public static void main(String[] args) {

        List<String> participants = InputView.getParticipants();
        int laps = InputView.getLaps();
        RacingGame game = new RacingGame(participants, laps);
        OutputView.printResultMessage();
        Records records = null;
        while (game.isNotEnd()) {
            records = game.move();
            OutputView.print(records);
        }
        OutputView.printWinner(records.findAllWinners());

    }
}
