import java.util.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static User user = new User("Pryce");

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Workout Tracker ---");
            System.out.println("1. Create Workout");
            System.out.println("2. Start Workout");
            System.out.println("3. View Progress");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> createWorkout();
                case 2 -> startWorkout();
                case 3 -> user.getProgressTracker().displayHistory();
                case 4 -> System.exit(0);
            }
        }
    }

    // Algorithm: Create workout and add exercises
    private static void createWorkout() {
        System.out.print("Workout name: ");
        String name = scanner.nextLine();

        Workout workout = new Workout(name);

        while (true) {
            System.out.print("Add exercise (or type 'done'): ");
            String exName = scanner.nextLine();
            if (exName.equalsIgnoreCase("done")) break;

            System.out.print("Muscle group: ");
            String group = scanner.nextLine();

            System.out.print("Default sets: ");
            int sets = scanner.nextInt();

            System.out.print("Default reps: ");
            int reps = scanner.nextInt();
            scanner.nextLine();

            workout.addExercise(new Exercise(exName, group, sets, reps));
        }

        user.addWorkout(workout);
        System.out.println("Workout created.");
    }

    // Algorithm: Log a workout session with sets
    private static void startWorkout() {
        if (user.getWorkouts().isEmpty()) {
            System.out.println("No workouts available.");
            return;
        }

        System.out.println("Choose workout:");
        for (int i = 0; i < user.getWorkouts().size(); i++) {
            System.out.println(i + ": " + user.getWorkouts().get(i).getName());
        }

        int choice = scanner.nextInt();
        scanner.nextLine();

        Workout workout = user.getWorkouts().get(choice);
        WorkoutSession session = new WorkoutSession(workout);

        for (Exercise ex : workout.getExercises()) {
            System.out.println("Logging: " + ex.getName());

            for (int i = 1; i <= ex.getDefaultSets(); i++) {
                System.out.print("Weight: ");
                double weight = scanner.nextDouble();

                System.out.print("Reps: ");
                int reps = scanner.nextInt();

                session.addSetEntry(new SetEntry(weight, reps, i, ex));
            }
        }

        user.addSession(session);
        System.out.println("Workout logged.");
    }
}
