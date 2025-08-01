class Bank{
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public void setDetail(int accnum,String accname,double bal){
        accountNumber=accnum;
        accountHolderName=accname;
        balance=bal;
    }
    public void deposit(double amount){
        if(amount<=0){
            System.out.println("deposit value is more than 0");
        }else{
            System.out.println("Added successfully");
            balance+=amount;
            System.out.println("& the Balance is :"+balance);
        }
    }
    public void withdraw(double with){
        if(with>balance){
            System.out.println("Not possible to withdraw");
        }else{
            balance-=with;
            System.out.println("Available balance is :"+balance);
        }
    }
    public int getAccNum(){
        return accountNumber;
    }
    public String getAccName(){
        return accountHolderName;
    }
    public double getbal(){
        return balance;
    }

}
public class bankmanagement {
    public static void main(String[] args) {
        Bank b=new Bank();
        b.setDetail(123,"rathod",1000);
        b.deposit(220.0);
        b.withdraw(500.0);
        System.out.println(b.getAccNum());
        System.out.println(b.getAccName());
        System.out.println(b.getbal());
    }
    
}