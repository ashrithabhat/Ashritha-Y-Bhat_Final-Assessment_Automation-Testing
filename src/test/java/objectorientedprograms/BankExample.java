package objectorientedprograms;
import java.util.*;

class BankDetails {  
	
    private String account_number;  
    private String name;  
    private String account_type;  
    private long balance;  
    
    Scanner sc = new Scanner(System.in); // To get input from user 
    
    //method to open new account  
    public void openAccount() {  
        System.out.print("Enter Account No: ");  
        account_number = sc.next();  
        System.out.print("Enter Account type: ");  
        account_type = sc.next();  
        System.out.print("Enter Name: ");  
        name = sc.next();  
        System.out.print("Enter Balance: ");  
        balance = sc.nextLong();  
    }  
    
    //method to display account details  
    public void showAccount() {  
        System.out.println("Name of account holder: " + name);  
        System.out.println("Account no.: " + account_number);  
        System.out.println("Account type: " + account_type);  
        System.out.println("Balance: " + balance);  
    }  
    
    //method to deposit money  
    public void deposit() {  
        long amount;  
        System.out.println("Enter the amount you want to deposit: ");  
        amount = sc.nextLong();  
        balance = balance + amount;  
    }  
    
    //method to withdraw money  
    public void withdrawal() 
    {
        long amount;  
        System.out.println("Enter the amount you want to withdraw: ");  
        amount = sc.nextLong();  
        if (balance >= amount) 
        {  
            balance = balance - amount;  
            System.out.println("Balance after withdrawal: " + balance);  
        }
        else 
        {  
            System.out.println("Your balance is less than " + amount + "\tTransaction failed...!!" );  
        }  
    }  
    
    //method to search an account number  
    public boolean search(String acc_number) 
    {  
        if (account_number.equals(acc_number)) 
        {  
            showAccount();  
            return (true);  
        }  
        return (false);  
    }  
}  


public class BankExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);  
        //create initial accounts  
        System.out.print("How many number of customers do you want to input? ");  
        int n = sc.nextInt();  
        BankDetails C[] = new BankDetails[n];  
        for (int i = 0; i < C.length; i++) {  
            C[i] = new BankDetails();  
            C[i].openAccount();  
        }  
        // loop runs until number 5 is not pressed to exit  
        int ch;  
        do {  
            System.out.println("\n ***Banking System Application***");  
            System.out.println("1. Display all account details \n 2. Search by Account number\n 3. Deposit the amount \n 4. Withdraw the amount \n 5.Exit ");  
            System.out.println("Enter your choice: ");  
            ch = sc.nextInt();  
            switch (ch) 
            {  
            	case 1:  
            		for (int i = 0; i < C.length; i++) 
                    {  
            			C[i].showAccount();  
                    }  
                    break;  
            	case 2:  
            		System.out.print("Enter account no. you want to search: ");  
                    String account_no = sc.next();  
                    boolean found = false;  
                    for (int i = 0; i < C.length; i++) 
                    {  
                    	found = C[i].search(account_no);  
                        if (found) 
                        {  
                        	break;  
                        }  
                    }  
                    if (!found) 
                    {  
                    	System.out.println("Search failed! Account doesn't exist..!!");  
                    }  
                    break;  
                case 3:  
                	System.out.print("Enter Account no. : ");  
                    String account_number = sc.next();  
                    found = false;  
                    for (int i = 0; i < C.length; i++) 
                    {  
                    	found = C[i].search(account_number);  
                     	if (found) 
                       	{  
                        	C[i].deposit();  
                           	break;  
                      	}  
                    }  
                    if (!found) 
                    {  
                    	System.out.println("Search failed! Account doesn't exist..!!");  
                    }  
                    break;  
                case 4:  
                    System.out.print("Enter Account No : ");  
                    String acc_number = sc.next();  
                    found = false;  
                    for (int i = 0; i < C.length; i++) 
                    {  
                    	found = C[i].search(acc_number);  
                        if (found) 
                        {  
                         	C[i].withdrawal();  
                            break;  
                        }  
                     }  
                     if (!found) 
                     {  
                    	 System.out.println("Search failed! Account doesn't exist..!!");  
                     }  
                     break;  
                case 5:  
                     System.out.println("See you soon...");  
                     break;  
            }  
         }  
         while (ch != 5);  
	}
}
