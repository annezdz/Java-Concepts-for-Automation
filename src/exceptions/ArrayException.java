package exceptions;

public class ArrayException {
    public static void main(String[] args) {

        System.out.println("Beginning");
        try{
            int[] i = new int [4];
            i[5] = 100;

            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println("Error occurred");
            e.printStackTrace();

            /*
            * Screenshot
            * Send email attached screenshot and print error message in mail subject
            * */
        }


        System.out.println("Ending");
    }
}
