public class Point
{

   private double x;
   private double y;

   public Point (double x, double y)
   {
      this.x = x;
      this.y = y;
   }

   public double getX() { return x; }
   public double getY() { return y; }

   public double getRadius()
   {
      double i = (x * x) + (y * y);
      double sr = Math.sqrt(i);
      return sr;
   }

   public double getAngle() { return Math.atan2(y, x); }

   public Point rotate90() 
   {
      double newX = - y;
      double newY = x;
       return new Point (newX, newY); 
   }

}
