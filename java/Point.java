import java.util.*;
public class Point {
  public static void main(String [] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("***Enter Number***");
    double x=sc.nextDouble();
    if(x>=80) {
      System.out.println("----A----");
    }else if(x>=75&&x<=79) {
      System.out.println("----B+----");
    }else if(x>=70&&x<=74) {
      System.out.println("----B----");
    }else if(x>=65&&x<=69) {
      System.out.println("----C+----");
    }else if(x>=55&&x<=64) {
      System.out.println("----C----");
    }else if(x>=50&&x<=54) {
      System.out.println("----D+----");
    }else if(x>=45&&x<=49) {
      System.out.println("----D----");
    }else {
      System.out.println("----F----");
    }System.out.println("GOOD LUCK");
 }
}
