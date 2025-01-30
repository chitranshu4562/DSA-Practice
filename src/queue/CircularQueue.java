package queue;

public class CircularQueue {
    int capacity, size, front, rear;
    int[] arr;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full: element can not be enqueued");
            return;
        }
        rear = (rear + 1)%capacity;
        arr[rear] = element;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty: Can not be dequeued");
            return -1;
        }
        int removedElement = arr[front];
        front = (front + 1)%capacity;
        size--;
        return removedElement;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i=0; i<size; i++) {
            System.out.print(arr[(front + i)%capacity] + " ");
        }
        System.out.println();
    }
}
