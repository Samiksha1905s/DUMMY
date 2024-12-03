interface QueueD {
    void enqueue(int element);
    int dequeue();
    int peek();
    boolean isEmpty();
    boolean isFull();  
    void display();  
}
class Linearq implements QueueD{
    private int[] queue;
    private int front, rear, size;

    public Linearq(int capacity) {
        queue = new int[capacity];
        front = rear = -1;
        size = capacity;  
    }

    @Override
    public void enqueue(int element) {
        if (isFull()) {  
            System.out.println("Queue is full");
            return;
        }
        if (front == -1) {  
            front = 0;
        }
        queue[++rear] = element;  
    }

    @Override
    public int dequeue() {
        if (isEmpty()) {  
            System.out.println("Queue is empty");
            return -1;
        }
        int element = queue[front];
        if (front == rear) {  
            front = rear = -1;
        } else {
            front++;
        }
        return element;  
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];  
    }

    @Override
    public boolean isEmpty() {
        return front == -1;  
    }

    @Override
    public boolean isFull() {
        return rear == size - 1;  
    }

    @Override
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}



class Circularq implements QueueD {
    private int[] queue;
    private int front, rear, size, capacity;

    public Circularq(int capacity) {
        queue = new int[capacity];
        front = rear = -1;
        this.capacity = capacity;  
        size = 0;  
    }

    @Override
    public void enqueue(int element) {
        if (isFull()) {  
            System.out.println("Queue is full");
            return;
        }
        if (front == -1) {  
            front = 0;
        }
        rear = (rear + 1) % capacity;  
        queue[rear] = element;  
        size++;  
    }

    @Override
    public int dequeue() {
        if (isEmpty()) {  
            System.out.println("Queue is empty");
            return -1;
        }
        int element = queue[front];
        front = (front + 1) % capacity;  
        size--;  
        if (size == 0) {  
            front = rear = -1;
        }
        return element;  
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];  
    }

    @Override
    public boolean isEmpty() {
        return size == 0;  
    }

    @Override
    public boolean isFull() {
        return size == capacity;  
    }

    @Override
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue elements: ");
        int i = front;
        do {
            System.out.print(queue[i] + " ");
            i = (i + 1) % capacity;  
        } while (i != (rear + 1) % capacity);
        System.out.println();
    }
}

public class QueueTest {
    public static void main(String[] args) {
        QueueD linearq = new Linearq(5);
        QueueD Circularq = new Circularq(5);
        
        System.out.println("Linear Queue:");
        linearq.enqueue(10);
        linearq.enqueue(20);
        linearq.enqueue(30);
        linearq.display();  
        System.out.println("Front element: " + linearq.peek());
        System.out.println("Is full: " + linearq.isFull());
        
        System.out.println("Dequeue: " + linearq.dequeue());
        
        linearq.display();  
        System.out.println("Front element: " + linearq.peek());
        System.out.println("Is empty: " + linearq.isEmpty());
        
         System.out.println("\nCircular Queue:");
        Circularq.enqueue(10);
        Circularq.enqueue(20);
        Circularq.enqueue(30);
        Circularq.enqueue(40);
        Circularq.enqueue(50);
        Circularq.enqueue(60);
        Circularq.display();  
        System.out.println("Is full: " + Circularq.isFull());
        System.out.println("Front element: " + Circularq.peek());
        System.out.println("Dequeue: " + Circularq.dequeue());
        Circularq.enqueue(60); 
        Circularq.display();  
        System.out.println("Dequeue: " + Circularq.dequeue());
        Circularq.display();  
        System.out.println("Is empty: " + Circularq.isEmpty());

    }
        
}
