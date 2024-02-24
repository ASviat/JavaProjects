public class Account {

    private int accountNumber;
    private int accountBalance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositingFundIntoAccount(int depositingAmount) {
        if (depositingAmount <= 0) {
            System.out.println("Error. You can't deposit negative or zero value!");
        } else {
            this.accountBalance += depositingAmount;
        }

    }

    public void withdrawingFundFromAccount(int withdrawingAmount) {
        if (withdrawingAmount <= 0) {
            System.out.println("Error. You can't withdraw negative or zero value!");
        } else {
            if (accountBalance - withdrawingAmount <= 0) {
                System.out.println("Error. You don't have enough money to withdraw such amount.");
            } else {
                accountBalance -= withdrawingAmount;
                System.out.println("Thanks for using our service!\nAccount Balance is: " + accountBalance);
            }
        }
    }

}
