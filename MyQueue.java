import java.util.NoSuchElementException;

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
    private int size;
    private int maxSize;
    private int[] arr;

    /**
     * Constructs a queue that can hold 100 elements.
     */
    public MyQueue() {
        beg = 0;
        size = 0;
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
        size = 0;
        this.maxSize = maxSize;
        arr = new int[maxSize];
    }

    /**
     * Adds an element to the back of the queue.
     *
     * @param element Elelmet to be added to the queue.
     * @throws IllegalStateException when Queue is full.
     */
    public void enqueue(int element) {
        if (!isFull()) { 
            arr[(beg + size) % maxSize] = element;
            if(size < maxSize){
                size++;
            }
        } else {
            throw new IllegalStateException("Queue is full");
        }
    }
    
    /**
     * removes an element from the front of the queue.
     *
     * @returns element Elelmet to be added to the queue.
     * @throws NoSuchElementException  when the the queue is empty.
     */
    public int dequeue() {
        if (!isEmpty()) {
            int temp = arr[beg];
            beg++;
            beg = beg % maxSize;
            size--;
            return temp;
        } else {
            throw new NoSuchElementException("Queue is Empty");
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
     * @throws NoSuchElementException  when the the queue is empty.
     */
    public int front() {
        if(!isEmpty()){
            return arr[beg];
        } else {
            throw new NoSuchElementException("Queue is Empty");
        }
    }
    
    /**
     * Returns the number of elements stored in the queue.
     * 
     * @return size of the queue.
     */
    public int size() {
        return size;
    }

    public String toString() {
        String temp = "";
        for(int i = beg; i < size; i++) {
            temp += arr[i] +", ";
        }
        return temp;
    }
}