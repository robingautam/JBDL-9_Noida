package Synchronization;

public class NetBankingOne extends Thread{

    Account account;
    double withdrawamnt ;
    NetBankingOne(Account account, double withdraw){
        this.account = account;
        this.withdrawamnt = withdraw;
    }

    @Override
    public void run() {
        account.withdrawAmount(withdrawamnt);
    }
}
