public class App {
    public static void main(String[] args) throws Exception {
        /*
        super= refers to parent class
        its used in constructors and method overriding
        calls the parent constructor to initialize attributes

        */
        Person person = new Person("Derrick", "Chanzu");
        Student student = new Student("patrick", "spongebob", 34.5);
        Employee employee = new Employee("samuel","jackson",1001,30000);
        person.showName();
        student.showName();
        System.out.println(student.grade);
        student.showGrade();
        employee.showSalary();
        



    }
}
