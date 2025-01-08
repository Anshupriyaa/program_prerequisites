import java.util.*;
public class Perimeter{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int length=sc.nextInt();
int breadth=sc.nextInt();
int perimeter = 2*(length+breadth);
System.out.println("perimeter of a rectangle = " + perimeter);
}
}