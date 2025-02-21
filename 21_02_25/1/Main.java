class Employee {
    void work() {
        System.out.println("Employee is working.");
    }

    double getSalary() {
        return 50000; // Default salary
    }
}

class HRManager extends Employee {
    @Override
    void work() {
        System.out.println("HR Manager is managing employees.");
    }

    void addEmployee() {
        System.out.println("HR Manager is adding a new employee.");
    }
}

public class Main {
    public static void main(String[] args) {
        HRManager hr = new HRManager();
        hr.work();
        hr.addEmployee();
        System.out.println("Salary: " + hr.getSalary());
    }
}
