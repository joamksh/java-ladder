import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class LadderGameTest {

    private Members members;
    private Result result;
    private Ladder ladder;
    private LadderGame ladderGame;

    @BeforeEach
    void setUp() {
        List<String> names = Arrays.asList("pobi", "honux", "crong", "jk");
        List<String> results = Arrays.asList("꽝", "5000", "꽝", "3000");
        int height = 5;

        members = new Members(names);
        result = new Result(results);
        ladder = new Ladder(members.getMembers().size(), height);
        ladderGame = new LadderGame(members, ladder, result);
    }


    @Test
    void testGetAllResults() {
        // When
        List<String> allResults = ladderGame.getAllResults();

        // Then
        assertThat(allResults).containsExactly(
                "pobi : " + result.getResult(findFinalPosition(0)),
                "honux : " + result.getResult(findFinalPosition(1)),
                "crong : " + result.getResult(findFinalPosition(2)),
                "jk : " + result.getResult(findFinalPosition(3))
        );
    }

    @Test
    void testFindFinalPosition() {
        // When & Then
        assertThat(findFinalPosition(0)).isNotNull();
        assertThat(findFinalPosition(1)).isNotNull();
        assertThat(findFinalPosition(2)).isNotNull();
        assertThat(findFinalPosition(3)).isNotNull();
    }

    private int findFinalPosition(int startPosition) {
        int currentPosition = startPosition;
        for (Line line : ladder.getLines()) {
            if (currentPosition < line.size() && line.hasPoint(currentPosition)) {
                currentPosition++;
            } else if (currentPosition > 0 && line.hasPoint(currentPosition - 1)) {
                currentPosition--;
            }
        }
        return currentPosition;
    }
}
