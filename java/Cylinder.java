class Cylinder extends Circle {
  private int height = 0;

  public  Cylinder(String colour, int redius, int height) {
    super(colour,redius);
    this.height = height;
  }
  public int getHeight() {
    return height;
  }
}
