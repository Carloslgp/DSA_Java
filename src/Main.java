import ArrayList.MyArrayList;
import Stack.MyStack;

import java.util.Arrays;



public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(5);
        stack.push(6);
        stack.print();
        System.out.println();
        System.out.println(stack.pop());
        System.out.println();
        stack.print();
        System.out.println();
        stack.push(7);
        stack.push(8);
        stack.push(9);
        System.out.println(stack.isEmpty());
        System.out.println();
        System.out.println(stack.pop());
        System.out.println();
        stack.print();
        System.out.println();
        stack.clear();
        System.out.println(stack.isEmpty());
        System.out.println();
        stack.print();


    }
}
