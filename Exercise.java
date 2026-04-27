public class Exercise {
    private String name;
    private String muscleGroup;
    private int defaultSets;
    private int defaultReps;

    public Exercise(String name, String muscleGroup, int sets, int reps) {
        this.name = name;
        this.muscleGroup = muscleGroup;
        this.defaultSets = sets;
        this.defaultReps = reps;
    }

    public String getName() { return name; }
    public int getDefaultSets() { return defaultSets; }
}
