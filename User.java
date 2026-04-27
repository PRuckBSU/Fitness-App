import java.util.*;

public class User {
    private String username;
    private List<Workout> workouts;
    private List<WorkoutSession> sessions;
    private ProgressTracker tracker;

    public User(String username) {
        this.username = username;
        this.workouts = new ArrayList<>();
        this.sessions = new ArrayList<>();
        this.tracker = new ProgressTracker(sessions);
    }

    public void addWorkout(Workout workout) {
        workouts.add(workout);
    }

    public void addSession(WorkoutSession session) {
        sessions.add(session);
    }

    public List<Workout> getWorkouts() {
        return workouts;
    }

    public ProgressTracker getProgressTracker() {
        return tracker;
    }
}
