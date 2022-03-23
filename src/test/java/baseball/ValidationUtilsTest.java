package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ValidationUtilsTest {

    @Test
    void 야구_숫자_1_9_검증(){
        assertThat(ValidationUtils.validNo(9)).isTrue();
        assertThat(ValidationUtils.validNo(1)).isTrue();
        assertThat(ValidationUtils.validNo(0)).isFalse();
    }

}
