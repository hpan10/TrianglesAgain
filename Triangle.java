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
  //Helper functions to get side lengths
  public void getSideLengths(){
    s1 = v1.distanceTo(v2);
    s2 = v2.distanceTo(v3);
    s3 = v3.distanceTo(v1);
  }

  public void getRoundedSideLengths(){
    s1 = (double) Math.round(v1.distanceTo(v2) * 10000) / 10000;
    s2 = (double) Math.round(v2.distanceTo(v3) * 10000) / 10000;
    s3 = (double) Math.round(v3.distanceTo(v1) * 10000) / 10000;
  }

  public double getPerimeter(){
    getSideLengths();
    return s1 + s2 + s3;
  }

  public double getArea(){
    double s = getPerimeter()/2;
    return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
  }

  public String classify(){
    getRoundedSideLengths();
    if (s1 == s2 && s1 == s3) return "equilateral";
    if (s1 == s2 || s1 == s3 || s2 == s3) return "isosceles";
    return "scalene";
  }

  //toString method override
  public String toString(){
    return "v1(" + v1.getX() + ", " + v1.getY() + ") v2(" + v2.getX() + ", " + v2.getY() + ") v3(" + v3.getX() + ", " + v3.getY() + ")";
  }

  //mutator
  public void setVertex(int index, Point newP){
    if (index == 0) v1 = newP;
    else if (index == 1) v2 = newP;
    else if (index == 2) v3 = newP;
  }

}
