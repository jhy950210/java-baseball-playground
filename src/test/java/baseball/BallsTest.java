package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

public class BallsTest {
    @Test
    void ball() {
        Balls answers = new Balls(Arrays.asList(1,2,3));
        BallType type = answers.compare(new Ball(1,2));
        assertThat(type).isEqualTo(BallType.BALL);
    }

    @Test
    void nothing() {
        Balls answers = new Balls(Arrays.asList(1,2,3));
        BallType type = answers.compare(new Ball(1,4));
        assertThat(type).isEqualTo(BallType.NOTHING);
    }
}
