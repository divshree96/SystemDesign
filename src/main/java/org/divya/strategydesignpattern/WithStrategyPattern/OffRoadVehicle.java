package org.divya.strategydesignpattern.WithStrategyPattern;

import org.divya.strategydesignpattern.WithStrategyPattern.Strategy.DriveStrategy;
import org.divya.strategydesignpattern.WithStrategyPattern.Strategy.SportsDrive;

public class OffRoadVehicle extends Vehicle{

    public OffRoadVehicle() {
        super(new SportsDrive());
    }
}
