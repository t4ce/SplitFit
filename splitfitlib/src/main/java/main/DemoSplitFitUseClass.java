package main;

import main.planning.*;

/**
 * Created by jonas on 06/05/2015.
 */
public class DemoSplitFitUseClass {

    public void doSomething(){
        // creating a new PlanStore
        IPlanStore planStore = new PlanStore();

        // creating the Plan
        IPlan plan = new Plan();

        // creating some Exercises
        IExercise exerciseA = new Exercise();
        IExercise exerciseB = new Exercise();
        IExercise exerciseC = new Exercise();

        // naming everything
        plan.setName("My first Plan");
        exerciseA.setName("Sit-Ups");
        exerciseB.setName("Bench-Press");
        exerciseC.setName("Running");

        // assign relations
        planStore.addPlan(plan);
        plan.addExercise(exerciseA);
        plan.addExercise(exerciseB);
        plan.addExercise(exerciseC);
    }
}