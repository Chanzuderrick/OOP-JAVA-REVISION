public abstract class Shape{
    abstract double area(); //need to be implemented by the children classes
    void display(){ //concrete method
        System.out.println("This is a shape");
    }
}