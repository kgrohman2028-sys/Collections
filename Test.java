
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Test
     */
    public Test()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void testQueue() {
        // put your code here
        try {
            MyQueue q = new MyQueue<Integer>(3);
            q.dequeue();
        } catch (Exception e) {
            System.out.println("empty");
        }
        
        try {
            MyQueue q = new MyQueue<Integer>(3);
            q.front();
        } catch (Exception e) {
            System.out.println("empty");
        }
        
        try {
            MyQueue q = new MyQueue<Integer>(3);
            q.enqueue(1);
            q.enqueue(2);
            q.enqueue(3);
            System.out.println(q);
            q.dequeue();
            q.enqueue(4);
            System.out.println(q);
            q.enqueue(9);
        } catch (Exception e) {
            System.out.println("full");
        }
        try {
            MyQueue q = new MyQueue<Integer>();
            for (int i = 0; i < 101; i++) {
                q.enqueue(i);
            }
            for (int i = 0; i < 100; i++) {
                q.dequeue();
            }
        } catch(Exception e){
            System.out.println("defualt full");
        }
        try {
            MyQueue q = new MyQueue<Integer>();
            for (int i = 0; i < 100; i++) {
                q.enqueue(i);
            }
            for (int i = 0; i < 101; i++) {
                q.dequeue();
            }
        } catch(Exception e){
            System.out.println("defualt empty");
        }
    }
    
     public static void testQueueLL() {
        // put your code here
        try {
            MyQueueLL q = new MyQueueLL<Integer>();
            q.dequeue();
        } catch (Exception e) {
            System.out.println("empty");
        }
        
        try {
            MyQueueLL q = new MyQueueLL<Integer>();
            q.front();
        } catch (Exception e) {
            System.out.println("empty");
        }
        MyQueueLL q = new MyQueueLL<Integer>();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println();
        q.dequeue();
        q.enqueue(4);
        System.out.println(q);
        q.enqueue(9);
        q = new MyQueueLL<Integer>();
        for (int i = 0; i < 100; i++) {
            q.enqueue(i);
        }
        for (int i = 0; i < 100; i++) {
            System.out.println(q.dequeue());
        }
    }
    
    public static void testStack() {
        // put your code here
        try {
            MyStack q = new MyStack<Integer>(3);
            q.pop();
        } catch (Exception e) {
            System.out.println("empty");
        }
        
        try {
            MyStack q = new MyStack<Integer>(3);
            q.top();
        } catch (Exception e) {
            System.out.println("empty");
        }
        
        try {
            MyStack q = new MyStack<Integer>(3);
            q.push(1);
            q.push(2);
            q.push(3);
            System.out.println(q);
            q.pop();
            q.push(4);
            System.out.println(q);
            q.push(9);
            q.push(5);
            System.out.println(q.size());
        } catch (Exception e) {
            System.out.println("full");
        }
        try {
            MyStack q = new MyStack<Integer>();
            for (int i = 0; i < 101; i++) {
                q.push(i);
            }
            for (int i = 0; i < 100; i++) {
                q.pop();
            }
        } catch(Exception e){
            System.out.println("defualt full");
        }
       try {
            MyStack q = new MyStack<Integer>();
            for (int i = 0; i < 100; i++) {
                q.push(i);
            }
            for (int i = 0; i < 101; i++) {
                q.pop();
            }
        } catch(Exception e){
            System.out.println("defualt empty");
        }
    }
    public static void testStackLL() {
        // put your code here
        try {
            MyStackLL q = new MyStackLL<Integer>();
            q.pop();
        } catch (Exception e) {
            System.out.println("empty");
        }
        
        try {
            MyStackLL q = new MyStackLL<Integer>();
            q.top();
        } catch (Exception e) {
            System.out.println("empty");
        }
        
            MyStackLL q = new MyStackLL<Integer>();
            q.push(1);
            q.push(2);
            q.push(3);
            System.out.println(q);
            q.pop();
            q.push(4);
            System.out.println(q);
            System.out.println(q.size());
            q.push(9);
            q.push(5);
            System.out.println(q);
            System.out.println(q.size());
        q = new MyStackLL<Integer>();
        for (int i = 0; i < 100; i++) {
            q.push(i);
        }
        for (int i = 0; i < 100; i++) {
            System.out.println(q.pop());
        }
        System.out.println(q.size());
    }
    
    public static void testLL() {
        // put your code here
        try {
            MyLinkedList q = new MyLinkedList<Integer>();
            q.removeHead();
        } catch (Exception e) {
            System.out.println("empty");
        }
        
        try {
            MyLinkedList q = new MyLinkedList<Integer>();
            q.getHead();
        } catch (Exception e) {
            System.out.println("empty");
        }
        
        try {
            MyLinkedList q = new MyLinkedList<Integer>();
            q.addHead(2);
            q.addTail(3);
            q.addTail(4);
            q.addHead(1);
            q.addHead(0);
            System.out.println(q.removeHead() == (Integer) 0);
            System.out.println(q);
            System.out.println(q.toString().equals("1, 2, 3, 4"));
        } catch (Exception e) {
            System.out.println("full");
        }
    }
}