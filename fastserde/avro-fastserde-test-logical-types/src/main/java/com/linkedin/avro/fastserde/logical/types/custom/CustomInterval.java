/*
 * Copyright 2023 LinkedIn Corp.
 * Licensed under the BSD 2-Clause License (the "License").
 * See License in the project root for license information.
 */

package com.linkedin.avro.fastserde.logical.types.custom;

public class CustomInterval {

    private final int months;
    private final int days;
    private final long millis;

    public CustomInterval(int months, int days, long millis) {
        this.months = months;
        this.days = days;
        this.millis = millis;
    }

    public int getMonths() {
        return months;
    }

    public int getDays() {
        return days;
    }

    public long getMillis() {
        return millis;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d, %d)", months, days, millis);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomInterval that = (CustomInterval) o;

        if (months != that.months) return false;
        if (days != that.days) return false;
        return millis == that.millis;
    }

    @Override
    public int hashCode() {
        int result = months;
        result = 31 * result + days;
        result = 31 * result + (int) (millis ^ (millis >>> 32));
        return result;
    }
}
