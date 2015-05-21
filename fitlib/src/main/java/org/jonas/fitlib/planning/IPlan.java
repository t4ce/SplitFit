package org.jonas.fitlib.planning;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jonas on 05/05/2015.
 * Not to be read or used by anyone but jonas.
 */
public interface IPlan extends List<IExercise> {
    String getName();
    void setName(String name);
}
