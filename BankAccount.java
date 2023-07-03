public class BankAccount {
   //States
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private boolean isAccountActive;
    private String accountType;
    private String branchName;
    private String branchCode;
    private String phoneNumber;
    private String email;
    private String address;
    private int transactionCount;
    private String currency;
    private boolean hasChequeBook;
    private String accountOpenDate;
    private String lastTransactionDate;
    private String statementAddress;
	private int pinCode;
    private double availableCredit;
    private double totalCreditLimit;
    private boolean isSavingsAccount;

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
