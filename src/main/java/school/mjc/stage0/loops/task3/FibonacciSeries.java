package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        for (int i = 1; i <= lastFibonacci; i++) {
            System.out.println(fibonacci(i));
        }
    }

    public int fibonacci (int n) {
        if (n == 1) return 0;
        if (n == 2) return 1;

        return fibonacci(n-1) + fibonacci(n-2);
    }
}
