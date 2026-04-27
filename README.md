# Workout Tracker System

## Overview

Workout Tracker is a Java-based command-line application designed to help users create, manage, and track workout routines. Users can build custom workouts, log sets and reps during sessions, and analyze progress over time.

This project demonstrates core concepts from CS 121, including object-oriented programming, data structures, and algorithm design.



## Features

* Create custom workout plans (Push, Pull, Legs, etc.)
* Add exercises with sets and reps
* Log workout sessions with weight and reps
* Track progress (max weight per exercise)
* Simple command-line interface



## Technologies Used

* Java (JDK 17 or later)
* Command-Line Interface (CLI)
* ArrayLists and HashMaps for data storage



## Object-Oriented Design

### OOP Principles Used

* **Encapsulation**: All class data is private with public access methods
* **Composition**: WorkoutSession contains SetEntry objects
* **Aggregation**: User contains Workouts and WorkoutSessions
* **Abstraction**: Classes separate logic and data handling
* **Polymorphism (Extensible)**: Exercise class can be extended (e.g., StrengthExercise)



## Project Structure

```
WorkoutTracker/
─ Main.java
─ User.java
─ Workout.java
─ Exercise.java
─ WorkoutSession.java
─ SetEntry.java
─ ProgressTracker.java
─ Makefile
```



## UML Diagram

The UML diagram shows relationships between:

```
+-------------------+
|       User        |
+-------------------+
| id : String       |
| username : String |
+-------------------+

        1
        |
        | has
        |
        v

+----------------------+
|       Workout        |
+----------------------+
| id : String          |
| name : String        |
| date : Date          |
+----------------------+

        1
        |
        | contains
        |
        v

+----------------------+
|      Exercise        |
+----------------------+
| id : String          |
| name : String        |
| muscleGroup : String |
| defaultSets : int    |
| defaultReps : int    |
+----------------------+

User
  |
  | logs
  | 1..*
  v

+---------------------------+
|    WorkoutSession         |
+---------------------------+
| id : String               |
| timestamp : DateTime      |
+---------------------------+

        |
        | contains
        | 1..*
        v

+---------------------------+
|       SetEntry            |
+---------------------------+
| id : String               |
| weight : double           |
| reps : int                |
| setNumber : int           |
+---------------------------+

Exercise
   ^
   |
   | performed in
   |
SetEntry

User
  |
  | tracks
  |
  v

+---------------------------+
|   ProgressTracker         |
+---------------------------+
| id : String               |
+---------------------------+
```



## Use Case Analysis

### Target Users

* Students or individuals tracking workouts
* Beginners learning fitness consistency
* Anyone wanting a simple tracking system

### User Goals

* Create workouts
* Log exercises and sets
* Track strength improvements over time

### Example Flow

1. User creates a workout
2. User adds exercises
3. User starts a workout session
4. User logs sets and reps
5. User views progress



## Algorithm Summary

### 1. Create Workout

* Input workout name
* Loop to add exercises
* Store exercises in ArrayList
* Add workout to user

### 2. Start Workout Session

* Select workout
* Iterate through exercises
* For each set:

  * Input weight and reps
  * Store as SetEntry
* Save session

### 3. Track Progress

* Iterate through all sessions
* Store max weight per exercise using HashMap
* Display results



## How to Compile and Run

### Option 1 (Recommended)

```
make run
```

### Option 2 (Manual)

```
javac *.java
java Main
```



## Requirements

* Java JDK installed
* Terminal/CLI access



## Testing

The program was tested with:

* Creating multiple workouts
* Logging multiple sessions
* Tracking max weights across sessions
* Handling empty workout cases



## Future Improvements

* Save/load data from files
* Input validation
* GUI interface
* More detailed analytics (volume, PR tracking)



## Author

Pryce Rucker
CS 121 Final Project



