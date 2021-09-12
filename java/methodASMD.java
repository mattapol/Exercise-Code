import java.util.Scanner;
public class methodASMD {

  public static int addition(int x,int y){
        return x+y;
  }
  public static int submission(int x,int y){
        return x-y;
  }
  public static int multiple(int x,int y){
        return x*y;
  }
  public static int division(int x,int y){
        return x/y;
  }


  public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      System.out.print("Input your first number :");
      int x=sc.nextInt();
      System.out.print("Input your second number :");
      int y=sc.nextInt();
      System.out.println("Choose your operation by type number");
      System.out.println("Press 1 addition (+)");
      System.out.println("Press 2 submission (-)");
      System.out.println("Press 3 multiply (X)");
      System.out.println("Press 4 division (/)");
      System.out.print("Operator to do: ");
      int po=sc.nextInt();
      switch (po) {
        case 1 :
          System.out.println("Result = " + addition(x,y) );
          break;
          case 2 :
          System.out.println("Result = " + submission(x,y) );
          break;
          case 3 :
          System.out.println("Result = " + multiple(x,y) );
          break;
          case 4 :
          System.out.println("Result = " + division(x,y) );
          break;
          default:
            System.out.println("Error plase choose 1-4");
      }

  }
}
