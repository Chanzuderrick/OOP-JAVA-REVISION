import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       /*
       Runtime polymorphism
       when the method that gets executed is decided at runtime based on the actual type of the object.

       */
      Scanner derrick = new Scanner(System.in);
      Animal animal; //lets declare an animal object and not instantiate it

      System.out.print("Would you like a dog or a cat? [1 = cat and 2 = dog]:");
      int choice = derrick.nextInt();

      switch (choice) {
          case 1:
              animal = new Cat();
              animal.speak();
              break;

          case 2:
              animal = new Dog();
              animal.speak();
              break;

              default:
              System.out.println("invalid choice");
              break;
      }

      derrick.close();

    }
}
