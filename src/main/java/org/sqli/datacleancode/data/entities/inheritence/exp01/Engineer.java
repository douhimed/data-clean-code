package org.sqli.datacleancode.data.entities.inheritence.exp01;

import org.sqli.datacleancode.data.entities.TechnologyEnum;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity(name = "engineer_superclass")
public class Engineer  extends User{

    @Enumerated(EnumType.STRING)
    private TechnologyEnum technology;
}
