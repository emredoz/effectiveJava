package com.efectivejava.immutable;

import java.util.Objects;

public class NonImmutablePerson {
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public NonImmutablePerson(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NonImmutablePerson)) return false;
        NonImmutablePerson that = (NonImmutablePerson) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
