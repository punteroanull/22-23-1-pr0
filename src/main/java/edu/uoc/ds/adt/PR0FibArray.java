package edu.uoc.ds.adt;

public class PR0FibArray {
    int[] fibArray = new int[20];
    public PR0FibArray() {
        populate();
    }

    public int[] getArray() {
        return fibArray;
    }
    public int getIndexOf(int e) {
        int index = 0;
        int i = 1;
        while (index < fibArray.length) {
            System.out.println("[element = " + e + "] getIndexOf iterations: " + i);
            i++;
            if (fibArray[index] == e) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public int binarySearch(int e) {
        int lo = 0;
        int hi = fibArray.length - 1;
        int i = 1;
        while (lo <= hi)
        {
            System.out.println("[element = " + e + "] binarySearch iterations: " + i);
            i++;
            int mid = lo + (hi - lo) / 2;
            if (e < fibArray[mid]) {
                hi = mid - 1;
            }
            else if (e > fibArray[mid]) {
                lo = mid + 1;
            }
            else return mid;
        }
        return -1;
    }

    private void populate() {
        for (int i = 0; i < 20; i++) {
            fibArray[i] = getFibonacci(i);
            //System.out.println(i + " -> Fibonacci: " + fibArray[i]);
        }
    }
    private int getFibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return getFibonacci(n - 1) + getFibonacci(n - 2);
        }
    }
}
