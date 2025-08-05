public class App {
    public static void main(String[] args) throws Exception {
        
        /*
        Polymorphism
        its whereby objects can identify as other objects
        objects can be treated as objects of a common superclass
        
        */
        
        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        car.go();
        bike.go();
        boat.go();

        //lets say we want to use an array
        Vehicle[] vehicles = { car, bike, boat }; //vehicle[ ] is the data type
        for (Vehicle vehicle : vehicles) {
            vehicle.go();
        }
    }
}
