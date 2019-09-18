package com.efectivejava.immutable;

import java.util.Objects;

public final class ImmutablePerson {
    final private long Id;

    public ImmutablePerson(long id) {
        Id = id;
    }

    public long getId() {
        return Id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ImmutablePerson)) return false;
        ImmutablePerson that = (ImmutablePerson) o;
        return Id == that.Id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id);
    }
}
