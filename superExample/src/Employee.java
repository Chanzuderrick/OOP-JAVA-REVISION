public class Employee extends Person {
    int employeeID;
    double salary;

    Employee(String firstName, String lastName, int employeeID, double salary) {
        super(firstName, lastName);
        this.employeeID = employeeID;
        this.salary = salary;

    }
    
    void showSalary() {
        System.out.println(this.firstName +" " +this.lastName + "whose id is " +this.employeeID+ " salary is:" + this.salary);
    }

}
