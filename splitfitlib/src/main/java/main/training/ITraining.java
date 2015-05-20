package main.training;

import java.util.Date;

import main.planning.IPlan;

/**
 * Created by jonas on 20/05/2015.
 */
public interface ITraining {
    public Date getStart();
    public void setStart(Date start);
    public Date getEnd();
    public void setEnd(Date end);
}
