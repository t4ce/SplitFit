package org.jonas.fitlib.planning;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by jonas on 06/05/2015.
 */
public class Plan extends ArrayList<IExercise> implements IPlan {
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}