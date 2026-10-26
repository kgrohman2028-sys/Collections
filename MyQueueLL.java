import java.util.NoSuchElementException;

/**
 * Makes a circular queue based off an Array
 *
 * @author Keegan
 * @version 1
 * @param E the type of elements in the queue
 */
public class MyQueueLL<E> {
    // instance variables - replace the example below with your own
     private MyLinkedList<E> arr;

    /**
     * Constructs a dynamic queue.
     */
    public MyQueueLL() {
        arr = new MyLinkedList<E>();
    }

    /**
     * Adds an element to the back of the queue.
     *
     * @param element Elelmet to be added to the queue.
     * @throws IllegalStateException when Queue is full.
     */
    public void enqueue(E element) {
        arr.addTail(element);
    }
    
    /**
     * removes an element from the front of the queue.
     *
     * @returns element Elelmet to be added to the queue.
     * @throws NoSuchElementException  when the the queue is empty.
     */
    public E dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is Empty");
        } else {
            return arr.removeHead();
        }
    }
    
    /**
     * Indicates whether the queue contains any elements.
     * 
     * @return {@code true} if the queue is empty; {@code false} otherwise.
     */
    public boolean isEmpty() {
        return arr.isEmpty();
    }
    
    /**
     * Reads the element at the front of the queue.
     * 
     * @return element on front of the queue.
     * @throws NoSuchElementException  when the the queue is empty.
     */
    public E front() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is Empty");
        } else {
            return arr.getHead();
        }
    }
    
    /**
     * Returns the number of elements stored in the queue.
     * 
     * @return size of the queue.
     */
    public int size() {
        return arr.size();
    }

    public String toString() {
        return arr.toString();
    }
}
