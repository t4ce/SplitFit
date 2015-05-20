package main.training;

import main.types.WeightUnit;

/**
 * Created by jonas on 05/05/2015.
 * Not to be read or used by anyone but jonas.
 */
public interface IRecord {
    WeightUnit getWeightUnit();
    void setWeightUnit(WeightUnit weightUnit);

    int getWeight();
    void setWeight(int weight);

    int getRepetitions();
    void setRepetitions(int repetitions);
}
