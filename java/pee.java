import java.util.Scanner;
public class pee{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int x = sc.nextInt();
    for (int i=1;i<=x ;i+=1 ) {
      for (int j=1;j<=(x-i) ;j+=1 ) {
        System.out.print(" ");
      }
      for (int k=1;k<=(i*2)-1 ;k+=1 ) {
        System.out.print("x");
      }
      System.out.println();
    }
  }
}
