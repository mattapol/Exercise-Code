import java.util.*;
public class Correct {
  public static void main(String[] args) {
  Scanner sc= new Scanner(System.in);
  int x;
  System.out.print("Number: ");
  x=sc.nextInt();
  x=x%3;
  if(x==0){
    System.out.println("Correct: ");
  }else{
    System.out.println("Incorrect: ");
   }
  }
}
