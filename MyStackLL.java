import java.util.EmptyStackException;

/**
 * Makes a stack based off an Array
 *
 * @author Geegan Krohman
 * @version 1
 * @param E the type of elements in the stack
 */
public class MyStackLL<E> {
    
    private LinkedList<E> arr;
    
    /**
     * Constructs a dynamic stack.
     */
    public MyStackLL() {
        arr = new LinkedList<E>();
    }

    /**
     * Pushes an element on to the stack.
     * 
     * @param element Item to be added to the stack.
     * @throws IllegalStateException when stack is full.
     */
    public void push(E element) {
        arr.addHead(element);
    }
    
    /**
     * Pops an element off of the stack.
     * 
     * @return element on top of the stack and removes it.
     * @throws EmptyStackException when the stack is empty.
     */
    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            return arr.removeHead();
        }
    }
    
    /**
     * Indicates whether stack contains any elements.
     * 
     * @return {@code true} if the stack is empty; {@code false} otherwise.
     */
    public boolean isEmpty() {
        return arr.isEmpty();
    }
    
    /**
     * Reads the element at the top of the stack.
     * 
     * @return element on top of the stack.
     * @throws EmptyStackException when the stack is empty.
     */
    public E top() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            return arr.getHead();
        }    
    }
    
    /**
     * Reads the element at the top of the stack.
     * 
     * @return element on top of the stack.
     */
    public int size() {
        return arr.size();
    }
    
    /**
     * Returns the contents of the stack from top to bottom.
     * 
     * @return A string of elements from top to bottom separated by a comma.
     */
    public String toString() {
        return arr.toString();
    }
}
