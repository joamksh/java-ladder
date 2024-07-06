import java.util.List;

public class OutputView {
    public static void printLadder(Members members, Ladder ladder) {
        printMembers(members.getMembers());
        for (Line line : ladder.getLines()) {
            printLine(line);
        }
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
}
