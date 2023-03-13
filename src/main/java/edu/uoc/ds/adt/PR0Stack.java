package edu.uoc.ds.adt;


import edu.uoc.ds.adt.sequential.Stack;
import edu.uoc.ds.adt.sequential.StackArrayImpl;

public class PR0Stack {

    // Capacitat màxima de la seqüència.
    public final int CAPACITY = 10;

    private Stack<Integer> stack;

    public PR0Stack() {
        newStack();
    }

    public void newStack() {
        stack = new StackArrayImpl<Integer>(CAPACITY);
    }


    public void fillStack() {
        int count = 0;
        int i = 1;

        while (count < 10) {
            if (isPrime(i)) {
                stack.push(i);
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
    public String clearAllStack() {
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty())
            sb.append(stack.pop()).append(" ");
        return sb.toString();
    }

    public Stack<Integer> getStack() {
        return this.stack;
    }
}
