public class App {
    public static void main(String[] args){
        Student student1 = new Student("derrick", 23, 3.4);
        Student student2 = new Student("papa", 65, 3.5);

        System.out.println(student1.name);
        System.out.println(student2.name);
        System.out.println(student2.isEnrolled);
        student2.study();
    }
}
