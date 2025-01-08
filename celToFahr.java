import java.util.*;
 public class celToFahr{
 
 public static void main(String[] args){
 
 Scanner sc= new Scanner(System.in);
 int tempInCel=sc.nextInt();
 
 int temp =(tempInCel*9/5)+32;
 
 System.out.println(" TEMPERATURE IN CELCIUS = "+temp);
}
}