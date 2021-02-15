public class LoyaltyCard implements IScan, IPay{
    private String barCode;
    private String vendor;
    private int balance;


    public LoyaltyCard(String barCode, String vendor, int balance) {
        this.barCode = barCode;
        this.vendor = vendor;
        this.balance = balance;
    }

    public String getVendor() {
        return this.vendor;
    }

    public String scan() {
        return this.barCode;
    }

    public int getBalance() {
        return this.balance;
    }

    public int pay(int fee) {
        return this.balance -= fee;
    }
}
