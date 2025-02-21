abstract class Person {
    abstract void eat();
    abstract void exercise();
}

class Athlete extends Person {
    @Override
    void eat() {
        System.out.println("Athlete eats a balanced diet.");
    }

    @Override
    void exercise() {
        System.out.println("Athlete exercises daily.");
    }
}

class LazyPerson extends Person {
    @Override
    void eat() {
        System.out.println("Lazy person eats junk food.");
    }

    @Override
    void exercise() {
        System.out.println("Lazy person rarely exercises.");
    }
}

public class Main {
    public static void main(String[] args) {
        Athlete a = new Athlete();
        a.eat();
        a.exercise();
    }
}
