package reflectionExample;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Home {

    public static void main(String[] args) {

        /*
        * Test ---> Object ---> Class object
        * method ---> get executed ---> Method
        * constructor ---> called ---> Constructor
        * */
        ReflectionEx ex = new ReflectionEx();
        Class clasz = ex.getClass();
        System.out.println(clasz.getSimpleName());
        Constructor[] cons = clasz.getDeclaredConstructors();
        System.out.println(cons.length);

        for(Constructor constr : cons){
            System.out.println(constr.getName());


//        Method[] arrayOfMethods = clasz.getDeclaredMethods(); //informa somente o numero de metodos da classe
//        System.out.println(clasz.getMethods().length); //informa tbm o numero de metodos da superclasse
//        System.out.println(arrayOfMethods.length);
//
//
//        for(Method m : arrayOfMethods){
//            System.out.println("Method: " + m.getName() + " Return Type: " + m.getReturnType());
//
//            Parameter[] params = m.getParameters();
//
//            for(Parameter par : params){
//                System.out.println(par.getName());
//            }

        }
    }
}
