public class App {
    public static void main(String[] args) throws Exception {
        /*
        INTERFACES
        Its a blueprint for a class that specifies a set of abstract methods that 
        implementing classes must define.
        supports multiple inheritance like behaviour
        
        You can implement more than one interface. Thats the main difference between abstraction and interfaces
        
        */
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();
        rabbit.flee();
        hawk.hunt();
        fish.flee();
        fish.hunt();
    }
}
