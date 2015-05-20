package main.training;

import java.util.ArrayList;
import java.util.Date;

import main.planning.IExercise;
import main.planning.IPlan;

/**
 * Created by jonas on 06/05/2015.
 */
public class Training extends ArrayList<IExercise> implements ITraining{
    private Date start;
    private Date end;

    private IPlan plan;

    public Training(IPlan plan){
        this.plan = plan;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }
}
