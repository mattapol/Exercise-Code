class UnderGrad extends Student {
   public UnderGrad(String name) {
      super(name);
   }
   public void calGrade() {
        int total = 0;
        for (int i = 0; i < NUM_OF_TESTS; i++) {
           total += test[i];
        }
        if (total / NUM_OF_TESTS >= 70) {
           grade = "pass";
        }
        else {
           grade = "fail";
        }
    }
  public String toString(){
      return "UG: " + name + ", Grade: " + grade;
  }
}
