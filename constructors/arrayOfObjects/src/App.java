public class App {
    public static void main(String[] args) throws Exception {
        Car car1 = new Car("Mustang", "Red");
        Car car2 = new Car("Corvette", "Blue");
        Car car3 = new Car("Charger", "Yellow");
    

    //creating an array

    //Car[] cars = new Car[3];

    Car[] cars = { car1, car2, car3 }; //anonymous objects
    

    
    /*
     *     for (int i = 0; i < cars.length; i++) {
    cars[i].drive();
    }
    */
    
    for (Car car : cars) {
       car.drive();
        
    }
}

}
