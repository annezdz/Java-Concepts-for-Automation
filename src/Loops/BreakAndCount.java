package Loops;

public class BreakAndCount {

    public void go(){
        System.out.println("First");
        //break;
        System.out.println("Last");
        //continue;

        // continue to the next cycle
    }

    public static void main(String[] args) {

//        BreakAndCount breakAndCount = new BreakAndCount();
//        breakAndCount.go();

        for(int i = 0; i < 10; i++){
            if(i > 0){
                System.out.println(i);
                 continue;
            }
        }
    }
}
