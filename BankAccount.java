public class BankAccount {
   //States
    public String accountNumber;
    public String accountHolderName;
    public double balance;
    public boolean isAccountActive;
    public String accountType;
    public String branchName;
    public String branchCode;
    public String phoneNumber;
    public String email;
    public String address;
    public int transactionCount;
    public String currency;
    public boolean hasChequeBook;
    public String accountOpenDate;
    public String lastTransactionDate;
    public String statementAddress;
	public int pinCode;
    public double availableCredit;
    public double totalCreditLimit;
    public boolean isSavingsAccount;

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, double balance,boolean isAccountActive, String accountType, String branchName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.isAccountActive = isAccountActive;
        this.accountType = accountType;
        this.branchName = branchName;
    }

    // Behaviours
    public void deposit() {
    }

    public void withdraw() {
    }

    public void getBalance() {
    }

    public void activateAccount() {
    }

    public void deactivateAccount() {
    }
	
	public void transfer(){
	}
	
    public void changeAccountHolderName() {
    }

    public void updatePhoneNumber() {
    }

    public void updateEmail() {
    }

    public void updateAddress() {
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", "Shravan D", 1000.0, true, "Savings", "Main Branch");
		System.out.println(account);
		System.out.println(account.accountNumber);
		System.out.println(account.accountHolderName);
		System.out.println(account.balance);
		System.out.println(account.isAccountActive);
		System.out.println(account.accountType);
		System.out.println(account.branchName);
    }
}
