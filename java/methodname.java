import java.util.*;
public class methodname {
  public static void myNameIs(String x) {
   System.out.println("My name is "+ x);
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("What my nane?");
    String disply=sc.nextLine();
    myNameIs(disply);
   }
 }
