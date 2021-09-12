import java.util.*;
public class Comshop {
  public static void main(String []args) {
    Scanner sc=new Scanner(System.in);
    double Monitor=79.99,Keyboard=29.99,Mouse=19.99,DVDROM=39.99,Printer=69.99,FlashDrive=19.99,a,c;
    char b;
      System.out.println("==========Welcome to Comshop==========");
      System.out.print("Monitor,price : 79.99 $ -How many- : ");
      a=sc.nextDouble();
  
      c=Monitor*a;
      System.out.print("Do you like to know the total price?(y/n) : ");
      b=sc.next().charAt(0);

      if(b=='y') {
        System.out.println("---Total so far--- : "+c);
      }
      System.out.print("Keyboard,price : 29.99 $ -How many- : ");
      a=sc.nextDouble();

      c=c+Keyboard*a;
      System.out.print("Do you like to know the total price?(y/n) : ");
      b=sc.next().charAt(0);

      if(b=='y') {
        System.out.println("---Total so far--- : "+c);
      }
      System.out.print("Mouse,price : 19.99 $ -How many- : ");
      a=sc.nextDouble();

      c=c+Mouse*a;
      System.out.print("Do you like to know the total price?(y/n) : ");
      b=sc.next().charAt(0);

      if(b=='y') {
        System.out.println("---Total so far--- : "+c);
      }
      System.out.print("DVDROM,price : 39.99 $ -How many- : ");
      a=sc.nextDouble();

      c=c+DVDROM*a;
      System.out.print("Do you like to know the total price?(y/n) : ");
      b=sc.next().charAt(0);

      if(b=='y') {
        System.out.println("---Total so far--- : "+c);
      }
      System.out.print("Printer,price : 69.99 $ -How many- : ");
      a=sc.nextDouble();

      c=c+Printer*a;
      System.out.print("Do you like to know the total price?(y/n) : ");
      b=sc.next().charAt(0);

      if(b=='y') {
        System.out.println("---Total so far--- : "+c);
      }
      System.out.print("FlashDrive,price : 19.99 $ - How many- : ");
      a=sc.nextDouble();

      c=c+FlashDrive*a;
      System.out.print("Do you like to know the total price?(y/n) : ");
      b=sc.next().charAt(0);

      if(b=='y') {
        System.out.println("---Total so far--- : "+c);
      }
      System.out.print("*******Thank You*******");
  }
}
