
/**
 * Write a description of class MyQueue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyQueue
{
    // instance variables - replace the example below with your own
    private int beg;
    private int end;
    private int maxSize;
    private int[] arr;

    /**
     * Constructs a queue that can hold 100 elements.
     */
    public MyQueue() {
        beg = 0;
        end = -1;
        maxSize = 100;
        arr = new int[100];
    }
    
    /**
     * Constructs a queue that can hold maxSize elements.
     * 
     * @param maxSize Length of the queue.
     */
    public MyQueue(int maxSize) {
        beg = 0;
        end = -1;
        this.maxSize = maxSize;
        arr = new int[maxSize];
    }

    /**
     * Adds an element to the back of the queue.
     *
     * @param element Elelmet to be added to the queue.
     */
    public void enqueue(int element) {
        if (!isFull()) {
            end++; 
            end = end % maxSize;
            arr[end] = element; 
        } else {
            throw new Error();
        }
    }
    
    /**
     * removes an element from the front of the queue.
     *
     * @returns element Elelmet to be added to the queue.
     */
    public int dequeue() {
        if (!isEmpty()) {
            int temp = arr[beg];
            beg++;
            beg = beg % maxSize;
            return temp;
        } else {
            return -1;
        }
    }
    
    /**
     * Indicates whether the queue contains any elements.
     * 
     * @return {@code true} if the queue is empty; {@code false} otherwise.
     */
    public boolean isEmpty() {
        return size() == 0;
    }
    
    /**
     * Indicates whether the queue is full.
     * 
     * @return {@code true} if the queue is full; {@code false} otherwise.
     */
    public boolean isFull() {
        return size() == maxSize;
    }
    
    /**
     * Reads the element at the front of the queue.
     * 
     * @return element on front of the queue.
     */
    public int front() {
        if(!isEmpty()){
            return arr[beg];
        } else {
            //ERR
            return -1;
        }
    }
    
    public int size() {
        return maxSize +1 - (beg - end);
    }

    public String toString() {
        String temp = "";
        for(int i = beg; i < end + 1; i++) {
            temp += arr[i] +", ";
        }
        return temp;
    }
}