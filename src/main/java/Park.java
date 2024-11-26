import Shapes.Circle;
import Shapes.Square;

import java.awt.*;

public class Park extends Canvas {
    // Declare the shapes - they can all be private as nothing else needs to access them
    private Circle circ1;
    private Circle circ2;
    private Square square1;

    public Park(Point Lion_Location,Point Keeper_Location,Point Drone_Location) {
        setSize(600, 600);
        setBackground(Color.white);
        circ1=new Circle(3, Lion_Location, Color.red);
        circ2=new Circle(2, Keeper_Location, Color.blue);
        square1=new Square(3, Drone_Location, Color.black);
    }

    public void paint(Graphics g) {
        // Draw the shapes
        circ1.draw(g);
        circ2.draw(g);
        square1.draw(g);
    }



}