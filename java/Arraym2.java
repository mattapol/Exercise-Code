import java.util.*;
public class Arraym2 {
  public static int[]  getExamMarks (){
    Scanner sc= new Scanner(System.in);


    int arrayMark[] = new int[10];
    for ( int i=0 ; i < arrayMark.length ; i++ )  {

    System.out.print("In put your score : ");
    arrayMark[i] = sc.nextInt();

  }
    return arrayMark;
}
      public static int[] increaseMarks(int xIn[]){
          int arrSize = xIn.length ;
          for ( int z = 0 ; z < arrSize ;z++){
            xIn[z] = xIn[z]+5 ;
          }
            return xIn;
          }
      public static void main(String[] args){
        int[] javaStudents = getExamMarks();
        System.out.println(Arrays.toString(javaStudents));
        System.out.println(Arrays.toString(increaseMarks(javaStudents)));

      }
}
