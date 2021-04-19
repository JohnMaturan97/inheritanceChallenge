package academy.learnprogramming;

// Use to extend and inherit from Vehicle Class
public class Car extends Vehicle{

    //Create the fields
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManuel;

    private int currentGear;

    //This constructor was created top init the private fields
    public Car(String name, String size, int wheels, int doors, int gears, boolean isManuel) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManuel = isManuel;
        this.currentGear = 1;
    }

    //Create a setter to change gears
    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrent() to " + this.currentGear + "gear.");
    }

    //Create a method , with 2 parameters,  to call the move method **Noted I did not override move method**
    public void changeVelocity(int speed, int direction) {
        move(speed, direction);
        System.out.println("Car.changeVelocity() : Velocity " + speed + "Direction " + direction);
    }

}
