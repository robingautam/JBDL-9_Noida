import java.util.concurrent.Callable;

public class CallableThread implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        Thread.sleep(5000);
        System.out.println("Callable thread started....");
        return 1;
    }
}
