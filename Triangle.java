public class Triangle{

  //Private instance variables
  private Point v1, v2, v3;
  private double s1, s2, s3;

  //Constructors
  public Triangle(Point a, Point b, Point c){
    v1 = a; v2 = b; v3 = c;
  }

  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
    v1 = new Point(x1, y1);
    v2 = new Point(x2, y2);
    v3 = new Point(x3, y3);
  }

  //Triangle methods
  //Helper function to get side lengths
  public void getSideLengths(){
    s1 = v1.distanceTo(v2);
    s2 = v2.distanceTo(v3);
    s3 = v3.distanceTo(v1);
  }

  public double getPerimeter(){
    this.getSideLengths();
    return s1 + s2 + s3;
  }

}
