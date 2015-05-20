package main;

import java.time.Instant;
import java.util.Date;

import main.planning.Exercise;
import main.planning.IExercise;
import main.planning.IPlan;
import main.planning.IPlanStore;
import main.planning.Plan;
import main.planning.PlanStore;
import main.training.IRecord;
import main.training.ITraining;
import main.training.ITrainingExercise;
import main.training.Record;
import main.training.Training;
import main.training.TrainingExercise;
import main.training.TrainingSaverXML;

/**
 * Created by jonas on 20/05/2015.
 */
public class DemoTrainingUseClass {
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

        // create a new Training, because you hit the gym today. Training is based on the plan we made
        ITraining training = new Training(plan);

        // let the training start right away
        training.setStart(Date.from(Instant.now()));

        // choose an Exercise
        ITrainingExercise trainingExercise = new TrainingExercise();

        // the exercise is done 3 times, with 8reps and weight set to 20
        IRecord record1 = new Record();
        record1.setRepetitions(8);
        record1.setWeight(20);

        IRecord record2 = new Record();
        record2.setRepetitions(8);
        record2.setWeight(20);

        IRecord record3 = new Record();
        record3.setRepetitions(8);
        record3.setWeight(20);

        // add these records to the exercise
        trainingExercise.add(record1);
        trainingExercise.add(record2);
        trainingExercise.add(record3);

        // the training is now over
        training.setEnd(Date.from(Instant.now()));

        // save the workout
        new TrainingSaverXML().save(training);
    }
}
