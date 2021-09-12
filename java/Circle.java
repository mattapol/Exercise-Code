class Circle extends Shape {
  private int redius = 0;
   public Circle(String colour, int redius) {
     super(colour);
     this.redius = redius;
   }
   public int getRedius() {
     return redius;
   }
}
