package org.fasttrack.curs18.carshop;

import org.springframework.stereotype.Component;

@Component
public class Engine {
    private String nume;

    public Engine() {
        this.nume = "implicit";
    }

    public Engine(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }
}
