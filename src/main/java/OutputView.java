import java.util.List;

public class OutputView {
    public static void printLadder(Members members, Ladder ladder, Result result) {
        printMembers(members.getMembers());
        for (Line line : ladder.getLines()) {
            printLine(line);
        }
        printResults(result.getResults());
    }

    private static void printMembers(List<Member> members) {
        for (Member member : members) {
            System.out.print(member.getName() + " ");
        }
        System.out.println();
    }

    private static void printLine(Line line) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < line.size(); i++) {
            sb.append("|");
            sb.append(line.hasPoint(i) ? "-----" : "     ");
        }
        sb.append("|");
        System.out.println(sb.toString());
    }

    private static void printResults(List<String> results) {
        for (String result : results) {
            System.out.print(result + "   ");
        }
        System.out.println();
    }

    public static void printResult(String result) {
        System.out.println("실행 결과");
        System.out.println(result);
    }

    public static void printAllResults(List<String> allResults) {
        System.out.println("실행 결과");
        for (String result : allResults) {
            System.out.println(result);
        }
    }

}
