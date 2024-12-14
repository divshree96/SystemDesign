package org.divya.strategydesignpattern.WithStrategyPattern;

import org.divya.strategydesignpattern.WithStrategyPattern.Strategy.DriveStrategy;
import org.divya.strategydesignpattern.WithStrategyPattern.Strategy.SportsDrive;

public class SportsVehicle extends Vehicle{
    public SportsVehicle() {
        super(new SportsDrive());
    }
}
