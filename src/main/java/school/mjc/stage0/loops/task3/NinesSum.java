package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        sum = ((int)Math.pow(10, lengthOfLastNumber + 1) - 10)/9 - lengthOfLastNumber;
        System.out.println(sum);
    }
}
