import java.util.Scanner.*;
interface I
    {
        public void withdraw();
        public void deposit();
    }
        
class ATM implements I
    {
        public double amount = 20000.0;
        public void withdraw(double amount)
        {
          if(this.amount<amount)
          {
            System.out.println("Insufficient Balance!");
          }
          else
          {
            this.amount-=amount;
            balance();
          }
        }
        public void deposit(double amount)
        {
            this.amount+=amount;
            balance();
        }
        public void balance()
        {
            System.out.println("Balance Amount is: "+amount+" INR");
        }
    }
public class ATMSystem
{
    public static void main(String args[])
    {
        System.out.println("Welcome to ATM System\n");
        System.out.println("You can choose any one of the operation");
        ATM obj = new ATM();
        Scanner s = new Scanner(System.in);
        System.out.println("\n1.Withdraw\t2.Deposit\t3.Balance Enquiry\t4.Terminate Transaction");
        System.out.println("Enter your choice:");
        int choice;
        do
            {
                System.out.println("Enter your choice:");
                choice = s.nextInt();
                switch(choice)
                    {
                        case 1:
                            System.out.println("Enter the amount to withdraw:");
                            double Withdrawamount = s.nextDouble();
                            obj.withdraw(withdrawamount);
                            break;
                        case 2:
                            System.out.println("Enter the amount to Deposit:");
                            double Depositamount = s.nextDouble();
                            obj.deposit(Depositamount);
                            break;
                        case 3:
                            System.out.println("Processing Details");
                            obj.balance();
                            break;
                        case 4:
                            System.out.println("Terminating Transaction");
                            System.out.println("Transaction Successful");
                            System.exit(0);
                    }
            }
            while(choice<=4);
    }
}
