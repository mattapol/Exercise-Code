import java.util.*;
public class methodradius {
  public static float sum(float y) {
    return 3.142f*y*y;
  }
  public static void main(String[] arg) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Input you radius : ");
    float a=sc.nextFloat();
    System.out.println("area ="+sum(a));
  }
}
