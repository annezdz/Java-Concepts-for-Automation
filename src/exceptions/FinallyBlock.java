package exceptions;

public class FinallyBlock {

    public static void main(String[] args) {

        try{
            // DB Connection
            // Executing some queries
            // validating the data and comparing from websites
            // closing connection
            int i[] = new int[4];
            i[5] = 100;
            System.out.println("Close DB Connection in Try Catch Block");
        }catch (Throwable e){

            System.out.println("Error occurred");
        }
        finally {
            System.out.println("Closing the DB Connection in Finally Block");
        }
    }
}
