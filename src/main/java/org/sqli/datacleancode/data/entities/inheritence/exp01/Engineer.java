package org.sqli.datacleancode.data.entities.inheritence.exp01;

import org.sqli.datacleancode.data.TechnologyEnum;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class Engineer  extends User{

    private TechnologyEnum technology;
}
