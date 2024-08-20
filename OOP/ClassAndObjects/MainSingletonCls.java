public class MainSingletonCls {
    
  public static void main(String[] args) {
    

  SingletonCls obj1 = SingletonCls.getinstances();

  SingletonCls obj2 = SingletonCls.getinstances();
  
  SingletonCls obj3 = SingletonCls.getinstances();

  //different refernce variables but point to same instance so in the memory there is only one object 

  }


}
