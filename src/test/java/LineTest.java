import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class LineTest {
    @Test void line_notContinusous_check(){
        Line line1 = new Line(4);

        List<Boolean> points = line1.getPoints();

        for (int i = 1; i < points.size(); i++) {
            Assertions.assertThat(points.get(i - 1) && points.get(i))
                    .isFalse();
        }
    }

}
