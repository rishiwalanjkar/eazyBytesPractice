package org.eazybytes.implementation;

import org.eazybytes.interfaces.Tyre;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichelinTyre implements Tyre {
    @Override
    public String rotate() {
        return "Vehicle moving with the help of Michelin Tyre";
    }

    @Override
    public String stop() {
        return "Vehicle stopped with the help of Michelin Tyre";
    }
}
