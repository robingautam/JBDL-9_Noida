package Synchronization;

public class NetBankingTwo extends Thread{

    Account account;
    double withdrawamnt ;
    NetBankingTwo(Account account, double withdraw){
        this.account = account;
        this.withdrawamnt = withdraw;
    }

    @Override
    public void run() {
        account.withdrawAmount(withdrawamnt);
    }
}
