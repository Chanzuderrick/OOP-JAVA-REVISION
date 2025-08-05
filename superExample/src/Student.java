public class Student extends Person {
    double grade;

    Student(String firstName, String lastName, double grade) {
        super(firstName, lastName);
        this.grade = grade;

    }
    
    void showGrade() {
        System.out.println("Your grade is: "+this.grade);
    }
    

}
