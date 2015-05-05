package planning;

import java.util.ArrayList;

/**
 * Created by jonas on 05/05/2015.
 * Not to be read or used by anyone but jonas.
 */
public interface Plan {
    ArrayList<Exercise> getExercises();
    void setExercises(ArrayList<Exercise> exercises);
    void addExercise(Exercise exercise);
    void removeExercise(Exercise exercise);
}
