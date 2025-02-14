public class Figure {
    public String draw(String s) { // Returns a string message
        return "Figure Drawn";
    }

    public void draw(int s) { // Changed String to int for proper overloading
        System.out.println("Drawing with integer parameter: " + s);
    }

    public void draw(double f) { // This is fine as it has a different parameter type
        System.out.println("Drawing with double parameter: " + f);
    }

    public static void main(String[] args) {
        Figure fig = new Figure();
        System.out.println(fig.draw("Shape")); // Calls draw(String)
        fig.draw(10); // Calls draw(int)
        fig.draw(5.5); // Calls draw(double)
    }
}
