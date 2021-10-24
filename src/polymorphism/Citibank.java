package polymorphism;

import com.sun.jdi.PathSearchingVirtualMachine;

public class Citibank extends RBI{

    public static void main(String[] args) {

        Citibank city = new Citibank();
        System.out.println(city.getHomeLoanROI());
       // RBI city1 = new Citibank(); Pai para filho OK
        // Citibank city1 = new RBI(); Filho para pai não
    }

    public double getHomeLoanROI(){
        return 10.5;
    }

    public Integer show(){
        return 10;
    }
}
