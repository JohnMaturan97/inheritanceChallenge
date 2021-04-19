package academy.learnprogramming;

//To inherit from Car Class
public class Subaru extends Car{
    //Add one field
    private int roadServiceMonths;

    //Declare the constructor while it also automatically input the parameters from Car Class. Delete the parameters
    //from the subura() class once the super(parameters) are defined
    public Subaru(int roadServiceMonths) {
        super("Subaru","4WD", 4, 4, 6, false); //Defined the variables
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rateSpeed) {
        //Declare new velocity
        int newVelocity = getCurrentVelocity() + rateSpeed;
        if(newVelocity == 0) {
            stop();
            changeGear(1);

            //Create condition
        } else if(newVelocity > 0 && newVelocity <= 10) {
            //change the gear if velocity falls on this category
            changeGear(1);
        } else if(newVelocity > 10 && newVelocity <= 20) {
            changeGear(2);
        } else if(newVelocity > 20 && newVelocity <= 30) {
            changeGear(3);
        } else {
            changeGear(4);
        }

        //Test if newVelocity is less than 0
        if(newVelocity > 0 ) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
