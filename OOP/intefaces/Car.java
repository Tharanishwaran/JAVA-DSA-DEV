package intefaces;

public class Car implements Engine,Brake{


   int a =10;

    @Override
    public void brake() {

        System.out.println("i brake like a normal car");
    }

    @Override
    public void start() {
    System.out.println("i start like a normal car");

    }

    @Override
    public void accelerate() {
                System.out.println("i acc like a normal car");

    }

    @Override
    public void stop() {
               System.out.println("i stop like a normal car");

    }
    
}
