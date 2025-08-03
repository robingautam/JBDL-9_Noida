package Synchronization;

public class Table extends Thread{

    Printer printer;
    int number;

    Table(Printer printer, int num){
        this.printer = printer;
        this.number = num;
    }


    public void run(){
        printer.print(number);
    }

}
