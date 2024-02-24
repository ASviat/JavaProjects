public class Main {

    public static void main(String[] args) {
        Account account = new Account();
        account.depositingFundIntoAccount(0);
        account.depositingFundIntoAccount(-1);
        account.depositingFundIntoAccount(20000);
        System.out.println(account.getAccountBalance());

        account.withdrawingFundFromAccount(21000);
        account.withdrawingFundFromAccount(1200);
    }
}
