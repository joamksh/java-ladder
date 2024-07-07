import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LadderTest {
    @Test void Ladder_height_check(){
        // Given
        int personCount = 4;
        int height = 5;

        // When
        Ladder ladder = new Ladder(personCount, height);

        // Then
        List<Line> lines = ladder.getLines();
        assertEquals(height, lines.size(), "사다리의 높이가 예상과 다릅니다.");

        for (Line line : lines) {
            assertEquals(personCount - 1, line.size(), "라인의 크기가 예상과 다릅니다.");
        }

    }
}
