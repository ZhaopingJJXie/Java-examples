package ocp.synch;

class Account{
  private int balance = 50;
  public int getBalance(){return balance;}
  public void withdraw(int amount){
    balance = balance - amount;
  }
}
public class AccountDanger implements Runnable{
  private Account acct = new Account();

  public static void main(String[] args){
    AccountDanger r = new AccountDanger();
    Thread one = new Thread(r, "Jojo");
    Thread two = new Thread(r, "Tine");
    one.start();
    two.start();
  }

  public void run(){
    // synchronized(acct){
    for (int x = 0; x < 5; x++){
      makeWithdrawl(10);
      if(acct.getBalance() < 0){
        System.out.println("account is overdrawn!");
      }
    }
  }
// }
  synchronized private void makeWithdrawl(int amt){
    if(acct.getBalance() >= amt){
      System.out.println(Thread.currentThread().getName()
      + " is going to withdraw");
      try{
        Thread.sleep(500);
      }catch(InterruptedException e){
        System.out.println("sleep interrupted!");
      }
      acct.withdraw(amt);
      System.out.println(Thread.currentThread().getName() +
      " completes the withdrawal");
    }else{
      System.out.println("not enough in the acccount for  " +
      Thread.currentThread().getName() + " to withdraw " + acct.getBalance());
    }
  }
}
