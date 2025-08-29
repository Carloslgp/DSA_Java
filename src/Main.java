import Queue.MyQueue;

public class Main {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<Integer>();
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);
        myQueue.enqueue(6);
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.print();

    }
}
