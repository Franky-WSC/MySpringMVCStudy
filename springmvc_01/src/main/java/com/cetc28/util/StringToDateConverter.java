package com.cetc28.util;

import org.springframework.core.convert.converter.Converter;

import javax.xml.transform.Source;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: WSC
 * @version: 1.0
 */
public class StringToDateConverter implements Converter<String, Date> {
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    @Override
    public Date convert(String s) {
        Date date = null;
        try {
            date = dateFormat.parse(s);
        } catch (ParseException e) {
            throw new RuntimeException("日期转换异常");
        }
        return date;
    }
}
