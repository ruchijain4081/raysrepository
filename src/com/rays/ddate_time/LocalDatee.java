package com.rays.ddate_time;

import java.time.LocalDate;
import java.time.Period;

public class LocalDatee {
public static void main(String[] args) {
LocalDate l= LocalDate.of(1993, 02, 12);
LocalDate now=LocalDate.now();
System.out.println(l);
System.out.println(now);
Period diff =Period.between(l, now);
System.out.println(diff.getYears()+" year "+diff.getMonths()+" Month "+diff.getDays()+" day ");

}
}
