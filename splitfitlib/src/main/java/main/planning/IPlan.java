package main.planning;

import java.util.ArrayList;

/**
 * Created by jonas on 05/05/2015.
 * Not to be read or used by anyone but jonas.
 */
public interface IPlan {
    ArrayList<IExercise> getExercises();
    void setExercises(ArrayList<IExercise> exercises);

    void addExercise(IExercise exercise);
    void removeExercise(IExercise exercise);

    String getName();
    void setName(String name);
}
