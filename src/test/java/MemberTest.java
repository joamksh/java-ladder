import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberTest {
    @Test void member_nameLength5_check() {
        //given
        Member member1  = new Member("rlatn");
        Member member2  = new Member("qkrd");

        //when

        //assert
        Assertions.assertThat(member1.getName().length()).isLessThan(6);
    }

}
