package org.jonas.fitlib.training;

import org.jonas.fitlib.types.WeightUnit;

/**
 * Created by jonas on 06/05/2015.
 */
public class Record implements IRecord{
    private WeightUnit weightUnit;
    private int weight;
    private int repetitions;

    @Override
    public WeightUnit getWeightUnit() {
        return weightUnit;
    }

    @Override
    public void setWeightUnit(WeightUnit weightUnit) {
        this.weightUnit = weightUnit;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int getRepetitions() {
        return repetitions;
    }

    @Override
    public void setRepetitions(int repetitions) {
        this.repetitions = repetitions;
    }
}
