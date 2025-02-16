package thread;
import java.util.ArrayList;
import java.util.List;


public class PrimeSumThread extends Thread {
    private final int start, end;

    public PrimeSumThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        long sum = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        PrimeSumCalculator.addToTotalSum(sum);
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

