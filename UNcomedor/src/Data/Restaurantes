import java.util.Scanner;

public class Main {
    private final int N = 100;
    private int front, rear, count;
    Comedores qarray[];
  
    public Main() {
        front = rear = count = 0;
        qarray = new Comedores[N];
    }
    private static class Comedores {
        String nomComedor = "";
        int ocupacion = 0;
        String estado="";
    }
    public Comedores dequeue() {
        Comedores item = null;
        if (empty()) {
            System.out.println("Queue is empty: " + "item not dequeued");
        } else {
            item = qarray[front];
            front = (front + 1) % N;
            count--;
        }
        return item;
    }
    public void enqueue(Comedores item) {
        if (full()) {
            System.out.println("Queue is full: item not enqueued");
        } else {
            qarray[rear] = item;
            rear = (rear + 1) % N;
            count++;
        }
    }
    public boolean empty() {
        return count <= 0;
    }
    public boolean full() {
        return count >= N;
    }
    public static void main(String[] args) {   
        Main q = new Main();

    }

}
