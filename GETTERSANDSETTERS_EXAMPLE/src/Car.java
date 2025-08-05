public class Car {
    private String color; //since they are private we cant normally access them outside of the class
    private int price;
    private String model; // we dont want our model to change so it wont have a setter method

    Car(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }
    
    @Override
    public String toString() {
        return this.model + " " + this.color + " " + this.price;
    }

    //GETTERS AND SETTERS
    //getter

    String getModel() {
        return this.model;
    }

    String getColor() {
        return this.color;
    }
    
    String getPrice() {
        return "kshs" + " " + this.price; //we can also add additional logic
    }
    
    //setter methods
    void setColor(String color) {
        this.color = color;

    }
    
    void setPrice(int price) {
        //this.price = price;
        if (price <= 0) {
            System.out.println("price cannot be zero or less than 0");
            
        } else {
            this.price = price;
        }
    }

}
