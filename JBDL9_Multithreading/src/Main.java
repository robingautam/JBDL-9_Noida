import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) throws InterruptedException {

     /*   System.out.println("starting of main thread");

        Thread thread = new MyTask();
        thread.setName("Robin");
        thread.start();
        thread.join();
        System.out.println("Ending of main thread");*/

      /*  RunnableThread runnableThread = new RunnableThread();

        Thread thread1 = new Thread(runnableThread);

        thread1.start();*/

        CallableThread callableThread = new CallableThread();
        FutureTask<Integer> futureTask = new FutureTask<>(callableThread);
        Thread thread = new Thread(futureTask);
        thread.start();
      //  Thread.sleep(1000);
      //  System.out.println(futureTask.cancel(true));
        System.out.println(futureTask.isDone());

    }
}