package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        System.out.println(gcd(first, second));
    }

    public int gcd (int first, int second) {
        if (second == 0)
            return first;

        return gcd(second, first % second);
    }

}
