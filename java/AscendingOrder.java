import java.util.Scanner;
public class AscendingOrder{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] a  = new int[5];
    int b = 0;
    while (b<5) {
      a[b] = sc.nextInt();
      b++;
    }
    if (a[0]<a[1]&&a[1]<a[2]&&a[2]<a[3]&&a[3]<a[4]) {
    System.out.print("Y");
  }else {
    System.out.print("N");
  }
  }
}
