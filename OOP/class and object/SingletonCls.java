public class SingletonCls {
    
private SingletonCls(){


}

 private static SingletonCls instances;

 public static SingletonCls getinstances(){

  if(instances == null){

    instances = new SingletonCls();

}

    return instances;

 }


}
