//fixed code
abstract class Figure {
    int x, y;

    void changePosition(int newX, int newY) { 
        System.out.println("Changing position to X: " + newX + ", Y: " + newY);
    }
    
    abstract void draw(); // Abstract method must be overridden
}

class CircleObject extends Figure {
    @Override
    void draw() {
        System.out.println("Draw Method Called for Circle");
    }
}

class RectangleObject extends Figure {
    @Override
    void changePosition(int newX, int newY) { // Overriding non-abstract method
        System.out.println("Change Position Method Called for Rectangle");
    }

    @Override
    void draw() {
        System.out.println("Draw Method Called for Rectangle");
    }
}

// Main class to test the program
public class Main {
    public static void main(String[] args) {
        Figure circle = new CircleObject();
        circle.draw();  // Calls overridden draw() method in CircleObject

        Figure rectangle = new RectangleObject();
        rectangle.draw();  // Calls overridden draw() method in RectangleObject
        rectangle.changePosition(5, 10);  // Calls overridden changePosition() method
    }
}
