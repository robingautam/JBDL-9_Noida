package Synchronization.ProdConsProblem;

public class Consumer extends Thread{

    SharedData sharedData;

    Consumer(SharedData data){
        this.sharedData = data;
    }

    public void run(){
        for (int i=1;i<=10;i++){
            sharedData.consume();
        }
    }
}
