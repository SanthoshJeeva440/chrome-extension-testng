package org.calibraint.configSetup;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.FIRST)
@Config.Sources({
        "file:src/main/resources/properties/${env}.properties",
        "file:src/main/resources/properties/qa.properties"

})

public interface Configuration extends Config {

    String browser();

    String username();

    String build();

    String password();

}