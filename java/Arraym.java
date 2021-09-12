import java.util.*;
public class Arraym {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] javastudents= getExamMark();
    javastudents=increaseMarks(javastudents);
    javastudents=allHavePassed(javastudents);
  }
  private static int[] getExamMark(){
  int n =10;
    int[] tmpMark= new int[10];
    Scanner sc = new Scanner(System.in);
    for(int i=0; i<n; i++){
      System.out.print("input number : ");
      tmpMark[i] = sc.nextInt();
    }
    return tmpMark;
  }
  private static int[] increaseMarks(int[]javastudents)
  {
    for (int i=0; i<10; i++)
    {
      javastudents[i]= javastudents[i]+5;
      System.out.println("mark is : "+ javastudents[i]);

    }
    return javastudents;
  }
  private static int[] allHavePassed (int[]javastudents)
  {
    int ap=0;
    for (int i=0; i<10; i++)
  {
  if (javastudents[i]>=40)
  {
   ap=1;
  }
  else
  {
    ap=0;
    break;
  }
  }
  if (ap==1)
 {
  System.out.print("allHavePassed");
}
else{
  System.out.print("som one drop");
}
return javastudents;
}
}
