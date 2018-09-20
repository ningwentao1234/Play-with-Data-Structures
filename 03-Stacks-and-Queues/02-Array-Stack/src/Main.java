/**
 * Created by ningw on 2018/9/16.
 */
public class Main {
    public static void main(String[] args) {

        ArrayStack<Integer> stack = new ArrayStack<Integer>(20);

        for(int i = 0 ; i < 5 ; i ++){
            stack.push(i);
            System.out.println(stack);
        }

        stack.pop();
        System.out.println(stack);
    }
}
