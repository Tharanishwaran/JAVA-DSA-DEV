import java.util.Scanner;

public class FibonacciNumbers {
    
public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);


System.out.println("enter an integer :");

int n = sc.nextInt();

int a = 0,b = 1,count = 2;

while (count <= n){
int temp = b;

b = b+a;
a = temp;
count++;}

System.out.println(b);

}}
