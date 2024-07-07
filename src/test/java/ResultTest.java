import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class ResultTest {

    @Test
    void testGetResult() {
        List<String> results = Arrays.asList("꽝", "5000", "꽝", "3000");
        Result result = new Result(results);

        assertThat(result.getResult(0)).isEqualTo("꽝");
        assertThat(result.getResult(1)).isEqualTo("5000");
        assertThat(result.getResult(2)).isEqualTo("꽝");
        assertThat(result.getResult(3)).isEqualTo("3000");
    }

    @Test
    void testGetResults() {
        List<String> results = Arrays.asList("꽝", "5000", "꽝", "3000");
        Result result = new Result(results);

        assertThat(result.getResults()).containsExactly("꽝", "5000", "꽝", "3000");
    }
}
