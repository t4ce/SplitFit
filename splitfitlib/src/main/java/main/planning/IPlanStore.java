package main.planning;

import java.util.ArrayList;

/**
 * Created by jonas on 06/05/2015.
 * Not to be read or used by anyone but jonas.
 */
public interface IPlanStore {
    // Setter und Getter für alle Fitnesspläne
    public ArrayList<IPlan> getIPlans();
    public void setIPlans(ArrayList<IPlan> IPlans);
    void addPlan(IPlan IPlan);
    void removePlan(IPlan IPlan);
}
