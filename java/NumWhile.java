import java.util.*;
public class NumWhile {
 public static void main(String[] args) {
   int x;
   Scanner sc=new Scanner(System.in);
   System.out.print("num :");
   x=sc.nextInt();
   while(x%2!=0&&x%3!=0) {
     x=sc.nextInt();
   }
 }
}
