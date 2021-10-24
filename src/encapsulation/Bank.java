package encapsulation;

public class Bank {

    public int accountNumber = 123456;
    private int punNumero = 123;
    private double balanceAmount = 1000;


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPunNumero() {
        return punNumero;
    }

    public void setPunNumero(int punNumero) {
        this.punNumero = punNumero;
    }

    public double getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(double balanceAmount) {
        this.balanceAmount = balanceAmount;
    }


    public void updatePin(int accNo, int onlPin, int newPin) {
        if (accNo == accountNumber && onlPin == punNumero) {
            punNumero = newPin;
            System.out.println("Pin changed successfully");
        } else {
            System.out.println("Invalid Credentials");
        }
    }

    public void withDrawAmount(int accNo, int pin, int amount) {
        if (accNo == accountNumber && pin == punNumero) {
            if (amount <= balanceAmount) {
                balanceAmount = balanceAmount - amount;
                System.out.println("Amount withDrawl = " + amount);
            } else {

                System.out.println("Insufficient Balance!");
            }
        } else {
            System.out.println("Invalid Credentials");
        }
    }

    public double depositCash(int accNo, int pin, double ammount) {
        if (accNo == accountNumber && pin == punNumero) {
            balanceAmount = balanceAmount + ammount;
            return balanceAmount;
        } else {
            System.out.println("Invalid Credentials");
            return balanceAmount;
        }

    }


}