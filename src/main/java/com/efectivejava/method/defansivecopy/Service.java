package com.efectivejava.method.defansivecopy;

import java.util.Date;

public class Service {

    public static void main(String[] args) {
        Date startDate = new Date();
        Date endDate = new Date();
        Period period = new Period(startDate,endDate);
        System.out.println(period);
        startDate.setYear(88);
        endDate.setTime(90);
        System.out.println(period);

        Date startDateV2 = new Date();
        Date endDateV2 = new Date();
        PeriodV2 periodV2 = new PeriodV2(startDateV2,endDateV2);
        System.out.println(periodV2);
        startDateV2.setYear(88);
        endDateV2.setTime(90);
        System.out.println(periodV2);
    }



}
