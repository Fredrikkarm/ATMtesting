package machine;

import request.ATMrequest;
import person.Person;

public class ATM {
    private Bank bank;
    
    public ATM(Bank bank) {
        this.bank = bank;
    }
    
    public String getPerson(ATMrequest atmRequest){
        Person person = bank.getPerson(atmRequest.getCreditCard().getIdNumber());
        return person.getFirstName() + " " + person.getLastName();
    }

    public String attemptLogin(ATMrequest atmRequest){
        if (atmRequest.getCreditCard().getPin().equals(atmRequest.getPinInput())){
            return "Logged in successfully";
        }
            return loginTries(atmRequest);
    }

    public String loginTries(ATMrequest atmRequest) {
        int attempts = bank.attemptedLoginTries(atmRequest.getCreditCard().getIdNumber());

        if(attempts == 1){
            //attempts = attempts +1;
            return "1/3 wrong attempts";
        }
        else if(attempts == 2){
            //attempts = attempts +1;
            return "2/3 wrong attempts";
        }
        else if (attempts == 3){
            //attempts = attempts +1;
            return "3/3 wrong attempts, make sure last one is correct";
        }
        else{
            return "too many attempts, you will be blocked";
        }
    }

    public String cardStatus(ATMrequest atmRequest){
        if(bank.creditCardStatus(atmRequest.getCreditCard().getIdNumber())){
            return "Login Accessed";
        }
        else{
            return "Login Blocked";
        }
    }

    public int getAmount(ATMrequest atmRequest){
        if(atmRequest.getCreditCard().isAccessedLoggedIn())
            return bank.getMoney(atmRequest.getCreditCard().getIdNumber());
        else{
            return 0;
        }
    }

    public void deposit(ATMrequest atmRequest, Integer amountToAdd){
        bank.deposit(atmRequest.setDeposit(amountToAdd));
    }

    public String withdraw(ATMrequest atmRequest){
        if (getAmount(atmRequest) >= atmRequest.getWithdraw()){
            bank.withdrawMoney(atmRequest.getWithdraw());
            return "Amount withdrawn: " + atmRequest.getWithdraw();
        }
        else{
            return "You don't have enough money on your account to withdraw that amount, try again";
        }
    }

    public String getBank(ATMrequest atmRequest){
        return bank.getBank(atmRequest.getCreditCard().getIdNumber());
    }


}
