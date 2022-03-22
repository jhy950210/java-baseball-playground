package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    @DisplayName("string contains, containsExactly")
    void split(){
        // given
        String[] strings = "1,2".split(",");

        // then
        assertThat(strings).contains("1","2");
        assertThat(strings).containsExactly("1", "2");
    }

    @Test
    @DisplayName("문자열 분리(substring)")
    void substring(){
        // given
        String actual = "(1,2)";

        // when
        String substring = actual.substring(1, actual.length()-1);

        // then
        assertThat(substring).isEqualTo("1,2");
    }

    @Test
    @DisplayName("특정위치 문자 가져오기")
    void charAt(){
        // given
        String actual = "abc";

        // then
        assertThatThrownBy(() -> {
            actual.charAt(3);
        }).isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("range: 3");
    }
}
