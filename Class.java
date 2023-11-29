package oops;

public class ClassAndObject {
    

public static void main(String[] args) {
    

    Cars car; //declaration of obj also known as refernce variable

    car = new Cars(); //initializtion of obj 

     
    System.out.println(car.nameofcar);
     System.out.println(car.price);
    System.out.println(car.airbags);
    System.out.println(car.speed);
    System.out.println(car.modelno);

}
   





}



class Cars{

String nameofcar = "audi"; //instance - is known as variables inside the class

int modelno = 5110;

float price = 10000.00f;

int speed =  50;

boolean airbags = true;



}









