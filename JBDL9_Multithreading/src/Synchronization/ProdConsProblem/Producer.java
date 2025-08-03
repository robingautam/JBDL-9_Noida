package Synchronization.ProdConsProblem;

public class Producer extends Thread{

    SharedData sharedData;

    Producer(SharedData data){
        this.sharedData = data;
    }

    public void run(){
        for (int i=1;i<=10;i++){
            sharedData.produce(i);
        }
    }
}
