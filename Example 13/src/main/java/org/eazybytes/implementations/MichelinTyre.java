package org.eazybytes.implementations;

import org.eazybytes.interfaces.Tyre;
import org.springframework.stereotype.Component;

@Component
public class MichelinTyre implements Tyre {
    @Override
    public String rotate() {
        return "Vehicle is moving with Michelin Tyre...";
    }
}

