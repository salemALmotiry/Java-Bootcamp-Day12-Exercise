public class Square extends Rectangle{




    public Square() {
    }

    public Square(double side) {
        super.setHeight(side);
        super.setWidth(side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {

         if(side <= 0) {
             System.out.println("Side must be a positive number");
         }else {
             super.setWidth(side);
             super.setHeight(side);
         }

    }


    @Override
    public double getPerimeter() {
        return super.getHeight() * super.getWidth();
    }


    @Override
    public String toString() {
        return "A square with side of "+ getSide()+ " which is a subclass of "+super.toString();

    }


}
