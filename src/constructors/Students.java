package constructors;

public class Students {

        /*
        * Constructors have same name as of the ClassName
        *
        * Types of constructor:
        *
        * default constructor
        * no-arg constructor
        * parameterized constructor
        *
        * Constructor must use the name of Class only and not any other name
        * COnstructor must not contain any return type, otherwise it will become a method
        * The main use of constructors is to initialize the instance variables
        *
        * */

    String name;   //global variable
    String rollNumber;

    public Students(String studentName, String rollNum){  //local variable
        this(); // -----> isso chama o construto Default
        this.name = studentName;       //this name (global) is equals this local variable
        this.rollNumber = rollNum;
    }

    public Students(){
        System.out.println("Calling constructor");
    }




    public static void main(String[] args) {

        Students st = new Students("Anne", "123");
        System.out.println(st.name);
        System.out.println(st.rollNumber);

//        new Students();
//        new Students("Anne", "123");
//        System.out.println(st.name);
//        System.out.println(st.rollNumber);

        Test test = new Test();
    }
}
