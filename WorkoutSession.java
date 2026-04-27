import java.util.*;

public class WorkoutSession {
    private Workout workout;
    private List<SetEntry> setEntries;

    public WorkoutSession(Workout workout) {
        this.workout = workout;
        this.setEntries = new ArrayList<>();
    }

    public void addSetEntry(SetEntry entry) {
        setEntries.add(entry);
    }

    public List<SetEntry> getSetEntries() {
        return setEntries;
    }
}
