package Shapes;

import java.awt.*;
public class Square extends Rect {
    public Square(int width, Point position, Color colour) {
        // Call the Shapes.Rect constructor - width and height are the same
        super(width, width, position, colour);
    }

}