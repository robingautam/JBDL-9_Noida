package Synchronization;

public class Account {

    double balance;

    /**
     * There are two levels of locking
     * 1. Class Level Locking
     * 2. Object Level Locking
     *
     * 1. Class level locks are acquired with the help of synchronization block, passong the class name in argument
     *
     * 2. Object level locks acquired when synchronized is used with method and synchronization block passing the object in argument
     *
     * **/
    public  void withdrawAmount(double amount){
        synchronized (Account.class) {
            this.balance = balance - amount;
            System.out.println("Final Balance: " + this.balance);
        }
    }
}
