package list;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class SimpleLinkedListTest {

    @Test
    void testAdd() {
        SimpleList list = new SimpleLinkedList();
        list.add("first");
        list.add("second");
        list.add("third");

        assertThat(list.size()).isEqualTo(3);
        assertThat(list.get(0)).isEqualTo("first");
        assertThat(list.get(1)).isEqualTo("second");
        assertThat(list.get(2)).isEqualTo("third");
    }

    @Test
    void testAddAtIndex() {
        SimpleList list = new SimpleLinkedList();
        list.add("first");
        list.add("third");
        list.add(1, "second");

        assertThat(list.size()).isEqualTo(3);
        assertThat(list.get(1)).isEqualTo("second");
    }

    @Test
    void testSet() {
        SimpleList list = new SimpleLinkedList();
        list.add("first");
        list.add("second");
        list.set(1, "updated");

        assertThat(list.get(1)).isEqualTo("updated");
    }

    @Test
    void testContains() {
        SimpleList list = new SimpleLinkedList();
        list.add("first");

        assertThat(list.contains("first")).isTrue();
        assertThat(list.contains("second")).isFalse();
    }

    @Test
    void testIndexOf() {
        SimpleList list = new SimpleLinkedList();
        list.add("first");
        list.add("second");

        assertThat(list.indexOf("second")).isEqualTo(1);
        assertThat(list.indexOf("third")).isEqualTo(-1);
    }

    @Test
    void testRemoveByValue() {
        SimpleList list = new SimpleLinkedList();
        list.add("first");
        list.add("second");

        list.remove("first");

        assertThat(list.size()).isEqualTo(1);
        assertThat(list.contains("first")).isFalse();
    }

    @Test
    void testRemoveByIndex() {
        SimpleList list = new SimpleLinkedList();
        list.add("first");
        list.add("second");

        list.remove(0);

        assertThat(list.size()).isEqualTo(1);
        assertThat(list.get(0)).isEqualTo("second");
    }

    @Test
    void testClear() {
        SimpleList list = new SimpleLinkedList();
        list.add("first");
        list.add("second");

        list.clear();

        assertThat(list.size()).isEqualTo(0);
        assertThat(list.isEmpty()).isTrue();
    }
}

