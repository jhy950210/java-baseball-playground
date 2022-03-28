package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class GameTest {
    @Test
    void 게임_1회_수행() {

        //List<Integer> answers = RandomNumber.createAnswers();
        List<Integer> answers = Arrays.asList(1, 2, 3);

        for (Integer answer : answers) {
            System.out.println("answer = " + answer);
        }
        Balls balls = new Balls(answers);
        String input = "123";

        Game game = new Game(balls, input);

        assertThat(game.getStrike()).isEqualTo(3);
    }
}
