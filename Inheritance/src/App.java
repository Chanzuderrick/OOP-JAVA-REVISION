public class App {
    public static void main(String[] args) throws Exception {
        //inheritance = one class inherits attributes from another class
        //i.e child <- parent

        Dog dog = new Dog();
        Cat cat = new Cat(9);
        Plant plant = new Plant();

        plant.alive();
        System.out.println("The cat has " + cat.lives + " lives");
        cat.eat();
        System.out.println("solution:" + cat.isAlive);
        System.out.println("solution:" + plant.isAlive);
        dog.speak();
        cat.speak();
        cat.breathe();
        




    }
}
