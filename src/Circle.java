public class Circle extends Shape{

    private double radius;

    public Circle() {
        this.radius = 1.00;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
       if (radius<=0){
           System.out.println("Radius must be greater than 0");
       }else
            this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {

        return "A Circle with radius " + radius + " which is a subclass of "+super.toString();
    }

}
