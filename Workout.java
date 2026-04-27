import java.util.*;

public class Workout {
    private String name;
    private List<Exercise> exercises;

    public Workout(String name) {
        this.name = name;
        this.exercises = new ArrayList<>();
    }

    public void addExercise(Exercise ex) {
        exercises.add(ex);
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    public String getName() {
        return name;
    }
}
