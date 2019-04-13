import org.junit.jupiter.api.Test;

class StackTest {

    @Test
    void push() {
        Stack stack = new Stack(1);
        assert stack.push("Object") == 0;
        assert stack.getSize() == 1;
    }

    @Test
    void push_limit() {
        Stack stack = new Stack(10);
        for (int i=0; i<10; i++) {
            stack.push(i);
        }

        assert stack.getSize() == 10;
        assert stack.push("object") == 1;
    }

    @Test
    void pop() {
        Stack stack = new Stack(1);
        Object element = (Object) "test";
        stack.push(element);
        assert stack.pop().equals(element);
        assert stack.pop() == null;

        assert stack.getSize() == 0;
    }
}