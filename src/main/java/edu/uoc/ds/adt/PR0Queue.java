package edu.uoc.ds.adt;


import edu.uoc.ds.adt.sequential.Queue;
import edu.uoc.ds.adt.sequential.QueueArrayImpl;

public class PR0Queue {

    public final int CAPACITY = 10;

    private Queue<Integer> queue;

    public PR0Queue() {
        newQueue();
    }
    public void newQueue() {
        queue = new QueueArrayImpl<>(CAPACITY);
    }

    public void fillQueue() {
        int count = 0;
        int i = 1;

        while (count < 10) {
            if (isPrime(i)) {
                queue.add(i);
                count++;
            }
            i++;
        }
    }

    //Returns if "num" (integer) is a prime number
    public boolean isPrime(int num) {
        boolean prime = true;
        int count = 2;

        while (prime && count < num) {
            if (num % count == 0) {
                prime = false;
            }
            count++;
        }
        return prime;
    }
    public String clearFullQueue() {
        StringBuilder sb = new StringBuilder();
        char r;
        while (!queue.isEmpty()) {
            sb.append(queue.poll()).append(" ");
        }
        return sb.toString();
    }

    public Queue<Integer> getQueue() {
        return this.queue;
    }

}
