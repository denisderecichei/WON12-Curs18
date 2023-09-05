package org.fasttrack.curs18.carshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
    //    @Autowired
    private Engine engine;

    @Autowired
    public Car(@Qualifier("getBenzinaEngine") Engine engine) {
        this.engine = engine;
    }

    //    @Autowired
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car() {
    }

    public Engine getEngine() {
        return engine;
    }
}
