package racinggame.controller;

import java.util.Random;
import java.util.Scanner;
import racinggame.domain.Cars;
import racinggame.domain.MovingValidator;
import racinggame.domain.RacingGame;
import racinggame.domain.strategy.RandomNumberMovingStrategy;
import racinggame.view.InputView;
import racinggame.view.ResultView;

public class RacingGameController {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] carNames = InputView.carNames(scanner);
        int number = InputView.playCount(scanner);

        RacingGame racingGame = new RacingGame(Cars.from(carNames, new MovingValidator(new RandomNumberMovingStrategy(new Random()))));

        ResultView.br();
        ResultView.resultSign();
        for (int i = 0; i < number; i++) {
            racingGame.play();
            ResultView.report(racingGame.cars());
            ResultView.winners(racingGame.winners());
        }
    }

}
