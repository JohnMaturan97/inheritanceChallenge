package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Subaru subaru = new Subaru(36);
        subaru.steer(45);
        //print by accclerating
        subaru.accelerate(30);
        //print by adding
        subaru.accelerate(20);
        subaru.accelerate(-42);

    }
}
