package Synchronization.ProdConsProblem;

public class SharedData {

    int data;


    public void produce(int data){
        this.data = data;
        System.out.println("produced: "+data);
    }

    public void consume(){
        System.out.println("Consumed: "+this.data);
    }



}
