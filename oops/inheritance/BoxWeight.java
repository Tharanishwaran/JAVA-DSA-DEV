package inheritance;

public class BoxWeight extends Box {
 
 double d;   
double weight;

BoxWeight(){

    this.weight = weight;
}







BoxWeight(double l,double h,double w,double weight){

// super is used to initalise values present in parent class

super(l,h,w); //call the parent class constructor if we can use this then this Boxweight constructor calls the dafult constructor of Box() not calls the this Box(double l,double h,double w)

//also we can use super like this 
//  super.l = l; // but if l is private in Box class then we cant access l like this format so we use privous format super(l,h,w) beause its calls the cosntructor of box
//  super.h = h;
//  super.w = w;

  this.weight = weight;
  //this.d = d;

}


BoxWeight(BoxWeight other){

super(other);

  weight = other.weight;

}


// BoxWeight(double a,double b,double c){



// }






}
