import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Line {

    private List<Boolean> points;


    public Line(int personCount) {
        this.points = generatePoints(personCount);
    }

    private List<Boolean> generatePoints(int personCount) {
        List<Boolean> points = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < personCount - 1; i++) {
            if (i > 0 && points.get(i - 1)) {
                points.add(false); // 이전 위치에 가로선이 있으면 현재 위치에는 가로선을 두지 않음
            } else {
                points.add(random.nextBoolean());
            }
        }

        return points;
    }

    public boolean hasPoint(int index) {
        return points.get(index);
    }

    public int size() {
        return points.size();
    }

    public List<Boolean> getPoints() {
        return points;
    }

    public void setPoints(List<Boolean> points) {
        this.points = points;
    }

}
