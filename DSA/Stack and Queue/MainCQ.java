public class MainCQ {


public static void main(String[] args) throws Exception {
    


    CircularQueue queue = new CircularQueue(5);
    queue.insert(3);
    queue.insert(6);
    queue.insert(5);
    queue.insert(19);
    queue.insert(1);

   
    
//  System.out.println(queue.remove());
    
    queue.insert(88);

    queue.insert(80);

    queue.display();










    
}

}