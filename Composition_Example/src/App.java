public class App {
    public static void main(String[] args) throws Exception {
        /*
        Composition
        it represents a part of relationship between objects
        for example an engine is a part of a car
        allows complex objects to be constructed from smaller objects



        */

        //if I delete the car class then it will be affected

        Car car = new Car("Corvetter", 2023,"v8");
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);
        car.start();
    }
}
