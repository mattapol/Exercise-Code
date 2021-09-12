public class Cars{
  // Variables
  private String model;
  private int speed;

  // Constructor
  public Cars(String model, int speed) {
      this.model = model;
      this.speed = speed;
  }
  public String getModel(){
    return model;
  }
  public int getSpeed(){
    return speed;
  }
  public boolean isFast(){
    if (speed > 200) {
      return true;
    }else {
      return false;
    }
  }
}
