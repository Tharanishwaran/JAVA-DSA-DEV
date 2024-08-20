package intefaces;

// import intefaces.Jet.Jetengine;

public class Supercar {
    
private Engine engine;
 
private Media  player = new Cdplayer();

public Supercar(){

  
    engine = new Powerengines();

}

 public Supercar(Engine engine){


   this.engine = engine;

 }

 public void start(){
     engine.start();

 }

 public void stop(){
     engine.stop();

 }

 public void startMusic(){
     player.start();

 }

 public void stopMusic(){
     player.stop();

 }


 public void upgradeEngine(){

      this.engine = new Electricengine();

 }



}
