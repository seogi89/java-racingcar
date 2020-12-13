package application;

import data.domain.RacingGame;
import ui.InputView;
import ui.OutputView;

public class RacingGameApplication {

    public static void main(String[] args) {

        int participants = InputView.getParticipants();
        int laps = InputView.getLaps();
        RacingGame game = new RacingGame(participants, laps);
        OutputView.printResultMessage();
        while (game.isNotEnd()) {
            OutputView.print(game.move());
        }

    }
}
