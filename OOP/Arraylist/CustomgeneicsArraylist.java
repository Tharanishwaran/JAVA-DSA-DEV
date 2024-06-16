package Arraylist;

import java.util.Arrays;

//wildcards \/
// public class CustomgeneicsArraylist<T extends Number > {
// while T only allows number types and its sub class like float double

//   public void getList(List<Number> list) {

// //   here you can only pass Number type not sub class types

//   }

// public void getList(List <? extends Number> list) {

    //   now you can  pass Number type and sub class types
    
    //   }


public class CustomgeneicsArraylist<T> {
 

 
private Object[] data;

 private static int DEFAULT_SIZE = 10;

 private int size = 0;

 public CustomgeneicsArraylist(){


  this.data = new Object[DEFAULT_SIZE];

 }

 public void add(T num){

    if(isfull()){
 
      resize();   
           
    }

  data[size++] = num;

 }

private void resize() {

  Object[] temp = new Object[data.length + 1];


    
//   copy the current item in the new array

 for (int i = 0; i < data.length; i++) {

    temp[i] =  data[i];

    
 }
 
 data = temp;

}

private boolean isfull() {
    
   return size == data.length;
        
    }


 public T remove(){

T removed = (T) data[--size];

   return removed;

    }

public T getbyindex(int index){

  return (T)data[index];

}
 

public void set(int index,int value){
 
    data[index] = value;


}

@Override
public String toString(){

return "customArrayist{"+"data="+Arrays.toString(data)+
", size=" + size + "}";

}

public static void main(String[] args) {

    CustomArraylist list = new CustomArraylist();

    list.add(21);
    list.add(22);
    list.remove();

    System.out.println(list);


    CustomgeneicsArraylist<Integer> list2 = new CustomgeneicsArraylist<>();

    list2.add(3);

     

}
    
}



    

