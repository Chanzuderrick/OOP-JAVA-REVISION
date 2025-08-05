public class App {
    public static void main(String[] args) throws Exception {
        /*
         * They help protect object data and add rules for accessing or modifying them
         * GETTERS = methods that make a file readable
         * SETTERS = methods that make a file writeable
        */

        Car car = new Car("Prado", "grey", 10000);

        car.setColor("blue");
        car.setPrice(0);
       // car.model = "Corvetter"; //we dont want the model to change easily so we use private attributes
        System.out.println(car.getModel() + " " + car.getColor() + " " + car.getPrice());
        
    }
}
