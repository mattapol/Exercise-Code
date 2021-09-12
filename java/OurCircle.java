public class OurCircle{
  private OurPoint center;
  private double radius;
  public OurCircle(){
    radius = 0.0;
  }
  public OurCircle(OurPoint center,double radius){
    this.center = center;
    this.radius = radius;
  }
  public OurPoint getCircle(){
    return center;
  }
  public double getRadius(){
    return radius;
  }
  public void setCenter(){
    this.center = center;
  }
  public void setRadius(double radius){
    this.radius = radius;
  }
  public String toString(){
    return "center@ "+"["+center+"]"+"radius: "+radius;
  }
  public double getArea(){
    return  (double)22/7*(radius*radius);
  }
  public double getCircumfernce(){
    return (double)2*22/7*radius;
  }
}
