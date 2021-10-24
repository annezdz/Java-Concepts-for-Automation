package package2;

import package3.Test;

public class Test2 extends Test{


    /*
    * Inheritance - one class object will inherit other class properties
    *
    * extends, implements
    * A extends B (B is the child) A is the parent
    *
    * */
    public static void main(String[] args) {

        Test2 obj = new Test2();

        //System.out.println(obj.privateVariable);
        System.out.println(obj.publicVariable);
        System.out.println(obj.protectedVariable);
//        System.out.println(obj.defaultVariable);
    }
}
