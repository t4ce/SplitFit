package main;

import main.planning.*;

/**
 * Created by jonas on 06/05/2015.
 */
public class DemoSplitFitUseClass {
    // creating a new PlanStore
    IPlanStore planStore = new PlanStore();
    // creating the Plan
    IPlan plan = new Plan();
    // creating some Exercises
    IExercise exerciseA = new Exercise();
    IExercise exerciseB = new Exercise();
    IExercise exerciseC = new Exercise();

    // naming everything
    plan.setName("My first Plan.");

}
