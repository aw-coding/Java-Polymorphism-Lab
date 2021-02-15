public class CreditCard implements IScan, IPay{
    private String cardNumber;
    private String expiryDate;
    private int securityNumber;
    private int balance;

    public CreditCard(String cardNumber, String expiryDate, int securityNumber, int balance) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.securityNumber = securityNumber;
        this.balance = balance;
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
}
