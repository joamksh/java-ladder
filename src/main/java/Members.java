import java.util.ArrayList;
import java.util.List;

public class Members {
    private List<Member> members;

    public Members(List<String> names) {
        this.members = generateMembers(names);
    }

    private List<Member> generateMembers(List<String> names) {
        List<Member> members = new ArrayList<>();
        for (String name : names) {
            members.add(new Member(name));
        }
        return members;
    }

    public List<Member> getMembers() {
        return members;
    }
}
