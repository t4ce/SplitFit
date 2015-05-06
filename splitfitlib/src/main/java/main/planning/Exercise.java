package main.planning;

/**
 * Created by jonas on 06/05/2015.
 */
public class Exercise implements IExercise {
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
