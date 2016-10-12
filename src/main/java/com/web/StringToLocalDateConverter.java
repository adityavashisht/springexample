package com.web;

import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by vashishta on 10/12/16.
 */
public class StringToLocalDateConverter implements Converter<String, LocalDate> {

    public LocalDate convert(String source) {

       return getLocalDate(source);
    }


    private LocalDate getLocalDate(String date) {
        LocalDate formatted = null;
        if (StringUtils.hasText(date)) {
            DateTimeFormatter fmt = DateTimeFormatter.ISO_LOCAL_DATE;
            try {
                formatted = LocalDate.parse(date, fmt);
            } catch (Exception ex) {
                // Error converting, ignore, just allow null
            }
        }
        return formatted;

    }
}
