package queue;

public class Main {
    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(5);
        circularQueue.print();
        circularQueue.enqueue(10);
        circularQueue.enqueue(20);
        circularQueue.enqueue(30);
        circularQueue.enqueue(40);
        circularQueue.enqueue(50);
        circularQueue.print();
        circularQueue.enqueue(60);
        System.out.println("Dequeued element: " + circularQueue.dequeue());
        System.out.println("Dequeued element: " + circularQueue.dequeue());
        circularQueue.print();
        System.out.println("Top element: " + circularQueue.peek());
        circularQueue.enqueue(70);
        circularQueue.enqueue(80);
        circularQueue.print();
        System.out.println("Top element: " + circularQueue.peek());
    }
}
