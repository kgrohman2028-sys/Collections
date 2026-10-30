import java.util.List;
import java.util.Arrays;
/**
 * Write a description of class Applications here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Applications
{
    
    /**
     * Reverses the given queue.
     *
     * @param queue queue to be reversed.
     */
    static <E> void reverse(MyQueueLL<E> queue){
        MyStackLL<E> stack = new MyStackLL<E>();
        int size = queue.size();
        for(int i = 0; i < size; i++){
            stack.push(queue.dequeue()); 
        }
        size = stack.size();
        for(int i = 0; i < size; i++){
            queue.enqueue(stack.pop()); 
        }
    
    }
    
    /**
     * Checks the validity of {} [] () <> pairs in given code.
     *
     * @param code the code to check.
     * @returns {@code true} if the code is valid; {@code false} otherwise.
     */
    static boolean checkSyntax(String code){
        List<String> opens = Arrays.asList("{", "[", "(", "<");
        List<String> closes = Arrays.asList("}", "]", ")", ">");
        MyStackLL<String> stack = new MyStackLL<String>();
        for(int i = 0; i < code.length(); i++){
            String slice = code.substring(i,i+1);
            if (opens.contains(slice)) {
                stack.push(slice);
            }else if (closes.contains(slice)) {
                if(stack.isEmpty() || !opens.get(closes.indexOf(slice)).equals(stack.pop())){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    /**
     * Evaluates a postfix expression for operators + - * / .
     *
     * @param code the code to check.
     * @returns double the answer.
     */
    static double evalPostfix(String expression){
    }
}