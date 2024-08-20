package abstractDemo;

public class Daughter extends Parent{

   public Daughter(int age){
   
    super(age);

    this.age = age;

    // System.out.println( age + 100);
    

   }
   
   
   public Daughter(Double pocket_money){

        
        super(pocket_money);
        
        this.pocket_money = pocket_money;

     
       }    

       @Override
        void career(){


        System.out.println(" i wan to be an doctor" );

    }

    @Override
    void lifestyle(){

     System.out.println("i want rich and luxury life style");

    }
    
}
