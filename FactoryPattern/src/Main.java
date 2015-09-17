
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ShapeFactory shapeFactory = new ShapeFactory();
        
        Shape circle = shapeFactory.getShape("CIRCLE");
        Shape square = shapeFactory.getShape("SQUARE");
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        
        ArrayList<Shape> shapes = new ArrayList();
        
        shapes.add(circle);
        shapes.add(square);
        shapes.add(rectangle);
        
        for(Shape shape : shapes)
        {
            shape.draw();
        }
    }
}