import java.awt.*;

public class Main {
    public static void main(String[] args) {


        System.out.println("\n___________test 1___________\n");

        Shape shape = new Shape("yellow",false);
        Circle circle = new Circle("black",true,4.75);
        Rectangle rectangle = new Rectangle("blue",false,5.25,5.25);
        Square square = new Square("red",false,2.25);
        System.out.println(shape.toString());
        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
        System.out.println(square.toString());


        System.out.println("\n___________test 2___________\n");
        shape.setFilled(true);
        circle.setColor("blue");
        circle.setRadius(2.7);
        rectangle.setColor("red");
        rectangle.setFilled(true);
        rectangle.setWidth(12);
        square.setColor("blue");

        System.out.println(shape.toString());
        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
        System.out.println(square.toString());

        System.out.println("\n___________test 3___________\n");

         shape = new Shape();
         circle = new Circle(6.3);
         rectangle = new Rectangle(4.25,5.25);
         square = new Square(2);

         rectangle.setColor("blue");
         rectangle.setFilled(true);
         square.setColor("black");

         System.out.println(shape.toString());
         System.out.println(circle.toString());
         System.out.println(rectangle.toString());
         System.out.println(square.toString());





    }
}