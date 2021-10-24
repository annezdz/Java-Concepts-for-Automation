package overriding1;

public class Child extends Parent{

    /*
    * Can we change the access modifier when overriding?
    *
    * Yes, but I cannot reduce the visibility
    *
    * public to private  (NO)
    * public to Default or protected (OK)
    *
    * Can we override static methods?
    * NO, method hiding
    *
    * */

    public void show(){

    }

    public void display(){

    }

    public static void main(String[] args) {
        Parent child = new Child();
        child.show();
        //child.display();
        child.add();

    }
}
