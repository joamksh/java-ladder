import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = InputView.inputNames();
        List<String> results = InputView.inputResults();
        int height = InputView.inputLadderHeight();

        Members members = new Members(names);
        Result result = new Result(results);
        Ladder ladder = new Ladder(members.getMembers().size(), height);

        OutputView.printLadder(members, ladder, result);

        LadderGame ladderGame = new LadderGame(members, ladder, result);

        while (true) {
            String query = InputView.inputQuery();
            if ("all".equalsIgnoreCase(query)) {
                OutputView.printAllResults(ladderGame.getAllResults());
                break;
            } else {
                OutputView.printResult(ladderGame.getResultFor(query));
            }
        }
    }
}
