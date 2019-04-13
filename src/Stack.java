/**
 * Stack Class
 *
 * ## Public Functions
 * - Stack(int maxsize): instantiate a stack class with predefined maxsize
 * - getSize(): return the current size
 * - push(element): pushes element into the stack
 * - pop(): pops the last element from the stack, returns null if empty
 */
public class Stack {
    private Object[] _stack;
    private int maxsize;
    private int size;

    /**
     * Instantiate Stack class with max size
     * @param maxsize: the maximum size of the stack
     */
    public Stack(int maxsize) {
        this._stack = new Object[maxsize];
        this.size = 0;
        this.maxsize = maxsize;
    }

    /**
     * Get the current stack size
     * @return: (int) size of stack
     */
    public int getSize() {
        return size;
    }

    /**
     * Pushes element into the stack
     * @param element: the element to push
     * @return: (int) 0 on success, 1 on failure
     */
    public int push(Object element) {
        if (this.size >= this.maxsize) {
            return 1;
        }

        this._stack[this.size++] = element;
        return 0;
    }

    /**
     * Pops the latest object from the stack
     * @return: The element from the stack
     */
    public Object pop() {
        if (this.size == 0) {
            return null;
        }

        return this._stack[--this.size];
    }
}
