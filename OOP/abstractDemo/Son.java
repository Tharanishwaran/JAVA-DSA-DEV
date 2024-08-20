package abstractDemo;

public class Son extends Parent {



  public Son(int age){
    
    super(age);

    this.age = age;
   

  }


  public Son(Double pocket_money){
     
    super(pocket_money);

     this.pocket_money = pocket_money;

  }


    @Override
    void career() {
       
        System.out.println(" i want to be an soldier");

    }

    
    @Override
    void lifestyle(){

        System.out.println("i want normal life style");
    }

    
}
