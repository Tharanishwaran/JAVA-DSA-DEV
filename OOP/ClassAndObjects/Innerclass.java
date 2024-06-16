public class Innerclass {

     static class Test1{

       String name;

      public Test1(String name){
        
        this.name =  name;
      }

        @Override
         
        public String toString(){


            return name;
        }
      

    }

    public static void main(String[] args) {
        
    
        Test1 obj1 = new Test1("ak");

        // System.out.println(obj1.name);

        Test1 obj2 = new Test1("akash");

        System.out.println(obj1.name);
        System.out.println(obj2.name);

        System.out.println(obj1);

    }
}
