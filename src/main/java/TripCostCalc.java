import java.util.Scanner;

public class TripCostCalc {
    private double distance;
    private double fuelEfficiency;
    private double fuelCost;

    public TripCostCalc(double distance, double fuelEfficiency, double fuelCost) {
        this.distance = distance;
        this.fuelEfficiency = fuelEfficiency;
        this.fuelCost = fuelCost;
    }

    public double calculateCost() {
        return (distance / 100) * fuelEfficiency * fuelCost;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance (km): ");
        double distance = scanner.nextDouble();

        System.out.print("Enter fuel efficiency (liters per 100 km): ");
        double fuelEfficiency = scanner.nextDouble();

        System.out.print("Enter fuel cost (per liter): ");
        double fuelCost = scanner.nextDouble();

        TripCostCalc tripCostCalc = new TripCostCalc(distance, fuelEfficiency, fuelCost);
        System.out.println("The trip cost is: " + tripCostCalc.calculateCost());
    }
}
