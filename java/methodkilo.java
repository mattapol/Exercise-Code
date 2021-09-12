import java.util.*;
public class methodkilo {
  public static double sum(double x) {
    return x/2.2;
  }
  public static void main(String[] arg) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Input you pound : ");
    double x=sc.nextInt();
    System.out.print("kilo = "+sum(x));
  }
}
