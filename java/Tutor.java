import java.util.*;
public class Tutor
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int x,hour,y1,y2,y3,y4,y5;
    System.out.println("1 Student 500 bath/hour");
    System.out.println("2 Students 450 bath/hour");
    System.out.println("3 Students 400 bath/hour");
    System.out.println("4 Students 350 bath/hour");
    System.out.println("5 or more Students 300 bath/hour");
    System.out.println("Students");
    x = sc.nextInt();
    System.out.println("Hour");
    hour = sc.nextInt();
    if(x==1){
      x=500*hour;
    }else if(x==2){
      x=450*hour;
    }else if(x==3){
      x=400*hour;
    }else if(x==4){
      x=350*hour;
    }else if(x>=5){
      x=300*hour;
    }
    System.out.println("check bill 1");
    y1 = sc.nextInt();
    System.out.println("Change");
    System.out.println(y1-x);

    System.out.println("check bill 2");
    y2 = sc.nextInt();
    System.out.println("Change");
    System.out.println(y2-x);

    System.out.println("check bill 3");
    y3 = sc.nextInt();
    System.out.println("Change");
    System.out.println(y3-x);

    System.out.println("check bill 4");
    y4 = sc.nextInt();
    System.out.println("Change");
    System.out.println(y4-x);

    System.out.println("check bill 5");
    y5 = sc.nextInt();
    System.out.println("Change");
    System.out.println(y5-x);
  }
}
