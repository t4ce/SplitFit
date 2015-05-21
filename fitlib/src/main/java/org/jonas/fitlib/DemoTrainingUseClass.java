package org.jonas.fitlib;

import java.util.Date;

import org.jonas.fitlib.planning.Exercise;
import org.jonas.fitlib.planning.IExercise;
import org.jonas.fitlib.planning.IPlan;
import org.jonas.fitlib.planning.IPlanStore;
import org.jonas.fitlib.planning.Plan;
import org.jonas.fitlib.planning.PlanStore;
import org.jonas.fitlib.training.IRecord;
import org.jonas.fitlib.training.ITraining;
import org.jonas.fitlib.training.ITrainingExercise;
import org.jonas.fitlib.training.Record;
import org.jonas.fitlib.training.Training;
import org.jonas.fitlib.training.TrainingExercise;
import org.jonas.fitlib.training.TrainingSaverXML;

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
        planStore.add(plan);
        plan.add(exerciseA);
        plan.add(exerciseB);
        plan.add(exerciseC);

        // create a new Training, because you hit the gym today. Training is based on the plan we made
        ITraining training = new Training(plan);

        // let the training start right away
        //training.setStart();

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
        // training.setEnd(Date.from(Instant.now()));

        // save the workout
        new TrainingSaverXML().save(training);
    }
}
