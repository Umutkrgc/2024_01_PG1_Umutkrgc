package chapter01;
public class Exercise12 {
    public static void main(String[] args) {
        //speed=distance/time
        //1mil=1.6km
        double distance = 24 * 1.6;
        double time = 100.35 / 60;
        double speed = distance / time;
        System.out.println("km/hour= " + speed);
    }
}
