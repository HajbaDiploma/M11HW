import java.util.concurrent.atomic.AtomicLong;

public class FourthTask {

    private long a, c, m;
    private AtomicLong x;


    public FourthTask(long a, long m) {
        this.a = a;
        this.m = m;
    }

    public FourthTask() {
        this.a = 25214903917l;
        this.m =  2^48;
    }

    public FourthTask c(long c) {
        this.c = c;
        this.x = new AtomicLong(c);
        return this;
    }

    public int next() {
        return  (int) ( (a * x.getAndIncrement() +c) % m);
    }
}
