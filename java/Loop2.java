import java.util.*;
public class Loop2 {
  public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("");
int x=sc.nextInt();
for (int i=1 ; i<=x ; i++ ){
  for(int j=1 ; j<=i ; j++ ){
    System.out.print("*");
  }
  System.out.println();
}
System.out.println();
  }

}
