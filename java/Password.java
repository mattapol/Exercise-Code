import java.util.*;
public class Password {
	public static void main(String[] args) {
    final int SECRET = 321;
    int num;
    Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number :");
		num=sc.nextInt();
  while(num != SECRET) {
     System.out.println("Wrong number, try again");
     num=sc.nextInt();
     }
     System.out.print("Well done, right number");
	}
}
