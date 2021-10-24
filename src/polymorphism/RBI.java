package polymorphism;

public class RBI {

//    public void getHomeLoanROI(String bankName){
//
//    }
//
//    public void getHomeLoanROI(String bankName, int amount){
//        System.out.println("Mudando a ordem das assinaturas do método ," +
//                "mesmo os parametros sendo iguais sendo igual");
//    }
//
//    public void getHomeLoanROI(int amount, String bankName){
////  Webdriver driver = new FirefoxDriver(); --> polymorphism and inheritance
//    }

    public double getHomeLoanROI(){
        return 8.5;
    }

    public double getCarLoanROI(){
        return 10.5;
    }

    public RBI getObject(){
        RBI obj = new RBI();
        return obj;
    }

//    public Integer show(){
//        return 10;
//    }

    public Number show(){
        return 10;
    }
}
