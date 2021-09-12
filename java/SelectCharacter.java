import java.util.Scanner;
public class SelectCharacter{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();
    int b = sc.nextInt();
    if (b>a.length()) {
      System.out.print("error");
    }else {
      System.out.print(a.charAt(b-1));
    }
  }
}
