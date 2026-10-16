import java.util.NoSuchElementException;

/**
 * Makes a circular queue based off an Array
 *
 * @author Keegan
 * @version 1
 * @param E the type of elements in the queue
 */
public class MyQueue<E> {
    // instance variables - replace the example below with your own
    private int beg;
    private int size;
    private int maxSize;
    private E[] arr;

    /**
     * Constructs a queue that can hold 100 elements.
     */
    public MyQueue() {
        beg = 0;
        size = 0;
        maxSize = 100;
        arr = (E[]) new Object[100];
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
        arr = (E[]) new Object[maxSize];
    }

    /**
     * Adds an element to the back of the queue.
     *
     * @param element Elelmet to be added to the queue.
     * @throws IllegalStateException when Queue is full.
     */
    public void enqueue(E element) {
        if (!isFull()) { 
            arr[(beg + size) % maxSize] = element;
            if (size < maxSize) {
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
    public E dequeue() {
        if (!isEmpty()) {
            E temp = arr[beg];
            arr[beg] = null;
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
    public E front() {
        if (!isEmpty()) {
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
        for (int i = beg; i < size; i++) {
            if (i == size - 1 && beg == 0) {
                temp += arr[i];
            } else {
                temp += arr[i] +", ";
            }
        }
        for (int i = 0; i < beg; i++) {
            if (i == beg - 1){
                temp += arr[i];
            } else {
                temp += arr[i] +", ";
            }
        }
        return temp;
    }
}