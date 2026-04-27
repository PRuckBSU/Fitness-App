import java.util.*;

public class ProgressTracker {
    private List<WorkoutSession> sessions;

    public ProgressTracker(List<WorkoutSession> sessions) {
        this.sessions = sessions;
    }

    // Algorithm: Find max weight per exercise
    public void displayHistory() {
        Map<String, Double> maxWeights = new HashMap<>();

        for (WorkoutSession session : sessions) {
            for (SetEntry set : session.getSetEntries()) {
                String name = set.getExercise().getName();
                maxWeights.put(name,
                        Math.max(maxWeights.getOrDefault(name, 0.0), set.getWeight()));
            }
        }

        System.out.println("\n--- Progress ---");
        for (String ex : maxWeights.keySet()) {
            System.out.println(ex + " max: " + maxWeights.get(ex));
        }
    }
}
