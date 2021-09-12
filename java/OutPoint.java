public class OurPoint{
    private double x ;
    private double y ;
    public OurPoint(){
      x = 0.0 ;
      y = 0.0 ;
    }
    public OurPoint(double x,double y){
      this.x = x;
      this.y = y;
    }
      public double getX(){
        return x;
      }
      public double getY(){
        return y;
      }
      public void setX(double x){
        this.x = x;
      }
      public  void setY(double y){
        this.y = y;
      }
      public String toString(){
        return "["+x+","+y+"]";
      }
      public boolean equals(OurPoint point){
        if(point.getX()==x){
          return true;
        }
        else{
          return false;
        }
      }
      public double distance(OurPoint point){
        double sult1 = point.getX()-x;
        double sult2 = point.getY()-y;
        double a = (sult1*sult1)+(sult2*sult2);
        double Sult = Math.sqrt(a);
        return Sult;
        }
      }
