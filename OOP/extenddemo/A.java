package extenddemo;

public interface A {
    
    // static methods in interface should always have a body 
//    this static method call via interface name in main class
    static void hello(){

        System.out.println("hi hello");
    }
    
    void fun();

    default void ab(){


    }

}
