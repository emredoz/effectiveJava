package com.efectivejava.method.defansivecopy;

import java.util.Date;

public class PeriodV2 {
    private final Date startDate;
    private final Date endDate;

    public PeriodV2(Date startDate, Date endDate) {
        this.startDate = new Date(startDate.getTime());
        this.endDate = new Date(endDate.getTime());
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    @Override
    public String toString() {
        return "Period{" +
            "startDate=" + startDate +
            ", endDate=" + endDate +
            '}';
    }
}