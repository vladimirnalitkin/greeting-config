package io.pivotal.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by vnalitkin on 4/17/17.
 */
public class Quote {
    @Getter
    @Setter
    private String text;

    @Getter
    @Setter
    private String author;
}
