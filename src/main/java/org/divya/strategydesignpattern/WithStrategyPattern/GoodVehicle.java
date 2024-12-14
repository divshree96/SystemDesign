package org.divya.strategydesignpattern.WithStrategyPattern;

import org.divya.strategydesignpattern.WithStrategyPattern.Strategy.NormalDrive;

public class GoodVehicle extends Vehicle{
    public GoodVehicle() {
        super(new NormalDrive());
    }
}
