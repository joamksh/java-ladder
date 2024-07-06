import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = InputView.inputNames();
        int height = InputView.inputLadderHeight();

        Members members = new Members(names);
        Ladder ladder = new Ladder(members.getMembers().size(), height);

        OutputView.printLadder(members, ladder);
    }
}

