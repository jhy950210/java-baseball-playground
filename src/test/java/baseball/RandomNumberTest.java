package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.*;

import static org.assertj.core.api.Assertions.*;

public class RandomNumberTest {
    private List<Integer> balls;

    @BeforeEach
    void setUp() {
        balls = RandomNumber.createAnswers();
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2})
    void random_숫자_생성(int index) {
        assertThat(ValidationUtils.validNo(balls.get(index))).isTrue();
    }

}
