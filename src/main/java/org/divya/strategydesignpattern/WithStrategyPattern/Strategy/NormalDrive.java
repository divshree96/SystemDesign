package org.divya.strategydesignpattern.WithStrategyPattern.Strategy;

public class NormalDrive implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Normal Drive capacity");
    }
}
