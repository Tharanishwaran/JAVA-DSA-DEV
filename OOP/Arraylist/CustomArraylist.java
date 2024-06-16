package Arraylist;

import java.util.Arrays;

import java.lang.*;

public class CustomArraylist {
    


 private int[] data;

 private static int DEFAULT_SIZE = 10;

 private int size = 0;

 public CustomArraylist(){


  this.data = new int[DEFAULT_SIZE];

 }

 public void add(int num){

    if(isfull()){
 
      resize();   
           
    }

  data[size++] = num;

 }

private void resize() {

  int[] temp = new int[data.length + 1];

}

private boolean isfull() {
    
   return size == data.length;
        
    }


 public int remove(){

int removed = data[--size];

   return removed;

    }

public int getbyindex(int index){

  return data[index];

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


}
    
}


