package org.sqli.datacleancode.cleanCode;

import java.util.Objects;

/**
 *
 * Prefer class hierarchies to tagged classes
 *
 * tagged classes are verbose, error-prone, and inefficient
 */
class UserKo {
    private String name;
    private String cne;
    private String cin;
    private String type;
    // other properties for each type of user

    public String getId() {
        return Objects.nonNull(type) && type.equals("student") ? cne : cin;
    }
}

abstract class UserOk {
    private int id;
    private String name;

    protected abstract String getId();
}

class Student extends UserOk {
    private String cne;

    @Override
    protected String getId() {
        return cne;
    }
}

class Prof extends UserOk {
    private String cin;

    @Override
    protected String getId() {
        return cin;
    }
}

public class Exp09 {
}
