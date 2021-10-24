package equals;

public class SingleTonTest {

    private static SingleTonTest instance = new SingleTonTest();

    private SingleTonTest(){

        System.out.println("Creating object");
    }

    public static SingleTonTest getInstance(){
        return instance;
    }
}
