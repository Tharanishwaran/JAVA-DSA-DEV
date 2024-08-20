package intefaces;

public class Electricengine implements Engine {
    
    @Override   
    public void start(){
    
       System.out.println("electric engine starts");
    
    
    }



    @Override
    public void stop(){
    
       System.out.println("electric engine stops");
    
    
    }
    
     @Override
    public void accelerate(){
    
       System.out.println("electric engine accelerates");
    
    
    }

}
