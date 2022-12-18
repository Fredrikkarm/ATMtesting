package person;

public class CreditCard {
    private String idNumber;
    private String user;
    private String pin;
    private boolean blockedLoggedIn;
    private boolean accessedLoggedIn;
    private int money;

    public CreditCard(String idNumber, String user, String pin) {
        this.idNumber = idNumber;
        this.user = user;
        this.pin = pin;

    }

    public boolean isBlockedLoggedIn() {
        return blockedLoggedIn;
    }

    public void setBlockedLoggedIn(boolean blockedLoggedIn) {
        this.blockedLoggedIn = blockedLoggedIn;
    }

    public boolean isAccessedLoggedIn() {
        return accessedLoggedIn;
    }

    public void setAccessedLoggedIn(boolean accessedLoggedIn) {
        this.accessedLoggedIn = accessedLoggedIn;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "idNumber='" + idNumber + '\'' +
                ", user='" + user + '\'' +
                ", money=" + money +
                '}';
    }


}
