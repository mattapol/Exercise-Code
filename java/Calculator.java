public class Calculator {
  public static int sum(int[] numbers) {

     int sum = 0;
     for (int i = 0; i < numbers.length; i++) {
       sum = sum + numbers[i];
     }
     return sum ;
  }
  public static double average(int[] numbers) {
    double avg = 0;
    for(int i = 0; i < numbers.length; i++) {
      avg = (avg + numbers[i]);
    }
    avg = avg/numbers.length;
    return avg;
  }
  public static double sum(double[] numbers) {

     double sum = 0;
     for (int i = 0; i < numbers.length; i++) {
       sum = sum + numbers[i];
     }
     return sum ;
  }
}
