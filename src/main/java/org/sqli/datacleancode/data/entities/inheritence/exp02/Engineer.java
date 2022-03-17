package org.sqli.datacleancode.data.entities.inheritence.exp02;

import org.sqli.datacleancode.data.TechnologyEnum;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class Engineer  extends User {

    @Enumerated(EnumType.STRING)
    private TechnologyEnum technology;
}
