package intefaces;

public class Cdplayer implements Media{

    @Override
    public void start() {
      
        System.out.println("music starts");
    }

    @Override
    public void stop() {
       
     System.out.println("music stops");

    }
    



}
