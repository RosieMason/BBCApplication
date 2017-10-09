  package module1;
  public class Simple {

    public double quadratic(double x, double y) {
      double d;
      double a = 2.0;
      double b = 3.0;
      double c = 5.0;
      d = a*x*x + b*y + c;
      return d;
    }

    public static void main (String[] args) {
      // Instantiate Simple object:
      // explained in module 2
      Simple myS = new Simple();

      double xx = 2.0;
      double yy = 4.0;
      double gg = myS.quadratic(xx, yy);

      System.out.println("xx = "+xx);
      System.out.println("yy = "+yy);
      System.out.println("ff = "+gg);
      
      System.out.println(5451234 % 5441234);
      
    }
  }