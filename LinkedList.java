import java.util.NoSuchElementException;

/**
 * Write a description of class LinkedList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LinkedList<E> {
    
    private int length;
    private Node head;
    private Node tail;

    /**
     * Constructor for objects of class LinkedList.
     */
    public LinkedList() {
        // initialise instance variables
        length = 0;
        tail = null;
        head = null;
    }

    /**
     * Adds element at beginning of list.
     *
     * @param element element to be added.
     * @return the sum of x and y
     */
    public void addHead(E element) {
        if (tail == null && head == null ) {
            Node node = new Node<E>(element, null);
            tail = node;
            head = node;
        } else {
            Node node = new Node<E>(element, head);
            head = node;
            length++;
        }
    }
    
    /**
     * Adds element at end of list.
     *
     * @param element element to be added.
     * @return the sum of x and y
     */
    public void addTail(E element) {
        if (tail == null && head == null ) {
            Node node = new Node<E>(element, null);
            tail = node;
            head = node;
        } else {
            Node node = new Node<E>(element, null);
            tail.setNext(node);
            tail = node;
            length++;
        }
    }
    
    /**
     * Removes and returns element at beginning of list.
     *
     * @param element element to be added.
     * @return the removed elelmet.
     */
    public E removeHead(){
        if (tail == null && head == null ) {
            throw new NoSuchElementException();
        } else {
            E tempEle = (E) head.getElement();
            head.setElement(null);
            Node tempNext = head.getNext();
            head.setNext(null);
            head = tempNext;
            length--;
            return tempEle;
        }
    }
    
    /**
     * Returns element at beginning of list.
     *
     * @param element element to be added.
     * @return element at beginning of list.
     */
    public E getHead(){
        if (tail == null && head == null) {
            throw new NoSuchElementException();
        } else {
            return (E) head.getElement();
        }
    }
    
    /**
     * Indicates whether the list contains any elements.
     * 
     * @return {@code true} if the list is empty; {@code false} otherwise.
     */
    public boolean isEmpty(){
        return tail == null && head == null;
    }
    
    /**
     * Returns the number of elelmets in the list.
     * 
     * @return the number of elelmets in the list.
     */
    public int size(){
        return length;
    }
    
    /**
     * Returns the contents of the list in csv format from head to tail.
     * 
     * @return the contents of the list in csv format from head to tail.
     */
    public String toString() {
        String temp = "";
        if (tail == null && head == null ) {
            return temp;
        } else {
            Node node = head;
            while (node.getNext() != null) {
                temp += node.getElement() + ", ";
                node = node.getNext();
            }
            temp += node.getElement();
        }
        return temp;
    }
    
    private class Node<E>{
        private E element;
        private Node next;
        
        public Node(E aelement, Node node) {        // initialise instance variables
            element = aelement;
            next = node;
        }

        public Node getNext() {
            // put your code here
            return next;
        }
    
        public E getElement() {
            // put your code here
            return element;
        }
    
        public void setElement(E aelement) {
            element = aelement;
        }
    
        public void setNext(Node node) {
            next = node;
        }
    }
}