public class AddMatrices {
  public static void main(String[] args) throws Exception {
    int[][] a ={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
    int[][] b ={{2,3,4},{5,6,7},{8,9,10},{11,12,13}};
    for(int i=0; i < a[i].length; i++) {
      for(int j=0 ; j< a[i].length; j++) {
        System.out.println("row" + (i+1) + "col" + (j+1) + ":" + (a[i][j] + b[i][j]));
      }
    }
  }
}
