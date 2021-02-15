public class CreditCard implements IScan, IPay{
    private String cardNumber;
    private String expiryDate;
    private int securityNumber;
    private int balance;
    private int overDraftLimit;
    private int combinedBalance;

    public CreditCard(String cardNumber, String expiryDate, int securityNumber, int balance, int overDraftLimit) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.securityNumber = securityNumber;
        this.balance = balance;
        this.overDraftLimit = overDraftLimit;
        this.combinedBalance = balance + overDraftLimit;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public String getExpiryDate() {
        return this.expiryDate;
    }

    public int getSecurityNumber() {
        return this.securityNumber;
    }

    public String scan() {
        return "Payment Successful";
    }

    public int getBalance() {
        return this.balance;
    }

    public int pay(int fee) {
       return this.balance -= fee;
    }

    public int getCombinedBalance() {
        return this.balance + this.overDraftLimit;
    }
}
