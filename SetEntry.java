public class SetEntry {
    private double weight;
    private int reps;
    private int setNumber;
    private Exercise exercise;

    public SetEntry(double weight, int reps, int setNumber, Exercise exercise) {
        this.weight = weight;
        this.reps = reps;
        this.setNumber = setNumber;
        this.exercise = exercise;
    }

    public double getWeight() { return weight; }
    public int getReps() { return reps; }
    public Exercise getExercise() { return exercise; }
}
