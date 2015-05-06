package main.planning;

import java.util.ArrayList;

/**
 * Created by jonas on 06/05/2015.
 */
public class PlanStore implements IPlanStore {
    ArrayList<IPlan> IPlans;

    @Override
    public ArrayList<IPlan> getIPlans() {
        return IPlans;
    }

    @Override
    public void setIPlans(ArrayList<IPlan> IPlans) {
        this.IPlans = IPlans;
    }

    @Override
    public void addPlan(IPlan IPlan) {
        IPlans.add(IPlan);
    }

    @Override
    public void removePlan(IPlan IPlan) {
        IPlans.remove(IPlan);
    }
}
