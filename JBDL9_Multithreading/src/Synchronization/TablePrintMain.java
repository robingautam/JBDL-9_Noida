package Synchronization;

public class TablePrintMain {

    public static void main(String[] args) {
        Printer printer = new Printer();

        Table t1 = new Table(printer,2);
        Table t2 = new Table(printer,3);

        t1.start(); t2.start();
    }
}
