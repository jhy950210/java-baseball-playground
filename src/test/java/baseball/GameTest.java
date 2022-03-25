package baseball;

import org.junit.jupiter.api.Test;

import java.util.List;

public class GameTest {
    @Test
    void 게임_1회_수행() {
        List<Integer> answers = RandomNumber.createAnswers();
        for (Integer answer : answers) {
            System.out.println("answer = " + answer);
        }
        Balls balls = new Balls(answers);
        String input = "123";

        Game game = new Game(balls, input);

        System.out.println("strikeCount = " + game.getStrike());
        System.out.println("ballCount = " + game.getBall());
    }
}
