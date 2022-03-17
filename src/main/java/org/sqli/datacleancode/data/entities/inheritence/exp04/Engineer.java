package org.sqli.datacleancode.data.entities.inheritence.exp04;

import org.sqli.datacleancode.data.entities.TechnologyEnum;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity(name = "engineer_join")
public class Engineer  extends User {

    @Enumerated(EnumType.STRING)
    private TechnologyEnum technology;
}
