package polymorphism;

public class HSBC extends RBI
{
    public static void main(String[] args) {
        HSBC hsbc = new HSBC();
        System.out.println(hsbc.getHomeLoanROI());
    }

    public double getHomeLoanROI(){
        return 10.25;
    }

    public AmericanExpress getObject(){
        AmericanExpress obj = new AmericanExpress();
        return obj;
    }



}
