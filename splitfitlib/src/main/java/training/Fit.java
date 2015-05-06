package training;

import java.util.ArrayList;

import planning.Plan;

/**
 * Created by jonas on 05/05/2015.
 * Not to be read or used by anyone but jonas.
 */
public interface Fit {
    // Setter und Getter für alle Fitnesspläne
    public ArrayList<Plan> getPlans();
    public void setPlans(ArrayList<Plan> plans);
    void addPlan(Plan plan);
    void removePlan(Plan plan);
}
