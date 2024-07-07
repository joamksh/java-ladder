import java.util.ArrayList;
import java.util.List;

public class LadderGame {
    private Members members;
    private Ladder ladder;
    private Result result;

    public LadderGame(Members members, Ladder ladder, Result result) {
        this.members = members;
        this.ladder = ladder;
        this.result = result;
    }

    public String getResultFor(String memberName) {
        int index = members.getMembers().indexOf(new Member(memberName));
        if (index < 0) {
            throw new IllegalArgumentException("존재하지 않는 사람입니다.");
        }
        return result.getResult(findFinalPosition(index));
    }

    public List<String> getAllResults() {
        List<Member> membersList = members.getMembers();
        List<String> allResults = new ArrayList<>();
        for (int i = 0; i < membersList.size(); i++) {
            allResults.add(membersList.get(i).getName() + " : " + result.getResult(findFinalPosition(i)));
        }
        return allResults;
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
