public class EarthVolume {
    public static void main(String[] args) {
        double radius = 6371; // Radius of the Earth in kilometers
        double volume = (4/3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("The volume of the Earth is approximately " + volume + " cubic kilometers.");
    }
}
