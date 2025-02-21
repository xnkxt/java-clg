class Employee {
    String name, address, jobTitle;
    double salary;

    double calculateBonus() {
        return salary * 0.1;
    }

    void generateReport() {
        System.out.println(name + " (" + jobTitle + ") - Report generated.");
    }
}

class Manager extends Employee {
    void manageProjects() {
        System.out.println(name + " is managing projects.");
    }
}

class Developer extends Employee {
    void writeCode() {
        System.out.println(name + " is coding.");
    }
}

class Programmer extends Developer {
    void debugCode() {
        System.out.println(name + " is debugging code.");
    }
}

public class Main {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "Alice";
        m.jobTitle = "Project Manager";
        m.salary = 70000;
        m.manageProjects();
        System.out.println("Bonus: " + m.calculateBonus());
    }
}
