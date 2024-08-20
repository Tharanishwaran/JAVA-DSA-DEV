

public class LL {


   private Node head;
   private Node tail;
   private int size;

   public LL(){
    
    this.size = 0;


   }

   public void insertFirst(int val){
 
     Node node =  new Node(val);
     
     node.next = head;
    
     head = node;

     if (tail == null) {
        
        tail = head;
     }

     size += 1;
    }
        
public void insertLast(int val){

  if (tail == null) {

    insertFirst(val);
    return;
    
  }

  Node node = new Node(val);
  tail.next = node;
  tail = node;
  size++;


} 

   public void insert(int val,int index){

    if(index == 0 ){

      insertFirst(val);
      return;
}  
 if (index == size) {
    
      insertLast(val);
      return;
}
   
   Node temp = head;
   
   for (int i = 1; i < index; i++) {
         temp = temp.next;
    }

    Node node = new Node(val,temp.next);
    temp.next = node;
    
    size++;


   }

  public Node get(int index) {
        
    Node node = head;
        
    for(int i = 0; i < index; i++) {
            
      node = node.next;
      
    }
        
        return node;
    }


  public int deleteFirst() {
    if (head == null) {
        
        return -1;
    }
   int val = head.Value;
   head = head.next;
    size--;
    if (head == null) {
      tail = null;
      
    }
    return val;
   
}
   
  public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.Value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

   public void displayLL(){

    Node temp = head;

    while (temp != null) {

      System.out.print(temp.Value + " -> ");
        
      temp = temp.next;
    }

   System.out.println("END");
  }

   private class Node{

          private int Value;
          private Node next;


          public Node(int Value){

             this.Value = Value;

          }

        public Node(int Value,Node next){

          this.Value = Value;

          this.next = next;



        }  

   }
     
}
