package academy.learnprogramming;

//Base Class
public class Vehicle {


    //Fields
    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    //constructor
    public Vehicle(String name, String size) {
        //Define parameter
        this.name = name;
        this.size = size;

        //Define
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer()" + currentDirection + "degrees.");
    }

    // applies to all vehicles // This is used to change the velocity and direction
    public void move(int velocity, int direction) {
        //Define the 2 parameters
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move() : Moving at" + currentVelocity + "in direction" + currentDirection);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }

    //Stop method for car
    public void stop() {
        //declare the variable to 0 since it has to be 0 to stop.
        this.currentVelocity = 0;
    }

}
