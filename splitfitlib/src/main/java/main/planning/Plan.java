package main.planning;

import java.util.ArrayList;

/**
 * Created by jonas on 06/05/2015.
 */
public class Plan implements IPlan {
    ArrayList<IExercise> exercises;
    private String name;

    @Override
    public ArrayList<IExercise> getExercises() {
        return exercises;
    }

    @Override
    public void setExercises(ArrayList<IExercise> exercises) {
        this.exercises = exercises;
    }

    @Override
    public void addExercise(IExercise exercise) {
        exercises.add(exercise);
    }

    @Override
    public void removeExercise(IExercise exercise) {
        exercises.remove(exercise);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
