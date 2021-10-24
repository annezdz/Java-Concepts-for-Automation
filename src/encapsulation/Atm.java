package encapsulation;

public class Atm {

    public static void main(String[] args) {

        Bank obj = new Bank();
        obj.updatePin(123456,123,88);
        obj.withDrawAmount(123456, 2222, 1000);
    }
}
