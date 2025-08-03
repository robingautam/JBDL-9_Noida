public class MyTask extends Thread{

    @Override
    public void run(){
    /*    try {
            this.join();
        }
        catch (Exception ex){ // deadlock like situation

        }*/
        for (int i=1;i<=10;i++){

            System.out.println(i+" inside the  thread: "+Thread.currentThread().getName());
        }
        //System.out.println("Starting a new Thread..."+Thread.currentThread().getName());
    }
}
