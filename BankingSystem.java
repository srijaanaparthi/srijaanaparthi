class BankAccount{
    int accountNumber;
    String accountHolder;
    double balance;
    BankAccount(int accountNumber,String accountHolder,double balance)
    {
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
        this.balance=balance;
    }
}
    public class BankingSystem
    {
       public static void searchAccount(BankAccount[] accounts,int searchNumber)
       {
           int i=0;
           while(i<accounts.length){
           if(accounts[i].accountNumber==searchNumber)
           {
              System.out.println("Account found:");
              System.out.println("Account Number:"+accounts[i].accountNumber);
              System.out.println("Account Holder:"+accounts[i].accountHolder);
              System.out.println("balance: $"+accounts[i].balance);
           }
           i++;
        }
           System.out.println("Account not found");
       }
       public static void main(String[]args)
       {
           BankAccount[] accounts={
               new BankAccount(101,"Alice",5000),
               new BankAccount(202,"bob",10000),
               new BankAccount(303,"Charlie",7500),
               new BankAccount(404,"David",8000)
           };
          System.out.println("Search Account Number: 303");
          searchAccount(accounts,303);
          System.out.println("Search Account Number :909");
          searchAccount(accounts,909);
       }
    }

