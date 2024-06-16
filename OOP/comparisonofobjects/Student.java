package comparisonofobjects;

public class Student implements Comparable<Student>{


    int rollno;
    
    int marks;

    Student(int rollno,int marks){

    this.rollno = rollno;

    this.marks = marks;

    }

    @Override
   public String toString(){

     return marks + " " + rollno;

   }


    @Override
    public int compareTo(Student o) {
     
        System.out.println("in compare");
        int diff = this.marks - o.marks;

        // if diif == 0; means both are equal;

        // if diff < 1: means o is bigger else 0 is smaller

        return diff;
    }
    
}
