package com.james.util;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * Created by jpowel on 15/03/2017.
 */
@Component
public class TPSHealth implements HealthIndicator{
    TPSCounter tpsCounter = new TPSCounter();

    @Override
    public Health health() {
        if (tpsCounter.isWeak()) {
            return Health.outOfService().withDetail("Too many requests", "OutOfService").build();
        }
        return Health.up().build();
    }

    public void updateTx() {
        if (tpsCounter == null || tpsCounter.isExpired()) {
            tpsCounter = new TPSCounter();
        }
        tpsCounter.increment();
    }
}
