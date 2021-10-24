public class MethodCalling {

    /*
    * static component --> cannot give a call to non static component
    * static --> call static
    * non static --> call non static and static (allowed)
    * non static components cannot be called without making an object
    * static --> OO We cannot do inheritance, polymosrphism , if static
    *
    * Compile
    * Executed ---> JVM look for main method
    * */


    public static void go3(){
        System.out.println("Inside Go3 Method");

    }
    public static void go(){
        System.out.println("Inside Go Method");
        go2();
        System.out.println("after calling go2 method");
    }
    public static void go1(){
        System.out.println("Inside Go1 Method");
        go();
        System.out.println("after calling go method");

    }

    public static void go2(){
        System.out.println("Inside Go2 Method");
    }

    public static void main(String[] args) {

       MethodCalling methodCalling = new MethodCalling();
       methodCalling.go1();
        System.out.println("After calling go 1");
//        methodCalling.go();
//        methodCalling.go1();
//        methodCalling.go2();

        // methodCalling.go3(); non static
        // go3(); static


    }
}
