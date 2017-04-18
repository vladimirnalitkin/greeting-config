package io.pivotal.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by vnalitkin on 4/17/17.
 */
@ConfigurationProperties(prefix = "greeting")
public class GreetingProperties {
    @Getter
    @Setter
    private boolean displayFortune;
}
