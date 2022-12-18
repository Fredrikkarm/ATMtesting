package request;

import person.CreditCard;

public class ATMrequest {
    private CreditCard creditCard;
    private String pinInput;
    private int withdraw;
    private int deposit;
    private int amount;

    public ATMrequest(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public ATMrequest(CreditCard creditCard, String pinInput) {
        this.creditCard = creditCard;
        this.pinInput = pinInput;
    }

    public ATMrequest(CreditCard creditCard, int amount) {
        this.creditCard = creditCard;
        this.amount = amount;
    }

    public ATMrequest(CreditCard creditCard, String pinInput, int withdraw, int deposit) {
        this.creditCard = creditCard;
        this.pinInput = pinInput;
        this.withdraw = withdraw;
        this.deposit = deposit;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public int getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
        amount -= withdraw;
        //return withdraw;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getDeposit() {
        return deposit;
    }

    public int setDeposit(int deposit) {
        this.deposit = deposit;
        amount += deposit;
        return deposit;
    }

    public String getPinInput() {
        return pinInput;
    }

    public void setPinInput(String pinInput) {
        this.pinInput = pinInput;
    }
}
