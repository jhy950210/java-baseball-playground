package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class BallTest {

    @Test
    void strike_판정(){
        Ball com = new Ball(1,2);
        assertThat(com.compare(new Ball(1,2))).isEqualTo(BallType.STRIKE);
    }

    @Test
    void ball_판정(){
        Ball com = new Ball(1,2);
        assertThat(com.compare(new Ball(2,2))).isEqualTo(BallType.BALL);
    }

    @Test
    void nothing_판정(){
        Ball com = new Ball(1,2);
        assertThat(com.compare(new Ball(2,5))).isEqualTo(BallType.NOTHING);
    }
}
