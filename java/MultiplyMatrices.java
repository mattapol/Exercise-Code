public class MultiplyMatrices {
  public static void main(String[] args) throws Exception {
    int row1 = 2, col1 = 3;
    int row2 = 3, col2 = 2;
    int[][] a ={{3,-2,5},{3,0,4}};
    int[][] b ={{2,3},{-9,0},{0,4}};
    //Multiply two Matrices
    int[][] product = new int[row1][col2];
    for(int i=0 ; i < row1; i++) {
      for(int j=0 ; j < col2; j++) {
        for(int k=0; k < col1; k++) {
           product[i][j] += a[i][k] * b[k][j];
        }
      }
    }
    // Displying the result
    System.out.println("Sum of two Matrices is: ");
    for(int[] row : product) {
      for(int colum : row) {
        System.out.print(" | "+column + " | ");
      }
      System.out.println();
    }         
  }
}
