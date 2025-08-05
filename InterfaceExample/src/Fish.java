
public class Fish implements Prey, Preditor { // A class can inherit two parent classes. 
    //thats the main difference between inheritance and interfaces
    @Override
    public void flee() {
        System.out.println("The fish is swimming away");

    }
    
    @Override
    public void hunt() {
        System.out.println("The fish is hunting");
        
    }

}
