package org.eazybytes.implementations;

import org.eazybytes.interfaces.Tyre;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class BridgeStoneTyre implements Tyre {
    @Override
    public String rotate() {
        return "Vehicle is moving with Bridge Stone Tyre...";
    }
}
