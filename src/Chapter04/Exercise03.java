package Chapter04;

import java.lang.Math;

public class Exercise03 {
    public static void main(String[] args) {
        double georgiaAtlantaLatitude = 33.7490;
        double georgiaAtlantaLongitude = -84.3880;
        double floridaOrlandoLatitude = 28.5383;
        double floridaOrlandoLongitude = -81.3792;
        double georgiaSavannahLatitude = 32.0809;
        double georgiaSavannahLongitude = -81.0912;
        double northCarolinaCharlotteLatitude = 35.2271;
        double northCarolinaCharlotteLongitude = -80.8431;
        double distanceAtlantaOrlando = calculateDistance(georgiaAtlantaLatitude, georgiaAtlantaLongitude, floridaOrlandoLatitude, floridaOrlandoLongitude);
        double distanceOrlandoSavannah = calculateDistance(floridaOrlandoLatitude, floridaOrlandoLongitude, georgiaSavannahLatitude, georgiaSavannahLongitude);
        double distanceSavannahCharlotte = calculateDistance(georgiaSavannahLatitude, georgiaSavannahLongitude, northCarolinaCharlotteLatitude, northCarolinaCharlotteLongitude);
        double distanceCharlotteAtlanta = calculateDistance(northCarolinaCharlotteLatitude, northCarolinaCharlotteLongitude, georgiaAtlantaLatitude, georgiaAtlantaLongitude);
        double totalArea = calculateArea(distanceAtlantaOrlando, distanceOrlandoSavannah, distanceSavannahCharlotte, distanceCharlotteAtlanta);

        System.out.println("Atlanta Latitude: " + georgiaAtlantaLatitude + ", Longitude: " + georgiaAtlantaLongitude);
        System.out.println("Orlando Latitude: " + floridaOrlandoLatitude + ", Longitude: " + floridaOrlandoLongitude);
        System.out.println("Savannah Latitude: " + georgiaSavannahLatitude + ", Longitude: " + georgiaSavannahLongitude);
        System.out.println("Charlotte Latitude: " + northCarolinaCharlotteLatitude + ", Longitude: " + northCarolinaCharlotteLongitude);

        System.out.println("Estimated area enclosed by the four cities: " + totalArea + " square miles");
    }

    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double calculateArea(double side1, double side2, double side3, double side4) {
        double s = (side1 + side2 + side3 + side4) / 2;
        return Math.sqrt((s - side1) * (s - side2) * (s - side3) * (s - side4));
    }

}
