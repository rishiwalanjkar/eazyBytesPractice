package org.eazybytes.implementation;

import org.eazybytes.interfaces.Tyre;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyre implements Tyre {
    @Override
    public String rotate() {
        return "Vehicle moving with BridgeStone Tyre";
    }
}
