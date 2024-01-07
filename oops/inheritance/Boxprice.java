package inheritance;

public class Boxprice  extends BoxWeight{
    

double cost;

Boxprice(){


    super();
    this.cost =-1;
}

Boxprice(Boxprice other){

    super(other);

    this.cost = other.cost;

}


public Boxprice(double l,double h,double w,double weight,double cost){

 super(l ,h, w, weight);

 this.cost = cost;




}


}


