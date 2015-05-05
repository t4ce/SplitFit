package training;

import java.util.ArrayList;
import java.util.Date;

import planning.Exercise;

/**
 * Created by jonas on 05/05/2015.
 * Not to be read or used by anyone but jonas.
 */
public interface Training {
    ArrayList<Exercise> getExercises();
    void setExercises(ArrayList<Exercise> exercises);

    Date getDay();
    void setDay(Date date);
}