/*Scenario: Software Marks: Initialization in a Banking System
In a banking system there is a requirement to initialize some crucial parameters
during the software's startup. The development team has designed a class named 
"BankingSystemInitializer" to manage this initialization process. The class contains 
static and non-static members to handle various aspects of the initialization.
Description:
To denote Bank ID create a variable as nonStaticBankid, BankName as nonStaticBankName
and bankbalance as nonStaticBankBalance, create a Static Inializer Block to print 
"initialization process has begun" and print "Banking Process has started," from 
anonymous block create a parameterised constructor to intialize all the Bank Details 
such as nonStaticBankid,nonStaticBankName and nonStaticBankBalance and print all the 
details of bank from a non-static method as "printBankDetails()" which must be invoked
from a main method
Sample input: 
			nonStaticBankid as 448742310873423262 nonStaticBankName as Fedral
			Bank of India. 
			nonStaticBankBalance as 98385354265735737
expected output:-
		initialization process has begun Banking Process has started,
Bank Details are:
BANK ID: 448742310873423262
BANK NAME: Fedral Bank of India.
BANK BALANCE:98385354265735737 
Thank YOU for using Fedral Bank of India.
*/


package mine;

public class Bank {
    String nonStaticBankid;
    String nonStaticBankName;
    double nonStaticBankBalance;
    public Bank(String nonStaticBankid,String nonStaticBankName,double nonStaticBankBalance)
    {
        this.nonStaticBankid=nonStaticBankid;
        this.nonStaticBankName=nonStaticBankName;
        this.nonStaticBankBalance=nonStaticBankBalance;
    }
    public void printBankDetails()
    {
        System.out.printf("Bank Details are:\n");
        System.out.printf("BANK ID:      %s\n", this.nonStaticBankid);
        System.out.printf("BANK NAME:    %s\n", this.nonStaticBankName);
        System.out.printf("BANK BALANCE: %.2f\n", this.nonStaticBankBalance);
    }
}

class BankingSystemInitializer {
    public static void main(String[] args) {
        String bankId = "448742310873423262";
        String bankName = "Fedral Bank of India";
        double bankBalance = 98385354265735737.0;
        BankingSystemInitializer.inializer(bankId, bankName, bankBalance);
    }

    public static void inializer(String nonStaticBankid,String nonStaticBankName,double nonStaticBankBalance) {
        System.out.println("initialization process has begun");
        System.out.println("Banking Process has started");
        Bank bank = new Bank(nonStaticBankid, nonStaticBankName, nonStaticBankBalance);
        bank.printBankDetails();
    }
}

