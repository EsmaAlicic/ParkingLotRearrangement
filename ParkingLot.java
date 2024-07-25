import java.util.*;

public class ParkingLot {
    private int[] initialState;
    private int[] targetState;

    // Konstruktor za inicijalizaciju početnog i završnog stanja
    public ParkingLot(int[] initial, int[] target) {
        this.initialState = initial;
        this.targetState = target;
    }

    // Metod za rješavanje problema
    public List<int[]> solve() {
        List<int[]> steps = new ArrayList<>();
        Set<String> visitedStates = new HashSet<>();
        Queue<int[]> queue = new LinkedList<>();
        
        // Dodavanje početnog stanja u red i set
        queue.add(initialState);
        visitedStates.add(Arrays.toString(initialState));
        steps.add(initialState.clone());

        // BFS algoritam za pronalaženje minimalnog broja koraka
        while (!queue.isEmpty()) {
            int[] currentState = queue.poll();

            // Provjera da li je trenutno stanje isto kao završno stanje
            if (Arrays.equals(currentState, targetState)) {
                break;
            }

            // Traženje praznog mjesta i mogućih pomjeranja automobila
            for (int i = 0; i < currentState.length; i++) {
                if (currentState[i] == 0) {
                    if (i > 0) {
                        // Pomjeranje automobila lijevo
                        int[] newState = currentState.clone();
                        newState[i] = newState[i - 1];
                        newState[i - 1] = 0;
                        String stateString = Arrays.toString(newState);
                        if (!visitedStates.contains(stateString)) {
                            queue.add(newState);
                            visitedStates.add(stateString);
                            steps.add(newState.clone());
                        }
                    }
                    if (i < currentState.length - 1) {
                        // Pomjeranje automobila desno
                        int[] newState = currentState.clone();
                        newState[i] = newState[i + 1];
                        newState[i + 1] = 0;
                        String stateString = Arrays.toString(newState);
                        if (!visitedStates.contains(stateString)) {
                            queue.add(newState);
                            visitedStates.add(stateString);
                            steps.add(newState.clone());
                        }
                    }
                }
            }
        }

        return steps;
    }
}
