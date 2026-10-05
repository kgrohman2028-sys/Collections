
/**
 * Makes a stack based off an Array
 *
 * @author Geegan Krohman
 * @version 1
 */
public class MyStack {
    
    private int[] arr;
    //stores the value of the next empty index
    private int idx;
    
    /**
     * Constructs a stack that can hold 100 elements.
     */
    public MyStack() {
        // initialise instance variables
        idx = 0;
        arr = new int[100];
    }
    
    /**
     * Constructs a stack that can hold maxSize elements.
     * 
     * @param max The maximum size of the stack.
     */
    public MyStack(int maxSize) {
        // initialise instance variables
        idx = 0;
        arr = new int[maxSize];
    }

    /**
     * Pushes an element on to the stack.
     * 
     * @param element Item to be added to the stack.
     */
    public void push(int element) {
        arr[idx] = element;
        idx++;
    }
    
    /**
     * Pops an element off of the stack.
     * 
     * @return element on top of the stack and removes it.
     */
    public int pop() {
        idx--;
        return arr[idx];
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
     */
    public int top() {
        return arr[idx-1];
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