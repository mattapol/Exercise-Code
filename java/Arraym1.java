import java.util.*;
public class Arraym1 {
  public static int[] getExamMarks () {
    Scanner sc = new Scanner(System.in);

    int a=10;
    int[] arrayMark = new int[10];
    for ( int i=0 ; i < a ; i++ )  {

    System.out.print("In put your score : ");
    arrayMark[i] = sc.nextInt();

  }
    return arrayMark;
}
      public static void main (String[] args) {
        int[] javaStudents = getExamMarks();
        System.out.println(Arrays.toString(javaStudents));


      }
}
