package main.training;

import java.util.ArrayList;
import java.util.Date;

import main.planning.IExercise;

/**
 * Created by jonas on 05/05/2015.
 * Not to be read or used by anyone but jonas.
 */
public interface Training {
    ArrayList<IExercise> getExercises();
    void setExercises(ArrayList<IExercise> IExercises);

    Date getDay();
    void setDay(Date date);
}