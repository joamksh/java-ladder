
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MembersTest {
    @Test void Members_split_check(){
        // Given
        List<String> names = Arrays.asList("수현1", "수현2", "수현3");

        // When
        Members members = new Members(names);

        // Then
        List<Member> memberList = members.getMembers();
        assertEquals(3, memberList.size(), "Members 리스트의 크기가 예상과 다릅니다.");

        assertEquals("수현1", memberList.get(0).getName(), "첫 번째 이름이 예상과 다릅니다.");
        assertEquals("수현2", memberList.get(1).getName(), "두 번째 이름이 예상과 다릅니다.");
        assertEquals("수현3", memberList.get(2).getName(), "세 번째 이름이 예상과 다릅니다.");

    }
}
