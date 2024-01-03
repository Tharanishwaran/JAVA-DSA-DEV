public class Human {
    
    int age;
    String name;
    int salary;
  static  long population; //we change this from non static to static

    public Human(int age,String name,int salary){

    this.age = age;
    this.name = name;
    this.salary = salary;

     Human.population += 1; //access static variable we should use classs name but it also works when we use this.

    }





}
