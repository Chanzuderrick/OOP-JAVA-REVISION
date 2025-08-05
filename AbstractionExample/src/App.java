public class App {
    public static void main(String[] args) throws Exception {
       /*
       Abstraction
       used to define abstract classes and methods
       abstraction is the process of hiding implementation details and showing only essential features
       Abstract classes can't be instantiated directly
       can contain abstract methods(which must be implemented)
       can contain concrete methods (which are inherited)
       */
     // Shape shape = new Shape(); it will bring an error because its abstract. We don't want people to create shape objects
     Circle circle = new Circle(3);
     Triangle triangle = new Triangle(4,5);
     Rectangle rectangle = new Rectangle(6,7);

     circle.display();
     triangle.display();
     rectangle.display();

     System.out.println(circle.area());
     System.out.println(triangle.area());
     System.out.println(rectangle.area());
     
     
    }
}
