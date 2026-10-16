import java.util.EmptyStackException;

/**
 * Makes a stack based off an Array
 *
 * @author Geegan Krohman
 * @version 1
 * @param E the type of elements in the stack
 */
public class MyStack<E> {
    
    private E[] arr;
    //stores the value of the next empty index
    private int idx;
    
    /**
     * Constructs a stack that can hold 100 elements.
     */
    public MyStack() {
        // initialise instance variables
        idx = 0;
        arr = (E[]) new Object[100];
    }
    
    /**
     * Constructs a stack that can hold maxSize elements.
     * 
     * @param max The maximum size of the stack.
     */
    public MyStack(int maxSize) {
        // initialise instance variables
        idx = 0;
        arr = (E[]) new Object[maxSize];
    }

    /**
     * Pushes an element on to the stack.
     * 
     * @param element Item to be added to the stack.
     * @throws IllegalStateException when stack is full.
     */
    public void push(E element) {
        if (!isFull()) {
            arr[idx] = element;
            idx++;
        } else {
            throw new IllegalStateException("Stack is full");
        }
    }
    
    /**
     * Pops an element off of the stack.
     * 
     * @return element on top of the stack and removes it.
     * @throws EmptyStackException when the stack is empty.
     */
    public E pop() {
        if (!isEmpty()) { 
            idx--;
            E temp = arr[idx];
            arr[idx] = null;
            return temp;
        } else {
            throw new EmptyStackException();
        }
    }
    
    /**
     * Indicates whether stack contains any elements.
     * 
     * @return {@code true} if the stack is empty; {@code false} otherwise.
     */
    public boolean isEmpty() {
        return idx == 0;
    }
    
    /**
     * Indicates whether the stack is full.
     * 
     * @return {@code true} if the stack is full; {@code false} otherwise.
     */
    public boolean isFull() {
        return idx == arr.length;
    }
    
    /**
     * Reads the element at the top of the stack.
     * 
     * @return element on top of the stack.
     * @throws EmptyStackException when the stack is empty.
     */
    public E top() {
        if (!isEmpty()) { 
            return arr[idx - 1];
        } else {
            throw new EmptyStackException();
        }
    }
    
    /**
     * Reads the element at the top of the stack.
     * 
     * @return element on top of the stack.
     */
    public int size() {
        return idx;
    }
    
    /**
     * Returns the contents of the stack from top to bottom.
     * 
     * @return A string of elements from top to bottom separated by a comma.
     */
    public String toString() {
        String cat = "";
        for (int i = idx-1; i >= 0; i--){
            if (i == 0){
                cat += arr[i];
            } else {
                cat += arr[i] + ", ";
            }
        }
        return cat;
    }
}