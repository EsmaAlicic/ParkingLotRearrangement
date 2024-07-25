import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Unos početnog stanja parkinga
        System.out.println("Enter the initial state of the parking (numbers separated by space):");
        int[] initialState = Arrays.stream(scanner.nextLine().split(" "))
                                   .mapToInt(Integer::parseInt)
                                   .toArray();
        
        // Unos završnog stanja parkinga
        System.out.println("Enter the target state of the parking (numbers separated by space):");
        int[] targetState = Arrays.stream(scanner.nextLine().split(" "))
                                  .mapToInt(Integer::parseInt)
                                  .toArray();

        // Kreiranje objekta ParkingLot i pronalaženje koraka
        ParkingLot parkingLot = new ParkingLot(initialState, targetState);
        List<int[]> steps = parkingLot.solve();

        // Ispis rezultata
        System.out.println("Initial state: " + Arrays.toString(initialState).replaceAll("[\\[\\],]", ""));
        int numberOfSteps = steps.size() - 1;
        System.out.println("Number of steps: " + numberOfSteps);
        
        for (int i = 1; i < steps.size(); i++) {
            System.out.print("Step " + i + ": ");
            System.out.println(Arrays.toString(steps.get(i)).replaceAll("[\\[\\],]", ""));
        }
    }
}
