package bankassignment;
import java.util.Scanner;
import java.util.logging.Logger;
public class Bank {
	private String name;
    private long acc;
    private int balance;
    static Logger l= Logger.getLogger("com.api.jar");
    public Bank(String n, long a, int b) {
        name = n;
        acc = a;
        balance = b;
    }
    public void balanceamount() {
    	l.info("Total Balance Amount :" + balance + "Rs");
    }
    public void deposit(int depositamount) {
    	l.info("The Deposited Amount is :" + depositamount + "Rs");
        balance = balance + depositamount;
    }
    public void withdraw(int withdrawamount) {
        if (withdrawamount < balance) {
        	l.info("Total Amount withdrawed :" + withdrawamount + "Rs");
           try
           {
        	balance = balance - withdrawamount;
           }
           catch(ArithmeticException e)
           {
        	   l.info("ArithmeticException found ");
           }
        } else {
        	l.info("Insufficient balance");
        }
    }
    public static void main(String[] args) {
    	
        Bank a = new Bank("Arun", 123456789123456789L, 1000);
        l.info("Name :" + a.name);
        l.info("Account Number :" + a.acc);
        l.info("Current Balance :" + a.balance);
        int check = 0;
        try
        {
        do {
        	l.info("Enter the mode of Transaction :");
            Scanner sc = new Scanner(System.in);
            String expression = sc.nextLine();
            switch (expression) {
                case "Deposit":
                	l.info("Enter the deposite Amount :");
                    int depositamount = sc.nextInt();
                    a.deposit(depositamount);
                    
                    break;
                case "Withdraw":
                	l.info("Enter the withdraw Amount :");
                    int withdrawamount = sc.nextInt();
                    a.withdraw(withdrawamount);
                    break;
                case "Balance":
                    a.balanceamount();
                    break;
                default:
                	l.info("Enter the valid transaction");
            }
            l.info("Enter 1 to proceed for next Transactio:");
            l.info("Enter 0 to end  Transaction:");
            int test = sc.nextInt();
            check = test;
        } while (check == 1);
        }
        catch(Exception e)
        {
        	l.info("Exception founded");
        }
        
        
    }
}
