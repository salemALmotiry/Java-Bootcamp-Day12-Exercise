public class Rectangle extends Shape {

    private double width;
    private double height;



    public Rectangle() {
        this.width = 1.00;
        this.height = 1.00;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
      if (width<=0){
          System.out.println("Invalid width");
      }else
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
      if (height<=0){
          System.out.println("Invalid height");
      }else
        this.height = height;
    }

    public double getArea() {
        return 2*(width * height);
    }

    public double getPerimeter() {
        return 2 * width + 2 * height;
    }

    @Override
    public String toString() {

        return "A Rectangle with width "+ this.width +" and height "+ this.height+" which is a subclass of "+super.toString();
    }




}
