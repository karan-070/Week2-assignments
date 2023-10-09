// Define an abstract class named Employee
abstract class Employee {
    String name;
    int salary;

    // Declare an abstract method for calculating salary
    abstract public int calculateSalary();

    // Constructor to initialize name and salary
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getter method to retrieve the name of the employee
    public String getName() {
        return name;
    }

    // Getter method to retrieve the salary of the employee
    public int getSalary() {
        return salary;
    }
}

// Define a class Manager that extends the Employee class
class Manager extends Employee {
    public Manager(String name, int salary) {
        super(name, salary);
    }

    // Implement the calculateSalary method for managers
    public int calculateSalary() {
        return getSalary();
    }
}

// Define a class Designer that extends the Employee class
class Designer extends Employee {
    public Designer(String name, int salary) {
        super(name, salary);
    }

    // Implement the calculateSalary method for designers
    public int calculateSalary() {
        return getSalary();
    }
}

class Main {
    public static void main(String[] args) {
        // Create instances of Manager and Designer
        Designer designer = new Designer("Bob", 60000);
        Manager manager = new Manager("Alice", 80000);
        // Print the salary of each employee
        System.out.println(manager.getName() + "'s Salary: $" + manager.calculateSalary());
        System.out.println(designer.getName() + "'s Salary: $" + designer.calculateSalary());
    }
}
