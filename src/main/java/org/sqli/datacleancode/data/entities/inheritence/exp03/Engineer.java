package org.sqli.datacleancode.data.entities.inheritence.exp03;

import org.sqli.datacleancode.data.entities.TechnologyEnum;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity(name = "engineer_singleclass")
@DiscriminatorValue("E")
public class Engineer  extends User {

    @Enumerated(EnumType.STRING)
    private TechnologyEnum technology;
}
