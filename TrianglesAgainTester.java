public class TrianglesAgainTester{

  public static void main(String[]args){

    //Creates points
    Point O = new Point(0,0);
    Point A = new Point(3,4);
    Point B = new Point(3,0);
    Point C = new Point(0,4);
    Point D = new Point(A);
    Point E = new Point(6,7);

    //Tests the get methods
    System.out.println("Testing get methods");
    System.out.println(A.getX()); //Should print 3.0
    System.out.println(A.getY()); //Should print 4.0
    System.out.println(D.getX()); //Should print 3.0
    System.out.println(D.getY()); //Should print 4.0
    System.out.println("-------------------");

    //Tests distanceTo
    System.out.println("Testing distanceTo");
    System.out.println(A.distanceTo(O)); //Should print 5.0
    System.out.println(B.distanceTo(A)); //Should print 4.0
    System.out.println(A.distanceTo(E)); //Should print 4.24264...
    System.out.println("------------------");

    //Tests equals
    System.out.println("Testing equals");
    System.out.println(A.equals(D)); //Should print true
    System.out.println(O.equals(A)); //Should print false
    System.out.println("--------------");

    //Creates triangles
    Triangle a = new Triangle(O,B,A);        //scalene
    Triangle b = new Triangle(0,0,5,0,5,12); //scalene
    Triangle c = new Triangle(0,0,8,0,4,12); //isosceles
    Triangle d = new Triangle(2,1,7,1,4.5,5.33012701892); // equilateral

    //Tests getPerimeter
    System.out.println("Testing getPerimeter");
    System.out.println(a.getPerimeter()); //Should return 12.0
    System.out.println(b.getPerimeter()); //Should return 30.0
    System.out.println("--------------------");

    //Tests getArea
    System.out.println("Testing getArea");
    System.out.println(a.getArea()); //Should return 6.0
    System.out.println(b.getArea()); //Should return 30.0
    System.out.println("---------------");

    //Tests classify
    System.out.println("Testing classify");
    System.out.println(a.classify()); //Should return scalene
    System.out.println(c.classify()); //Should return isosceles
    System.out.println(d.classify()); //Should return equilateral


  }

}
