package inheritanceabstractclassinterface.Tugas2;

/**
 *
 * @author Maolana
 */

public class Circle extends Shape { // Save as "Circle.java"
 // private instance variable, not accessible from outside this class
    private double radius;
    private String color;
    private boolean filled;
  
 // Constructors (overloaded)
 /*Accessor*/
    public Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius = radius;
    }
    public Circle(double r, String c){
        this.radius = r;
        this.color = c;
    }
  
 /** Constructs a Circle instance with default value for radius and color */
    public Circle() { // 1st (default) constructor
        radius = 1.0;
        color = "red";
    }
  
 /** Constructs a Circle instance with the given radius and default color */
    public Circle(double r) { // 2nd constructor
        radius = r;
        color = "red";
    }

 /** Returns the radius */
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
  
 /** Returns the area of this Circle instance */
    public double getArea() {
        return radius*radius*Math.PI;
    }
  
 /** Return a self-descriptive string of this instance in the form of Circle[radius=?,color=?] */
    @Override
    public String toString() {
        return "Circle[Shape[radius=" + radius + ", color=" + color + ", filled = " + filled + "]";
    }
}
