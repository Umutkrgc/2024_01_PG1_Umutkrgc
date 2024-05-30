package chapter01;

public class Exercise10 {
    public static void main(String[] args) {
        //Assume a runner runs 14 kilometers in 45 minutes and 30
        //seconds. Write a program that displays the average speed in miles per hour.
        //hiz=mesafe/zaman
        //speed=distance/time
        double distance = 14 / 1.6;
        double time = 60 / 45.30;
        double speed = distance / time;
        System.out.println("mil/h= " + speed);
    }
}
