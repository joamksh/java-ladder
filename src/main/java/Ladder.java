import java.util.ArrayList;
import java.util.List;

public class Ladder {
    private List<Line> lines;

    public Ladder(int personCount, int height) {
        this.lines = generateLadder(personCount, height);
    }

    private List<Line> generateLadder(int personCount, int height) {
        List<Line> lines = new ArrayList<>();
        for (int i = 0; i < height; i++) {
            lines.add(new Line(personCount));
        }
        return lines;
    }

    public List<Line> getLines() {
        return lines;
    }

    public int getHeight() {
        return lines.size();
    }
}

