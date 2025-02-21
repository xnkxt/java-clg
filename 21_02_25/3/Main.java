class Person {
    String firstName;
    String lastName;

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }
}

class Employee extends Person {
    String jobTitle;
    int employeeId;

    @Override
    String getLastName() {
        return lastName + " (" + jobTitle + ")";
    }

    int getEmployeeId() {
        return employeeId;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.firstName = "John";
        emp.lastName = "Doe";
        emp.jobTitle = "Software Engineer";
        emp.employeeId = 101;

        System.out.println("Name: " + emp.getFirstName() + " " + emp.getLastName());
        System.out.println("Employee ID: " + emp.getEmployeeId());
    }
}
