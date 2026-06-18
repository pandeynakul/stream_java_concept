package com.app.java8;

/* Created by Ankul Deshpande on 25-05-2026 14:11 */

import java.time.LocalDate;
import java.time.Period;

public class FindAgeDateApi {

    public static void main(String[] args) {
        //birthdate is given
        LocalDate localDate = LocalDate.parse("1990-07-08");
        LocalDate currentDate = LocalDate.now();
        Period calAge = Period.between(localDate,currentDate);
        System.out.println(calAge.getYears());
    }
}
