public class DebitCard extends CreditCard implements IScan{
    //private String cardNumber;
    private int sortCode;
    private int accountNumber;
    //private String expiryDate;
    //private int securityNumber;

    public DebitCard(String cardNumber, int sortCode, int accountNumber, String expiryDate, int securityNumber, int balance) {
        super(cardNumber, expiryDate, securityNumber, balance);
        //this.cardNumber = cardNumber;
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
        //this.expiryDate = expiryDate;
        //this.securityNumber = securityNumber;
    }



    public int getSortCode() {
        return this.sortCode;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }



    public String scan() {
        return "Payment Complete";
    }
}
