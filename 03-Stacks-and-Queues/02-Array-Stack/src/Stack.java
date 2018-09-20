/**
 * Created by ningw on 2018/9/16.
 */
public interface Stack<E> {
    int getSize();
    boolean isEmpty();
    void push(E e);
    E pop();
    E peek();

}
