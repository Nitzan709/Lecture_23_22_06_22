package wildcards;

import java.util.ArrayList;
import java.util.List;

public class StackWithWildCardsExample {
    public static void main(String[] args) {
        Stack<Number> numberStack = new Stack<>();
        numberStack.push(1);
        numberStack.push(2);
        numberStack.push(3);

        List<Object> numbers = new ArrayList<>();

        numberStack.popAll(numbers);

        System.out.println(numbers);

        /*Agree with me that:*/
        Object pop = numberStack.pop();

    }
}
